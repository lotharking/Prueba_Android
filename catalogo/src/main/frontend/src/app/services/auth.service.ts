import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from '../models/user.module';
import { UsersService } from './users/users.service';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(false);
  UserValidation: Boolean = false;

  get isLoggedIn() {
    return this.loggedIn.asObservable();
  }

  constructor(
    private router: Router,
    private userservice: UsersService
  ) {}

  /**Login user */
  login(user: User) {
    this.userservice.login(user.username, user.password).subscribe(
      data => {
        console.log("RESPUESTA ",data);
        this.UserValidation = data;
        if (data) {
          this.loggedIn.next(true);
          this.router.navigate(['/']);
        } 
        else {
          this.loggedIn.next(false);
          this.router.navigate(['/login']);
        }
      }
    );
  }

  /**Logout user */
  logout() {
    this.loggedIn.next(false);
    this.router.navigate(['/login']);
  }

  /**Validate login state */
  public isAuthenticated(): boolean {
    return this.loggedIn.getValue();
  }
}

import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable } from 'rxjs';
import { User } from '../models/user.module';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private loggedIn: BehaviorSubject<boolean> = new BehaviorSubject<boolean>(false);

  get isLoggedIn() {
    return this.loggedIn.asObservable();
  }

  constructor(
    private router: Router
  ) {}

  /**Login user */
  login(user: User) {
    // this.productsservice.list().subscribe(
    //   data => {
    //     this.Products = data;
    //   }
    // );
    if (user.username != '' && user.password != '' ) {
      this.loggedIn.next(true);
      this.router.navigate(['/']);
    }
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

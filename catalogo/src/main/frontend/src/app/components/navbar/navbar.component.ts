import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.sass']
})
export class NavbarComponent implements OnInit {

  constructor(private authService: AuthService, private router: Router) { }
  public app_name: string = 'BookStore';
  public isLogged: boolean = false;
  ngOnInit() {
    this.getCurrentUser();
  }

  getCurrentUser() {
    
      if (this.authService.isAuth()) {
        console.log('user logged');
        this.isLogged = true;
      } else {
        console.log('NOT user logged');
        this.isLogged = false;
      }
  }

  onLogout() {
  }

  send(): void {
    this.router.navigateByUrl('/');
  }

}

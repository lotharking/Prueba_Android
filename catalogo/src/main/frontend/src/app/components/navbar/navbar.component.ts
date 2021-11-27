import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.sass']
})
export class NavbarComponent implements OnInit {

  constructor(private authService: AuthService) { }
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

}

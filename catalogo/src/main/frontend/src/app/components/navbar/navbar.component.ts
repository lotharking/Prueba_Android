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
  isLogged= this.authService.isAuthenticated;
  ngOnInit() {
    this.getCurrentUser();
  }

  getCurrentUser() {   
    console.log('logged value', this.isLogged);
  }

  onLogout() {
    this.authService.logout;
    console.log('logged value', this.isLogged);
    this.router.navigate(['/login']);
  }

  send(): void {
    this.router.navigateByUrl('/');
  }

}

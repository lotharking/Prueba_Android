import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';
import { CarComponent } from '../car/car.component';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.sass']
})
export class NavbarComponent implements OnInit {

  constructor(private authService: AuthService,
              private carcomponent: CarComponent,
              private router: Router) { }
  ngOnInit() {
  }

  onLogout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  send(): void {
    this.router.navigateByUrl('/');
  }

  search(): void {
    var searchValue = (<HTMLInputElement>document.getElementById("uniqueID")).value;
    this.carcomponent.searchNavBar(searchValue);
  }

}

import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';
import { ProductsService } from 'src/app/services/product/products.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.sass']
})
export class NavbarComponent implements OnInit {

  constructor(private authService: AuthService,
              private productsservice: ProductsService,
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
    this.productsservice.search(searchValue.toUpperCase()).subscribe(
          data => {
            this.productsservice.updateResultList(data);
          }
        );
  }

}

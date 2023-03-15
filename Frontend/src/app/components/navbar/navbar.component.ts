import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';
import { ProductsService } from 'src/app/services/product/products.service';
import { Category } from 'src/app/models/category.model';
import { CategoryService } from 'src/app/services/category/category.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.sass']
})
export class NavbarComponent implements OnInit {

  categories: Category[] = [];

  constructor(private authService: AuthService,
              private productsservice: ProductsService,
              private categoryservice: CategoryService,
              private router: Router) { }
  ngOnInit() {
    this.updateCategories();
  }

  /**Log Out */
  onLogout() {
    this.authService.logout();
    this.router.navigate(['/login']);
  }

  /**Redirect main page */
  send(): void {
    this.router.navigateByUrl('/');
  }

  updateCategories(): void {
    this.categoryservice.list().subscribe(
      data => {
        this.categories = data;
      }
    );
  }

  filter(value: String): void {  
    this.productsservice.search(value.toUpperCase()).subscribe(
      data => {
        this.productsservice.updateResultList(data);
      }
    );
  }

  selectedCategory(id: number): void {
    this.productsservice.searchByCategory(id).subscribe(
      data => {
        this.productsservice.updateResultList(data);
      }
    );    
  }

}

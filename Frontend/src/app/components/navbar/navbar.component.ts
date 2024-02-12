import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';
import { ProductsService } from 'src/app/services/product/products.service';
import { Category } from 'src/app/models/category.model';
import { CategoryService } from 'src/app/services/category/category.service';
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  categories: Category[] = [];
  country: String = '';
  searchValue: string = '';
  supportedLanguages: string[];
  currentLang: string;

  constructor(private authService: AuthService,
              private productsservice: ProductsService,
              private categoryservice: CategoryService,
              private translate: TranslateService,
              private router: Router) {
                this.supportedLanguages = this.translate.getLangs();
                this.currentLang = this.translate.currentLang || this.translate.defaultLang;
              }
  ngOnInit() {
    this.updateCategories();
    this.getCountry();
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

  selectedCategory(id: number): void {
    this.productsservice.searchByCategory(id).subscribe(
      data => {
        this.productsservice.updateResultList(data);
      }
    );    
  }
  
  changeLanguage(lang: string) {
    this.translate.use(lang);
    this.currentLang = lang;
  }

  filter(value: string): void {
    this.productsservice.search(value.toUpperCase()).subscribe(
      data => {
        this.productsservice.updateResultList(data);
      }
    );
  }

  getCountry(): void {
    fetch('https://api.ipregistry.co/?key=tryout')
    .then(function (response) {
        return response.json();
    })
    .then( (payload) => {
      if (payload && payload.location && payload.location.country && payload.location.country.name) {
        this.country = payload.location.country.name;
      } else {
        this.country = 'Colombia'; // Establecer "Colombia" como valor predeterminado
      }
    });
  }

}

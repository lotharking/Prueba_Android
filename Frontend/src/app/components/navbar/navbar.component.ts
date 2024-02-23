import { Component, OnInit } from '@angular/core';
import { AuthService } from '../../services/auth.service'; // Service
import { Router } from '@angular/router';
import { ProductsService } from 'src/app/services/product/products.service';
import { Category } from 'src/app/models/category.model';
import { CategoryService } from 'src/app/services/category/category.service';
import { TranslateService } from '@ngx-translate/core';
import { WishesService } from 'src/app/services/wishes/wishes.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  categories: Category[] = [];
  searchValue: string = '';
  supportedLanguages: string[];
  currentLang: string;

  constructor(private authService: AuthService,
              private productsservice: ProductsService,
              public wishesservice: WishesService,
              private categoryservice: CategoryService,
              private translate: TranslateService,
              private router: Router) {
                this.supportedLanguages = this.translate.getLangs();
                this.currentLang = this.translate.currentLang || this.translate.defaultLang;
              }
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

  /**delete wish */
  delete(id: number=0): void {
    this.wishesservice.delete(id).subscribe(
      data => {
        this.wishesservice.updateResultList(data);
      }
    );
  }

  /**Redirect to history */    
  history(): void {
    this.router.navigateByUrl('/record');
  }

}

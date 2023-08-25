import { Component, OnInit } from '@angular/core';
import { TranslateService } from '@ngx-translate/core';
import { ProductsService } from 'src/app/services/product/products.service';

@Component({
  selector: 'app-navbarbegin',
  templateUrl: './navbarbegin.component.html',
  styleUrls: ['./navbarbegin.component.sass']
})
export class NavbarbeginComponent implements OnInit {

  country: String = '';
  searchValue: string = '';
  supportedLanguages: string[];
  currentLang: string;

  constructor(private productsservice: ProductsService,
              private translate: TranslateService) {
                this.supportedLanguages = this.translate.getLangs();
                this.currentLang = this.translate.currentLang || this.translate.defaultLang;
            }
            
  ngOnInit(): void {
    this.getCountry();
  }
  
  changeLanguage(lang: string) {
    console.log(this.translate.getLangs());
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

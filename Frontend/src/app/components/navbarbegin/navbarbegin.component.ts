import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/product/products.service';

@Component({
  selector: 'app-navbarbegin',
  templateUrl: './navbarbegin.component.html',
  styleUrls: ['./navbarbegin.component.sass']
})
export class NavbarbeginComponent implements OnInit {

  country: String = '';

  constructor(private productsservice: ProductsService,
              private http: HttpClient) { }

  ngOnInit(): void {
    this.getCountry();
  }

  filter(value: String): void {  
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

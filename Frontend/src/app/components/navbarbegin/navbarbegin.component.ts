import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/product/products.service';

@Component({
  selector: 'app-navbarbegin',
  templateUrl: './navbarbegin.component.html',
  styleUrls: ['./navbarbegin.component.sass']
})
export class NavbarbeginComponent implements OnInit {

  pais: String = '';

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
    .then(function (payload) {
        console.log(payload.location.country.name + ', ' + payload.location.city);
    });
  }
  

}

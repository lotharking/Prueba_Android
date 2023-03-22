import { Component, OnInit } from '@angular/core';
import { ProductsService } from 'src/app/services/product/products.service';

@Component({
  selector: 'app-navbarbegin',
  templateUrl: './navbarbegin.component.html',
  styleUrls: ['./navbarbegin.component.sass']
})
export class NavbarbeginComponent implements OnInit {

  constructor(private productsservice: ProductsService,) { }

  ngOnInit(): void {
  }

  filter(value: String): void {  
    this.productsservice.search(value.toUpperCase()).subscribe(
      data => {
        this.productsservice.updateResultList(data);
      }
    );
  }
  

}

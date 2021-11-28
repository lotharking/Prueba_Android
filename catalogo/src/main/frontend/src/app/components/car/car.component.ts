import { Component, OnInit } from '@angular/core';
import { Product } from '../../models/product.model';
import { ProductsService } from '../../services/product/products.service';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.sass']
})
export class CarComponent implements OnInit {

  Products: Product[] = [];

  constructor(private productsservice: ProductsService) { }

  ngOnInit(): void {
    this.uploadProducts();
  }

  uploadProducts(): void {
    this.productsservice.list().subscribe(
      data => {
        this.Products = data;
      }
    );
  }

}

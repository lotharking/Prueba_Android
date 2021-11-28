import { Component, OnInit } from '@angular/core';
import { Wishes } from 'src/app/models/wishes.model';
import { Product } from '../../models/product.model';
import { ProductsService } from '../../services/product/products.service';
import { WishesService } from '../../services/wishes/wishes.service';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.sass']
})
export class CarComponent implements OnInit {

  Products: Product[] = [];
  Wisheses: Wishes[] = [];

  constructor(private productsservice: ProductsService, 
              private wishesservice: WishesService
              ) { }

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

  add(id: number=0): void {
    this.wishesservice.add(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
  }

  less(id: number=0): void {
    this.wishesservice.less(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
  }

  // delete(id: number): void {
  //   this.wishesservice.delete(id).subscribe(
  //     data => {
  //     }
  //   );
  // }

}

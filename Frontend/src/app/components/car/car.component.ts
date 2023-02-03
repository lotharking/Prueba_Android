/**Controller products and wishes */

import { Component, OnInit } from '@angular/core';
import { Wishes } from 'src/app/models/wishes.model';
import { Product } from '../../models/product.model';
import { ProductsService } from '../../services/product/products.service';
import { WishesService } from '../../services/wishes/wishes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.sass']
})

export class CarComponent implements OnInit {

  Products: Product[] = [];
  Wisheses: Wishes[] = [];
  WishesesProblem: Wishes[] = [];

  constructor(public productsservice: ProductsService, 
              private wishesservice: WishesService,
              private router: Router
              ) { }

  ngOnInit(): void {
    this.uploadProducts();
    this.checkWishes();
    this.uploadWishes();
  }

  /**update list product */
  uploadProducts(): void {
    this.productsservice.list().subscribe(
      data => {
        this.Products = data;
      }
    );
  }

  /**update list wish */
  uploadWishes(): void {
    this.wishesservice.list().subscribe(
      data => {
        this.Wisheses = data;
      }
    );
  }

  /**add wish */
  add(id: number=0): void {
    this.wishesservice.add(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
    this.checkWishes();
  }

  /**dismiss wish */
  less(id: number=0): void {
    this.wishesservice.less(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
    this.checkWishes();
  }

  /**delete wish */
  delete(id: number=0): void {
    this.wishesservice.delete(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
    this.checkWishes();
  }

  /**Redirect to history */    
  history(): void {
    this.router.navigateByUrl('/historial');
  }

  /**check wishes list */
  checkWishes(): void {
    this.wishesservice.list().subscribe(
      data => {
        this.WishesesProblem = data;
      }
    );
  }

  updateProductList(product: Product[]): void {
    this.Products = [...product];
  }

}

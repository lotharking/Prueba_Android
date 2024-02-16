/**Controller products and wishes */

import { Component, OnInit } from '@angular/core';
import { Wishes } from 'src/app/models/wishes.model';
import { ProductsService } from '../../services/product/products.service';
import { WishesService } from '../../services/wishes/wishes.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.sass']
})

export class CarComponent implements OnInit {

  Wisheses: Wishes[] = [];

  constructor(public productsservice: ProductsService, 
              private wishesservice: WishesService,
              private router: Router
              ) { }

  /**Load init */
  ngOnInit(): void {
    this.uploadProducts();
    this.uploadWishes();
  }

  /**update list product */
  uploadProducts(): void {
    this.productsservice.list().subscribe(
      data => {
        this.productsservice.updateResultList(data);
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
  }

  /**dismiss wish */
  less(id: number=0): void {
    this.wishesservice.less(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
  }

  /**delete wish */
  delete(id: number=0): void {
    this.wishesservice.delete(id).subscribe(
      data => {
        this.Wisheses = data;
      }
    );
  }

  /**Redirect to history */    
  history(): void {
    this.router.navigateByUrl('/record');
  }
}

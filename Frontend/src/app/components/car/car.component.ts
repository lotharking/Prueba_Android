/**Controller products and wishes */

import { Component, OnInit } from '@angular/core';
import { ProductsService } from '../../services/product/products.service';
import { WishesService } from '../../services/wishes/wishes.service';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.scss']
})

export class CarComponent implements OnInit {

  constructor(public productsservice: ProductsService, 
              public wishesservice: WishesService,
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
        this.wishesservice.updateResultList(data);
      }
    );
  }

  /**add wish */
  add(id: number=0): void {
    this.wishesservice.add(id).subscribe(
      data => {
        this.wishesservice.updateResultList(data);
      }
    );
  }

  /**dismiss wish */
  less(id: number=0): void {
    this.wishesservice.less(id).subscribe(
      data => {
        this.wishesservice.updateResultList(data);
      }
    );
  }
}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http'; // HttpRequest

import { Routes } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { WishlistComponent } from './components/users/wishlist/wishlist.component';
import { HistoryComponent } from './components/users/history/history.component';
import { CarComponent } from './components/car/car.component';
import { Page404Component } from './components/page404/page404.component';
import { DetailsProductComponent } from './components/details-product/details-product.component'; // Routes

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    WishlistComponent,
    HistoryComponent,
    CarComponent,
    Page404Component,
    DetailsProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

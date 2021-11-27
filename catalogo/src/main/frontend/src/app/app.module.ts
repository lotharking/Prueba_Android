import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http'; // HttpRequest

import { Routes } from '@angular/router';
import { NavbarComponent } from './components/navbar/navbar.component';
import { UsersComponent } from './components/users/users.component';
import { WishlistComponent } from './components/users/wishlist/wishlist.component';
import { HistoryComponent } from './components/users/history/history.component';
import { CarComponent } from './components/car/car.component';
import { Page404Component } from './components/page404/page404.component';
import { DetailsProductComponent } from './components/details-product/details-product.component'; // Routes

/**Rutas de la App*/
const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: '**', redirectTo: 'home', pathMatch: 'full' },
//   { path: 'home', component: ListaDestinosComponent },
//   { path: 'destino/:id', component: DestinoDetalleComponent },
//   { path: 'login', component: LoginComponent},
//   { 
//     path: 'protected', 
//     component: ProtectedComponent,
//     canActivate: [ UsuarioLogueadoGuard ]
//   },
//   {
//     path: 'vuelos',
//     component: VuelosComponentComponent,
//     canActivate: [ UsuarioLogueadoGuard ],
//     children: childrenRoutesVuelos
//   }
];
//end routing

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    UsersComponent,
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

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarComponent } from './components/car/car.component';
import { DetailsProductComponent } from './components/details-product/details-product.component';
import { Page404Component } from './components/page404/page404.component';


/**Rutas de la App*/
const routes: Routes = [
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: 'home', component: CarComponent },
  // { path: 'car/:id', component: DetailsProductComponent},
  { path: 'car/1', component: DetailsProductComponent},
  { path: '**', component: Page404Component},
];
//end routing

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

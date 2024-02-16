import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CarComponent } from './components/car/car.component';
import { ContactComponent } from './components/contact/contact.component';
import { LoginComponent } from './components/login/login.component';
import { Page404Component } from './components/page404/page404.component';
import { HistoryComponent } from './components/users/history/history.component';
import { AuthGuard } from './guards/auth.guard';


/**Rutas de la App*/
const routes: Routes = [
  { path: '', component: CarComponent, canActivate: [AuthGuard] },
  { path: 'login', component: LoginComponent },
  { path: 'contactWithUs', component: ContactComponent, canActivate: [AuthGuard] },
  { path: 'record', component: HistoryComponent, canActivate: [AuthGuard] },
  { path: '**', component: Page404Component, canActivate: [AuthGuard] },
];
//end routing

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

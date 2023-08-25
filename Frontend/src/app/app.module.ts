import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

/**HttpRequest */
import { HttpClientModule, HTTP_INTERCEPTORS, HttpClient } from '@angular/common/http';

/**Material desing */
import { MatIconModule } from '@angular/material/icon'

/**Images */
import { IgxCardModule } from "igniteui-angular";

/**Components */
import { NavbarComponent } from './components/navbar/navbar.component';
import { WishlistComponent } from './components/users/wishlist/wishlist.component';
import { HistoryComponent } from './components/users/history/history.component';
import { CarComponent } from './components/car/car.component';
import { Page404Component } from './components/page404/page404.component';
import { ContactComponent } from './components/contact/contact.component';
import { LoginComponent } from './components/login/login.component';
import { AuthService } from './services/auth.service';
import { AuthGuard } from './guards/auth.guard';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BasicAuthInterceptorService } from './services/basic-auth-interceptor.service';
import { NavbarbeginComponent } from './components/navbarbegin/navbarbegin.component';
import { TranslateLoader, TranslateModule } from '@ngx-translate/core';
import { TranslateHttpLoader } from '@ngx-translate/http-loader';

export function HttpLoaderFactory(http: HttpClient) {
  return new TranslateHttpLoader(http, './assets/i18n/', '.json');
}

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    WishlistComponent,
    HistoryComponent,
    CarComponent,
    Page404Component,
    ContactComponent,
    LoginComponent,
    NavbarbeginComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    TranslateModule.forRoot({
      defaultLanguage: 'en',
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    IgxCardModule,
    MatIconModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [AuthService, AuthGuard, CarComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }

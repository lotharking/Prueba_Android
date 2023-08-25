import { Component, Injectable } from '@angular/core';
import { AuthService } from '../app/services/auth.service'
import { TranslateService } from '@ngx-translate/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
@Injectable()
export class AppComponent {
  constructor(private authService: AuthService, 
              private translate: TranslateService
              ) { this.initializeApp(); }
  title = 'Carvajal';

  /** Default values for app */
  initializeApp() {
    this.translate.addLangs(["en", "es"]);
    const browserLang = this.translate.getBrowserLang();
    if (this.translate.getLangs().includes( browserLang )) {
      this.translate.setDefaultLang(browserLang);
      this.translate.use( browserLang )
    }
  };

  /** If logged show navbar */
  isLoggedIn(){
    return this.authService.isAuthenticated();
  }
}
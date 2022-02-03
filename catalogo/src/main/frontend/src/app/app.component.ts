import { Component, Injectable } from '@angular/core';
import { AuthService } from '../app/services/auth.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
@Injectable()
export class AppComponent {
  constructor(private authService: AuthService) {}
  title = 'Carvajal';
  isLoggedIn(){
    console.log('isLoggedIn -this._authService.isLoggedIn():',
      this.authService.isAuthenticated());
    return this.authService.isAuthenticated();
  }
}
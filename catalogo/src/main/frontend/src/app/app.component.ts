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

  /**If logged show navbar */
  isLoggedIn(){
    return this.authService.isAuthenticated();
  }
}
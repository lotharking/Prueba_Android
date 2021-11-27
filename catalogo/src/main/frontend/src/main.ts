// import { enableProdMode } from '@angular/core';
// import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

// import { AppModule } from './app/app.module';
// import { environment } from './environments/environment';

// if (environment.production) {
//   enableProdMode();
// }

// platformBrowserDynamic().bootstrapModule(AppModule)
//   .catch(err => console.error(err));
import { Component } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app works!';
  result = '';

  constructor(private http: Http){
  }

  private sayHello(): void {
    this.result = 'loading...';
    this.http.get(`/api/hello-world`).subscribe(response => this.result = response.text());
  }

}
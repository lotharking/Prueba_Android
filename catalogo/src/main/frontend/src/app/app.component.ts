import { Component, Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
@Injectable()
export class AppComponent {
  title = 'frontend';
  result = '';

  constructor(private http: HttpClient){
  }

  sayHello() {
    this.result = 'loading...';
    return this.http.get('/api/hello-world', { responseType: 'text' }).subscribe(response => this.result = response.toString());
  }
}
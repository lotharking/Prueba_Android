import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/models/user.module';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  users = 'http://localhost:8081/users/';
  header = new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })

  constructor(private httpClient: HttpClient) { }

  /**HttpRequest user unique */
  public login(username: string, password: string): Observable<any> {
    return this.httpClient.post<any>(this.users + 'login', {"username" : `${username}`, "password": `${password}`});
  }
}

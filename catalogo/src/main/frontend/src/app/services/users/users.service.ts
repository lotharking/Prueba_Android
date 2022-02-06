import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UsersService {

  users = 'http://localhost:8080/users/';
  header = new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })

  constructor(private httpClient: HttpClient) { }

  /**HttpRequest user unique */
  public login(username: string, password: string): Observable<any> {
    return this.httpClient.get<any>(this.users + `login/username=${username}&password=${password}`);
  }
}

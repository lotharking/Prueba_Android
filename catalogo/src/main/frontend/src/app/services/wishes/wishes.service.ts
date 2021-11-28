import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WishesService {

  wish = 'http://localhost:8081/whishes/';
  user = 'testUser';

  constructor(private httpClient: HttpClient) { }

  // public list(): Observable<any> {
  //   return this.httpClient.get<any>(this.wish + `list/${this.user}`);
  // }

  // public more(id: number): Observable<any> {
  //   return this.httpClient.post<any>(this.wish + `add/${this.user}/${id}` , data);
  // }

  // public less(id: number): Observable<any> {
  //   return this.httpClient.post<any>(this.wish + `delete/${this.user}/${id}`, data);
  // }

  // public add(id: number): Observable<any> {
  //   return this.httpClient.put<any>(this.wish + `add/${id}`);
  // }

}

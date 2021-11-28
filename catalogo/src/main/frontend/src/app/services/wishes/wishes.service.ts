import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Wishes } from 'src/app/models/wishes.model';

@Injectable({
  providedIn: 'root'
})
export class WishesService {

  wish = 'http://localhost:8080/wish/';

  constructor(private httpClient: HttpClient) { }

  header = new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })

  public add(id: number): Observable<Wishes[]> {
    return this.httpClient.get<Wishes[]>(this.wish + `add/${id}`, 
    { headers : this.header });
  }

  public less(id: number): Observable<Wishes[]> {
    return this.httpClient.get<Wishes[]>(this.wish + `less/${id}`, 
    { headers : this.header });
  }

  public delete(id: number): Observable<any> {
    return this.httpClient.get<any>(this.wish + `delete/${id}`, 
    { headers : this.header });
  }

}

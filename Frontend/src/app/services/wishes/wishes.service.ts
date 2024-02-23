import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';
import { Wishes } from 'src/app/models/wishes.model';

@Injectable({
  providedIn: 'root'
})
export class WishesService {

  wish = 'http://localhost:8080/wish/';

  /** Create observable to share productstList array info by subscribe */
  private wishesList: BehaviorSubject<Wishes[]> = new BehaviorSubject<Wishes[]>(null);
  public wishesSubscribe: Observable<Wishes[]> = this.wishesList.asObservable();

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

  /**HttpRequest list products */
  public list(): Observable<Wishes[]> {
    return this.httpClient.get<Wishes[]>(this.wish + 'list', 
          { headers : this.header });
  }
  
  /**Request for wish filter and update new values */
  updateResultList(updatedList: Wishes[]) {
    this.wishesList.next(updatedList);
  }

  getWishByName(name: String) {
    try {
      return this.wishesList.value.find(wish => wish.product.name === name);
    } catch (error) {
      return null;
    }
  }

}

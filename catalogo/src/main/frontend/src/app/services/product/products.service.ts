import { Injectable } from '@angular/core';

/**Http*/
import { HttpClient, HttpHeaders } from '@angular/common/http';

/**Rxjs */
import { Observable } from 'rxjs'

/**Models */
import { Product } from '../../models/product.model'

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  products = 'http://localhost:8080/productos/';

  constructor( private httpClient: HttpClient) { }

  /**HttpRequest list products */
  public list(): Observable<Product[]> {
    return this.httpClient.get<Product[]>(this.products + 'lista', 
          {headers : new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })});
  }
  
  /**HttpRequest product unique */
  public unique(id: number): Observable<any> {
    return this.httpClient.get<any>(this.products + `search/${id}`);
  }

}

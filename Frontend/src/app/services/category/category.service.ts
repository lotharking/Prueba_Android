import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Category } from 'src/app/models/category.model';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {
  
  categories = 'http://localhost:8080/categories/';
  header = new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' })

  constructor(private httpClient: HttpClient) { }  

  /**HttpRequest list products */
  public list(): Observable<Category[]> {
    return this.httpClient.get<Category[]>(this.categories + 'list', 
          { headers : this.header });
  }
}

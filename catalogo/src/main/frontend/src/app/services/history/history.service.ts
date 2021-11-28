import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { History } from 'src/app/models/history.model';

@Injectable({
  providedIn: 'root'
})
export class HistoryService {  

  history = 'http://localhost:8080/history/';

  constructor(private httpClient: HttpClient) {  }

    header = new HttpHeaders({ 'Content-Type': 'application/x-www-form-urlencoded' });

    /**HttpRequest list products */
    public list(): Observable<History[]> {
      return this.httpClient.get<History[]>(this.history + 'list', 
            { headers : this.header });
    }
}

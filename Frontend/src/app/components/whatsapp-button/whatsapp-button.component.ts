import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-whatsapp-button',
  templateUrl: './whatsapp-button.component.html',
  styleUrls: ['./whatsapp-button.component.css']
})
export class WhatsappButtonComponent implements OnInit {
  whatsappLink: string = '';

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.http.get<string>('/messages/whatsapp-link').subscribe(link => {
      this.whatsappLink = link;
    });
  }
}

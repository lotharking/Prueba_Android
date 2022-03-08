import { Component, OnInit } from '@angular/core';
import { History } from 'src/app/models/history.model';
import { HistoryService } from '../../../services/history/history.service';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.sass']
})
export class HistoryComponent implements OnInit {

  history: History[] = [];

  constructor(private historyservice: HistoryService) { }

  ngOnInit(): void {
    this.uploadHistory();
  }

  uploadHistory(): void {
    this.historyservice.list().subscribe(
      data => {
        this.history = data;
      }
    );
  }

}

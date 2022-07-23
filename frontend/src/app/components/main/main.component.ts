import { Component, OnInit } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  status!: string;

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.getStatus();
  }
  getStatus(): void {
    this.apiService.getStatus().subscribe(response => this.status = response.status);
  }

}

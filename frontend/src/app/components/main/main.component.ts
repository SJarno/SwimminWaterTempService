import { Component, OnInit } from '@angular/core';
import { Feature } from 'src/app/models/feature';
import { FeatureDto } from 'src/app/models/feature-dto';
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
    //this.apiService.getFeatures();
    
  }
  getStatus(): void {
    this.apiService.getStatus().subscribe(response => this.status = response.status);
  }
  

}

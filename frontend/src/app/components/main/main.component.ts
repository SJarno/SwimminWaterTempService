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
  features: FeatureDto[] = []; 

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.getStatus();
    this.getFeatures();
  }
  getStatus(): void {
    this.apiService.getStatus().subscribe(response => this.status = response.status);
  }
  getFeatures(): void {
    const apiResponse = this.apiService.getFeatures().subscribe(response => {
      console.log(response);

      response.features.map(feature => {

        const feDto: FeatureDto = {
          id: feature.id,
          name: feature.properties.name,
          lat: feature.geometry.coordinates[1],
          lon: feature.geometry.coordinates[0],
          serviceMapUrl: feature.properties.links.serviceMap,
          siteUrl: feature.properties.links.site
        }
        //validate if exists:
        //feDto.serviceMapUrl = feature.properties.links.serviceMap
        //console.log(feature.properties.links.serviceMap)
        console.log(feDto)
        this.features.push(feDto);
      });
    });
    
  }

}

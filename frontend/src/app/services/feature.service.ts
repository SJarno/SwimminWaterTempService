import { Injectable } from '@angular/core';
import { FeatureDto } from '../models/feature-dto';
import { ApiService } from './api.service';

@Injectable({
  providedIn: 'root'
})
export class FeatureService {

  features: FeatureDto[] = []; 

  constructor(private apiService: ApiService) {
    //this.getFeatures();
   }

  getFeatures(): void {
    this.apiService.getFeatures().subscribe(response => {
      response.features.map(feature => {

        const feDto: FeatureDto = {
          id: feature.id,
          name: feature.properties.name,
          lat: feature.geometry.coordinates[1],
          lon: feature.geometry.coordinates[0],
          serviceMapUrl: feature.properties.links.serviceMap,
          siteUrl: feature.properties.links.site
        }
        //console.log(feDto)
        this.features.push(feDto);
      });
    });
    
  }
}

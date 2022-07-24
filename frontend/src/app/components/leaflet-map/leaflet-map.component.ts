import { Component, OnInit } from '@angular/core';
import { LeafletModule } from '@asymmetrik/ngx-leaflet';
import * as L from 'leaflet';
import { circle, icon, Icon, latLng, Map, Marker, marker, tileLayer } from 'leaflet';
import { Feature } from 'src/app/models/feature';
import { FeatureDto } from 'src/app/models/feature-dto';
import { ApiService } from 'src/app/services/api.service';
import { FeatureService } from 'src/app/services/feature.service';
/* Due to a bug with leaflet, poin to right path for assets */
const iconDefault = icon({
  ...Icon.Default.prototype.options,
  iconUrl: 'assets/marker-icon.png',
  iconRetinaUrl: 'assets/marker-icon-2x.png',
  shadowUrl: 'assets/marker-shadow.png',

})
Marker.prototype.options.icon = iconDefault;


@Component({
  selector: 'app-leaflet-map',
  templateUrl: './leaflet-map.component.html',
  styleUrls: ['./leaflet-map.component.css']
})
export class LeafletMapComponent implements OnInit {
  options: any;
  features: Feature[] = [];
  
  constructor(private apiService: ApiService) {

  }

  ngOnInit(): void {
    this.getFeatures();
    this.initMap();

  }
  getOptions(latitude: number, longitude: number): void {
    this.options = {
      layers: [
        tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
          { maxZoom: 18, attribution: '...' }),
        //user location
        circle([latitude, longitude], { radius: 1000 }),
      ],
      zoom: 10,
      center: latLng(latitude, longitude)
    }

  }
  initMap() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(position => {
        this.getOptions(position.coords.latitude, position.coords.longitude);
      });
    } else {
      console.log("Unable to get users location");

    }
  }
  /* Todo create marker here and add to map */
  createMarker(map: Map, feature: Feature) {
    console.log('Creating a marker')
    
    const marker = L.geoJSON(feature as any, {});
    const message = `<div style="width: 200px; height:120px">
      <h1>${feature.properties.name}</h1><br>
        <p>Veden lämpötila: ${feature.properties.tempWater}</p>
      </div> `;
    marker.bindPopup(message);
    marker.on('click', this.getLocationDta);
    marker.addTo(map);
    
  }
  /* Todo: get metadata from marker */
  getLocationDta(marker: L.LeafletEvent): void {
    console.log('Testihommia klikkausella')
    console.log(marker.sourceTarget.feature)

  }
  populateLocations(map: Map) {
    //this.getFeatures();
    console.log('Populating locations')
    this.features.forEach(feature => {
      console.log(feature)
      //L.geoJSON(feature as any).addTo(map);
      this.createMarker(map, feature);
      
    });


  }
  getFeatures(): void {
    this.apiService.getFeatures().subscribe(response => {
      response.features.map(feature => {

        const feDto: Feature = {
          type: feature.type,
          id: feature.id,
          geometry: feature.geometry,
          properties: feature.properties

        }
        this.features.push(feDto);
      });
    });

  }


}

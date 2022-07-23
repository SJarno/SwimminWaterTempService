import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Feature } from '../models/feature';
import { FeatureResponse } from '../models/featuresResponse';


@Injectable({
  providedIn: 'root'
})
export class ApiService {

  baseUrl: string = environment.baseUrl;

  constructor(private http: HttpClient) { }

  getStatus(): Observable<any> {
    return this.http.get<any>(this.baseUrl+'status');
  }
  getFeatures(): Observable<FeatureResponse> {
    return this.http.get<FeatureResponse>(this.baseUrl+'features');
  }
}

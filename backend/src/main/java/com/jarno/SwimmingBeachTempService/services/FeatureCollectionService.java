package com.jarno.SwimmingBeachTempService.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jarno.SwimmingBeachTempService.models.feature.FeatureDto;
import com.jarno.SwimmingBeachTempService.models.features.FeatureCollectionDto;
import com.jarno.SwimmingBeachTempService.models.json.FeatureJson;
import com.jarno.SwimmingBeachTempService.models.json.MetaDataJson;

/* Manipulate response in this service accordingly */
@Service
public class FeatureCollectionService {

    @Autowired
    private CustomClientService restService;

    public ResponseEntity<?> getFeatureCollections() {
        ResponseEntity<?> response = this.restService
                .getCollection();

        return response.getStatusCode().value() == 200
                ? new ResponseEntity<FeatureCollectionDto>((FeatureCollectionDto) response.getBody(), HttpStatus.OK)
                : new ResponseEntity<>(response.getBody(), response.getStatusCode());

    }

    public ResponseEntity<?> getGeojsonFeatureById(String id) {
        ResponseEntity<?> response = this.restService.getGeoJsonById(id);
        return response.getStatusCode().value() == 200
                ? new ResponseEntity<FeatureDto>((FeatureDto) response.getBody(), HttpStatus.OK)
                : new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }

    public ResponseEntity<?> getJsonFeatureById(String id) {
        ResponseEntity<?> response = this.restService.getJsonById(id);
        return response.getStatusCode().value() == 200
                ? new ResponseEntity<FeatureJson>((FeatureJson) response.getBody(), HttpStatus.OK)
                : new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }

}

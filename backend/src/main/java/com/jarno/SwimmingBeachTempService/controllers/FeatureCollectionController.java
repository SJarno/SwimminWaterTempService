package com.jarno.SwimmingBeachTempService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jarno.SwimmingBeachTempService.services.FeatureCollectionService;

@RequestMapping("/features")
@RestController
public class FeatureCollectionController {

    @Autowired
    private FeatureCollectionService featureCollectionService;

    @GetMapping("")
    public ResponseEntity<?> getFeatures() {
        return this.featureCollectionService.getFeatureCollections();

    }
    @GetMapping("/feature/{id}.geojson")
    public ResponseEntity<?> getFeatureByIdGeoJsonValue(@PathVariable String id) {
        return featureCollectionService.getGeojsonFeatureById(id);

    }
    @GetMapping("/feature/{id}.json")
    public ResponseEntity<?> getFeatureByIdJsonValue(@PathVariable String id) {
        return this.featureCollectionService.getJsonFeatureById(id);
    }


}

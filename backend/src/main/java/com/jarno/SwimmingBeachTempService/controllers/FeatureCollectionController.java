package com.jarno.SwimmingBeachTempService.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.jarno.SwimmingBeachTempService.models.features.FeatureCollectionDto;
import com.jarno.SwimmingBeachTempService.services.FeatureCollectionService;

@RestController
public class FeatureCollectionController {

    @Autowired
    private FeatureCollectionService featureCollectionService;

    @GetMapping("/features")
    public ResponseEntity<?> getFeatures() {
        return this.featureCollectionService.getFeatureCollections();

    }

}

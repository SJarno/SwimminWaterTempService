package com.jarno.SwimmingBeachTempService.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

import com.jarno.SwimmingBeachTempService.models.features.FeatureCollectionDto;

@Service
public class FeatureCollectionService {
    /*
     * Apply rest calls to here: https://iot.fvh.fi/opendata/uiras/uiras2_v2.geojson
     */

    @Autowired
    private CustomClientService restService;

    // endpoint from configuration file
    private final String GET_FEATURES = "/uiras2_v2.geojson";

    public ResponseEntity<?> getFeatureCollections() {
        ResponseEntity<?> response = this.restService
                .getCollection(GET_FEATURES);
        //TODO check for optional here?
        /* If status is OK, cast response to proper value, else get the error message from rest client */
        return response.getStatusCode().value() == 200 ? new ResponseEntity<FeatureCollectionDto>((FeatureCollectionDto) response.getBody(), HttpStatus.OK)
                : new ResponseEntity<>(response.getBody(), response.getStatusCode());


    }
}

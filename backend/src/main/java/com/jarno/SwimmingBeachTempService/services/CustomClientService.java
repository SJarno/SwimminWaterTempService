package com.jarno.SwimmingBeachTempService.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.util.UriComponentsBuilder;

import com.jarno.SwimmingBeachTempService.models.features.FeatureCollectionDto;

@Component
public class CustomClientService extends AbstractRestClientService {

    /* Todo: add this to properties.yml */
    private final String baseEndpoint = "https://iot.fvh.fi/opendata/uiras/";

    public ResponseEntity<?> getCollection(String collectionPath) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = UriComponentsBuilder.fromUriString(baseEndpoint + collectionPath).toUriString();
        try {
            return this.exchange(url, HttpMethod.GET, entity, FeatureCollectionDto.class);
        } catch (RestClientException e) {
            return new ResponseEntity<>("External server error", HttpStatus.NOT_FOUND);
        }

    }

}

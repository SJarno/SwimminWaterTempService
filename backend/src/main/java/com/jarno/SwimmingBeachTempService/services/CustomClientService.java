package com.jarno.SwimmingBeachTempService.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.jarno.SwimmingBeachTempService.models.feature.FeatureDto;
import com.jarno.SwimmingBeachTempService.models.features.FeatureCollectionDto;


@Component
public class CustomClientService  {

    private final String baseEndpoint = "https://iot.fvh.fi/opendata/uiras/";
    private final String GET_FEATURES = "/uiras2_v2.geojson";
    private final String GET_GEOJSON_BY_ID = "_v2.geojson";
    private final String GET_JSON_BY_ID = "_v1.json";
    

    @Autowired
    RestTemplate restTemplate;

    public ResponseEntity<?> getCollection() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = UriComponentsBuilder.fromUriString(baseEndpoint + GET_FEATURES).toUriString();
        
        return restTemplate.exchange(url, HttpMethod.GET, entity, FeatureCollectionDto.class);

    }

    public ResponseEntity<?> getGeoJsonById(String id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String url = UriComponentsBuilder.fromUriString(baseEndpoint + id + GET_GEOJSON_BY_ID).toUriString();
        
        return restTemplate.exchange(url, HttpMethod.GET, entity, FeatureDto.class);


    }

}

package com.jarno.SwimmingBeachTempService.services;

import java.net.URI;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public abstract class AbstractRestClientService extends RestTemplate {

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> entity, Class<T> responseType) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(entity, responseType);
    }

    @Override
    public <T> ResponseEntity<T> exchange(RequestEntity<?> entity, ParameterizedTypeReference<T> responseType)
            throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(entity, responseType);
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity,
            Class<T> responseType) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType);
    }

    @Override
    public <T> ResponseEntity<T> exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity,
            ParameterizedTypeReference<T> responseType) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType);
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
            Class<T> responseType, Object... uriVariables) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
            Class<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
            ParameterizedTypeReference<T> responseType, Object... uriVariables) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType, uriVariables);
    }

    @Override
    public <T> ResponseEntity<T> exchange(String url, HttpMethod method, HttpEntity<?> requestEntity,
            ParameterizedTypeReference<T> responseType, Map<String, ?> uriVariables) throws RestClientException {
        // TODO Auto-generated method stub
        return super.exchange(url, method, requestEntity, responseType, uriVariables);
    }
    
    
}

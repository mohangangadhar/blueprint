package com.samovich.service.blueprint.utility;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestHelper {

    public ResponseEntity restGet(String url) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        return response;
    }
}
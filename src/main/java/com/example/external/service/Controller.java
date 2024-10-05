package com.example.external.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final RestClient restClient;

    @Autowired
    public Controller(RestClient restClient) {
        this.restClient = restClient;
    }

    @GetMapping("string")
    public ResponseEntity<String> getFromInternal() {
        String response = restClient.getString();
        return ResponseEntity.ok("Response form internal service " + response);
    }
}

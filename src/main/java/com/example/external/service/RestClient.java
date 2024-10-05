package com.example.external.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "internal-service", url = "http://internal-service.com")
public interface RestClient {

    @GetMapping(value = "/get_string")
    String getString();
}

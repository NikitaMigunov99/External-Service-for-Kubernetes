package com.example.external.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties
public class ExternalServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalServiceApplication.class, args);
    }

}

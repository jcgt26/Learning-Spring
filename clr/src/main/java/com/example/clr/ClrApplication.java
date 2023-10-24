package com.example.clr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class ClrApplication {
    //todo: take a deeper look of LoggerFactory
    private static final Logger LOGGER = LoggerFactory.getLogger(ClrApplication.class);

    //todo: take a deeper look of RestTemplate, RestTemplateBuilder
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            LOGGER.info("Starting CLR-App");
            //todo: take a deeper look of ResponseEntity
            ResponseEntity<List<Room>> rooms = restTemplate.exchange(
                    "http://127.0.0.1:8080/api/v1/rooms",
                    HttpMethod.GET,
                    null,
                    new ParameterizedTypeReference<List<Room>>() {
                    });
            rooms.getBody().forEach( room -> {
                LOGGER.info(room.toString());
            });
            LOGGER.info("Finishing CLR-App");
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClrApplication.class, args);
    }

}

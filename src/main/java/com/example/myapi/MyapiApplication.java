package com.example.myapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MyapiApplication {

    private static final Logger log = LoggerFactory.getLogger(MyapiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(MyapiApplication.class, args);

    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Value quote = restTemplate.getForObject(
                    "https://opentdb.com/api.php?amount=10&category=18&difficulty=medium&type=multiple", Value.class);
            System.out.println(quote);
            log.info(quote.toString());
        };
    }
}

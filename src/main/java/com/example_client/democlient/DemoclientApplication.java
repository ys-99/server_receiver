package com.example_client.democlient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DemoclientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoclientApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
    }

}

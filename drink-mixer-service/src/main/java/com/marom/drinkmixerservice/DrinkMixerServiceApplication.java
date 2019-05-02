package com.marom.drinkmixerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DrinkMixerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DrinkMixerServiceApplication.class, args);
    }



    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

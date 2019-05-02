package com.marom.spiritservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpiritServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiritServiceApplication.class, args);
    }

}

package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EruekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EruekaApplication.class, args);
    }

}

package com.ghost.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GhostEurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(GhostEurekaApplication.class, args);
    }

}







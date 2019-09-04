package com.ghost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GoodsEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodsEurekaClientApplication.class,args);
    }
}

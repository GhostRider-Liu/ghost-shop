package com.ghost;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient //@EnableDiscoveryClient
@RestController
public class MemberEurekaClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MemberEurekaClientApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home() {
        return "hi ,I'm from port:" + port;
    }
}

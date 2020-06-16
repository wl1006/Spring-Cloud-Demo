package com.wlg.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Application_Hystrix_Provider {
    public static void main(String[] args) {
        SpringApplication.run(Application_Hystrix_Provider.class);
    }
}

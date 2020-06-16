package com.wlg.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Application_Eureka {
    public static void main(String[] args){
        SpringApplication.run(Application_Eureka.class);
    }
}

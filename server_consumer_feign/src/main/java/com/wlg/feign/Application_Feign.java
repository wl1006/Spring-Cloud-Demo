package com.wlg.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients("com.wlg.feign.client")
public class Application_Feign {
    public static void main(String[] args){
        SpringApplication.run(Application_Feign.class);
    }
}

package com.wlg.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class Application_Ribbon {
    public static void main(String[] args) {
        SpringApplication.run(Application_Ribbon.class);
    }

    @Bean
    @LoadBalanced //开启负载均衡的功能
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //修改默认的负载均衡策略
    @Bean
    public IRule myRule() {
        //随机策略
        return new RandomRule();
    }
}

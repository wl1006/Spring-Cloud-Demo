package com.wlg.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://TEST-PROVIDER/provider/get";

    @GetMapping("get")
    public String get() {
        String data = restTemplate.getForObject(URL, String.class);
        return data;
    }

}

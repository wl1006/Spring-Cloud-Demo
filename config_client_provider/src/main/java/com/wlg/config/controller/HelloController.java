package com.wlg.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class HelloController {

    @GetMapping("/hello")
    public String index() {
        return "我是一个数据！";
    }
}

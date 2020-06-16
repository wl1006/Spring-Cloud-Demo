package com.wlg.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "TEST-PROVIDER")
@RequestMapping("provider")
public interface DataClient {

    @RequestMapping("get")
    public String getData();
}

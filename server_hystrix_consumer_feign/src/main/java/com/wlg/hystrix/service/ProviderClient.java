package com.wlg.hystrix.service;

import com.wlg.hystrix.factory.ProviderClientFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "TEST-HYSTRIX-PROVIDER", fallbackFactory = ProviderClientFactory.class)
@RequestMapping("provider")
public interface ProviderClient {

    @GetMapping("get/{num}")
    public String get(@PathVariable("num") String num);
}

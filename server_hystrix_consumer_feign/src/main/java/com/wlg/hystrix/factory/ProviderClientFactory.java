package com.wlg.hystrix.factory;

import com.wlg.hystrix.service.ProviderClient;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProviderClientFactory implements FallbackFactory<ProviderClient> {

    @Override
    public ProviderClient create(Throwable cause) {
        return new ProviderClient() {
            @Override
            public String get(String num) {
                return "Feign调用失败";
            }
        };
    }
}

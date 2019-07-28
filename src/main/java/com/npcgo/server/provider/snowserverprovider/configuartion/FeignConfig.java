package com.npcgo.server.provider.snowserverprovider.configuartion;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    Logger.Level feignLevel() {
        return Logger.Level.BASIC;
    }
}

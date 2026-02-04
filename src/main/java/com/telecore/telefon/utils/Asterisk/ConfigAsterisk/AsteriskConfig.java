package com.telecore.telefon.utils.Asterisk.ConfigAsterisk;

import org.asteriskjava.live.AsteriskServer;
import org.asteriskjava.live.DefaultAsteriskServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsteriskConfig {

    @Bean
    public AsteriskServer connection(AsteriskSettings asteriskSettings){
        return new DefaultAsteriskServer(
                asteriskSettings.getAsteriskIP(),
                asteriskSettings.getManagerUsername(),
                asteriskSettings.getManagerPassword()
        );
    }
}

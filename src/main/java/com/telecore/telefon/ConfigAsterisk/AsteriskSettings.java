package com.telecore.telefon.ConfigAsterisk;

import org.asteriskjava.pbx.DefaultAsteriskSettings;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Setter
@Component
@ConfigurationProperties(prefix = "asterisk")
public class AsteriskSettings extends DefaultAsteriskSettings {

    private String ipServer;
    private String host;
    private String managerUser;
    private String passwordServer;

    @Override
    public String getManagerPassword() {
        return passwordServer;
    }

    @Override
    public String getManagerUsername() {
        return managerUser;
    }

    @Override
    public String getAsteriskIP() {
        return ipServer;
    }

    @Override
    public String getAgiHost() {
        return host;
    }
}

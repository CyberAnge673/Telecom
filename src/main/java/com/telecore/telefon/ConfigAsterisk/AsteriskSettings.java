package com.telecore.telefon.ConfigAsterisk;

import org.asteriskjava.pbx.DefaultAsteriskSettings;
import org.springframework.beans.factory.annotation.Value;

public class AsteriskSettings extends DefaultAsteriskSettings {

    private  String ipServer ;
    private String host ;
    private  String passwordServer;
    private String managerUser;

    public AsteriskSettings(String ipServer, String host, String passwordServer, String managerUser) {
        this.ipServer = ipServer;
        this.host = host;
        this.passwordServer = passwordServer;
        this.managerUser = managerUser;
    }

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

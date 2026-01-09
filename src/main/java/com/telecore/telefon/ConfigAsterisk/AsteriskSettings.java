package com.telecore.telefon.ConfigAsterisk;

import org.asteriskjava.pbx.DefaultAsteriskSettings;
import org.springframework.beans.factory.annotation.Value;

public class AsteriskSettings extends DefaultAsteriskSettings {

    private static final String ipServeer = "192.168.101.100";
    private static final String host = "192.168.101.72";
    private static final String passwordServer="Asterisk18";
    private static final String managerUser="contexto";

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
        return ipServeer;
    }

    @Override
    public String getAgiHost() {
        return host;
    }
}

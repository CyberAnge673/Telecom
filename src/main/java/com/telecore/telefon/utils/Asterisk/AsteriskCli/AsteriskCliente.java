package com.telecore.telefon.utils.Asterisk.AsteriskCli;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.asteriskjava.live.AsteriskChannel;
import org.asteriskjava.live.AsteriskServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;

@Component
public class AsteriskCliente {
    @Autowired
    private AsteriskServer server;

    @PostConstruct
    private void init() throws Exception{
        server.initialize();
    }

    public String mensaje(String comado) throws Exception{
        Collection<AsteriskChannel> canal = server.getChannels();
        List<String> cli = server.executeCliCommand(comado);
        return String.join("\n", cli);
    }

    //public String obtenerConexiones();
    //public String
    public Collection<AsteriskChannel> getChannels(){
        return server.getChannels();
    }

    @PreDestroy
    private void destroy() throws Exception{
        server.shutdown();
    }

}
package com.telecore.telefon.utils.funtionals;

import com.telecore.telefon.utils.validators.Ipverificador;
import org.springframework.stereotype.Component;

@Component
public class IpValidationUtils {
    public Ipverificador<String> ipGetValid(){
        return (ip )->{
            if(ip==null || ip.isEmpty()){return false;}
            String [] valores = ip.split("[.]");
            if(valores.length!=4){return false;}
            try {
                for (String valor : valores) {
                    if (Integer.parseInt(valor) < 0 || Integer.parseInt(valor) > 255) {
                        return false;
                    }

                }
            }catch (Exception e){
                return false;
            }
            return true;
        };

    }
}

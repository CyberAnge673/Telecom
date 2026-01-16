package com.telecore.telefon.Servicio.Servicios;

import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.ExtensionRepo;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iextension;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ExtensionService implements Iextension {

    @Autowired
    ExtensionRepo extensionRepo;



    @Override
    public Boolean guardarExtension() {
        return null;
    }

    @Override
    public ArrayList<Extension> obtenerExtension() {
        try {

            List<Extension> extensions = new ArrayList<>();
            extensions = extensionRepo.findAll();
            extensions.forEach(extension ->{
                log.info(extension.toString());
            });

        }catch (Exception e){
            return null;
        }
        return null;
    }


    @Override
    public Boolean eliminarExtension() {
        return null;
    }


}

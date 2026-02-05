package com.telecore.telefon.Servicio.Servicios;

import com.telecore.telefon.DTO.Request.ExtensionRequest;
import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.ExtensionRepo;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iextension;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ExtensionService implements Iextension {

    protected  static  Logger logger =  LoggerFactory.getLogger(ExtensionService.class);
    @Autowired
    ExtensionRepo extensionRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    UsuarioRepo usuarioRepo;


    @Override
    public Boolean guardarExtension(ExtensionRequest request) {
        try {
            Extension extension = new Extension();
            extension.setEstadoExtension(request.estadoExtension());
            extension.setNombre(request.nombre());
            extension.setContexto(request.getContexto());
            extension.setUsername(request.username());
            extension.setPassword(passwordEncoder.encode(request.password()));
            if(request.usuarioId() != null){
                Usuario usuario = usuarioRepo.findById(request.usuarioId())
                        .orElseThrow(() -> new RuntimeException("Usuario no encotrado"));
                extension.setUsuario(usuario);
            }
            log.info("Usuario guardado");


        }catch (Exception e){
            log.error("ocurrio un error");
            log.error(e.getMessage());
            return false;
        }
        return true;
    }



    @Override
    public ArrayList<Extension> obtenerExtension() {
        try {

            List<ExtensionRequest> exte = new ArrayList<>();



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

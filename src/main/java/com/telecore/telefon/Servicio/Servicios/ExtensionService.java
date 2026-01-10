package com.telecore.telefon.Servicio.Servicios;

import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.ExtensionRepo;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iextension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtensionService implements Iextension {
    @Autowired
    ExtensionRepo extensionRepo;
    @Autowired
    UsuarioRepo usuarioRepo;


    @Override
    public Boolean guardarExtension() {
        return null;
    }

    @Override
    public String obtenerExtension() {
        return "";
    }

    @Override
    public Boolean eliminarExtension() {
        return null;
    }


}

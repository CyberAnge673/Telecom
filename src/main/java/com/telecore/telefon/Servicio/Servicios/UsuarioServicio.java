package com.telecore.telefon.Servicio.Servicios;

import org.springframework.beans.factory.annotation.Autowired;

import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iusuario;

public class UsuarioServicio implements Iusuario {

    @Autowired
    UsuarioRepo usuarioRepo;

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        try{
            usuarioRepo.save(usuario);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        try{
            return usuarioRepo.findById(id).orElse(null);
        }
        catch(Exception e){
            return null;
        }
    }

    @Override
    public Boolean desactivarUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'desactivarUsuario'");
    }
    
}

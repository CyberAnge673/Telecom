package com.telecore.telefon.Servicio.Servicios;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iusuario;



@Service
public class UsuarioServicio implements Iusuario {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioServicio.class);

    @Autowired
    UsuarioRepo usuarioRepo;

    @Override
    public Boolean guardarUsuario(Usuario usuario) {
        try{
            usuarioRepo.save(usuario);
            logger.info("Usuario guardado correctamente");
            return true;
        }
        catch(Exception e){
            logger.error("Error al guardar el usuario", e);
            return false;
        }
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        try{
            logger.info("Obteniendo usuario con ID: " + id);
            return usuarioRepo.findById(id).orElse(null);
        }
        catch(Exception e){
            return null;
        }
    }

    @Override
    public java.util.List<Usuario> listarUsuarios() {
        try{
            logger.info("Listando todos los usuarios");
            List<Usuario> usuario = new ArrayList<>();
            usuario = usuarioRepo.findAll();
            usuario.forEach(user -> logger.info(user.toString()));
            return usuario;

        }catch(Exception e){
            logger.error("Error al listar los usuarios", e);
            return null;
        }
        

        // TODO Auto-generated method stub
       
    }

    



}
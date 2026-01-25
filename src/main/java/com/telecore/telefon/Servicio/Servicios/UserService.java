package com.telecore.telefon.Servicio.Servicios;

import java.util.ArrayList;
import java.util.List;

import com.telecore.telefon.DTO.Request.UsarioRequest;
import com.telecore.telefon.DTO.Response.UsuarioResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Repositorio.UsuarioRepo;
import com.telecore.telefon.Servicio.Interfaces.Iusuario;



@Service
public class UserService implements Iusuario {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UsuarioRepo usuarioRepo;



    @Override
    public Boolean guardarUsuario(UsarioRequest dto) {
        try{
            Usuario user = new Usuario();
            user.setEmail(dto.email());
            user.setNombre(dto.nombre());
            user.setApellido(dto.apellido());
            user.setPassword(passwordEncoder.encode(dto.password()));
            user.setEstado("ACTIVO");
            usuarioRepo.save(user);
            logger.info("Usuario guardado correctamente");
            return true;
        }
        catch(Exception e){
            logger.error("Error al guardar el usuario", e);
            return false;
        }
    }

    @Override
    public UsuarioResponse obtenerUsuario(Long id) {

        try{
            logger.info("Obteniendo usuario con ID: " + id);
            Usuario usuario = usuarioRepo.findById(id).orElseThrow(() -> new RuntimeException());
            return new UsuarioResponse(usuario);
        }
        catch(Exception e){
            return null;
        }
    }

    @Override
    public List<UsuarioResponse > listarUsuarios() {
        try{
            logger.info("Listando todos los usuarios");
            List<Usuario> usuario =  usuarioRepo.findAll();
            usuario.forEach(user -> logger.info(user.toString()));;

           return usuario.stream()
                    .map(UsuarioResponse::new)
                   .toList();

        }catch(Exception e){
            logger.error("Error al listar los usuarios", e);
            return new ArrayList<>();
        }


        // TODO Auto-generated method stu
       
    }





}
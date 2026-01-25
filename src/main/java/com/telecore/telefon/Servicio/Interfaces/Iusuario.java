package com.telecore.telefon.Servicio.Interfaces;

import java.util.List;

import com.telecore.telefon.DTO.Request.UsarioRequest;
import com.telecore.telefon.DTO.Response.UsuarioResponse;
import com.telecore.telefon.Modelo.Usuario;

public interface Iusuario {
    public List<UsuarioResponse> listarUsuarios();
    public Boolean guardarUsuario(UsarioRequest usuario);
    public UsuarioResponse obtenerUsuario(Long id);
    
    
    
}

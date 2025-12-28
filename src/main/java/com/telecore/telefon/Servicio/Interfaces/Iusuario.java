package com.telecore.telefon.Servicio.Interfaces;

import java.util.List;

import com.telecore.telefon.Modelo.Usuario;

public interface Iusuario {
    public List<Usuario> listarUsuarios();
    public Boolean guardarUsuario(Usuario usuario);
    public Usuario obtenerUsuario(Long id); 
    
    
    
}

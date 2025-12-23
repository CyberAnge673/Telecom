package com.telecore.telefon.Servicio.Interfaces;

import com.telecore.telefon.Modelo.Usuario;

public interface Iusuario {
    public Boolean guardarUsuario(Usuario usuario);
    public Usuario obtenerUsuario(Long id); 
    public Boolean desactivarUsuario();
    
    
}

package com.telecore.telefon.Servicio.Interfaces;

import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;

public interface  Iextension{
    public Boolean guardarExtension();
    public String obtenerExtension(); 
    public Boolean eliminarExtension();
}
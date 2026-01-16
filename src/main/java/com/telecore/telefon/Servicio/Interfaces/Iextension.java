package com.telecore.telefon.Servicio.Interfaces;

import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;

import java.util.ArrayList;

public interface  Iextension{
    public Boolean guardarExtension();
    public ArrayList<Extension> obtenerExtension();
    public Boolean eliminarExtension();
}
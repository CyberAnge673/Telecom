package com.telecore.telefon.Servicio.Interfaces;

import com.telecore.telefon.DTO.Request.ExtensionRequest;
import com.telecore.telefon.DTO.Request.UsarioRequest;
import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;

import java.util.ArrayList;

public interface  Iextension{
    public Boolean guardarExtension(ExtensionRequest usarioRequest);
    public ArrayList<Extension> obtenerExtension();
    public Boolean eliminarExtension();
}
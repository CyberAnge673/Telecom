package com.telecore.telefon.Servicio.Interfaces;

import com.telecore.telefon.DTO.Request.ExtensionRequest;
import com.telecore.telefon.DTO.Request.UsarioRequest;
import com.telecore.telefon.DTO.Response.ExtensionesResponse;
import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Modelo.Usuario;

import java.util.ArrayList;
import java.util.List;

public interface  Iextension{
    public Boolean guardarExtension(ExtensionRequest usarioRequest);
    public List<ExtensionesResponse> obtenerExtension();
    public Boolean eliminarExtension(long id);
}
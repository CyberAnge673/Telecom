package com.telecore.telefon.Controlador;

import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Servicio.Servicios.ExtensionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/extensiones")
public class ExtensionController {
    @Autowired
    ExtensionService extensionService;

    @GetMapping
    public ArrayList<Extension> obtenerExtensiones(){
        return extensionService.obtenerExtension();
    }
}

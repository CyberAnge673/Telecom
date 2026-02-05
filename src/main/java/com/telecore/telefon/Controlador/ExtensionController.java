package com.telecore.telefon.Controlador;

import com.telecore.telefon.DTO.Request.ExtensionRequest;
import com.telecore.telefon.Modelo.Extension;
import com.telecore.telefon.Servicio.Servicios.ExtensionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
//    @PostMapping
////    public ResponseEntity<String> guardarExtensiones(@RequestBody @Valid ExtensionRequest request){
////        extensionService.guardarExtension(request);
////    }
}

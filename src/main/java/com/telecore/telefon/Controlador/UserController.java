package com.telecore.telefon.Controlador;

import com.telecore.telefon.DTO.Response.UsuarioResponse;
import com.telecore.telefon.Modelo.Usuario;
import com.telecore.telefon.Servicio.Servicios.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.telecore.telefon.DTO.Request.UsarioRequest;


@RestController
@RequestMapping("/Usuario")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<String>guardar(@RequestBody @Valid UsarioRequest request){
        userService.guardarUsuario(request);
        return ResponseEntity.ok("Usuario guardado");
    }
    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponse> Respuesta(@PathVariable Long id){
        UsuarioResponse usuario = userService.obtenerUsuario(id);
        return  ResponseEntity.ok(usuario);

    }

}

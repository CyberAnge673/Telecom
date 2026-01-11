package com.telecore.telefon.DTO.Response;

import com.telecore.telefon.Modelo.Usuario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Getter
@NoArgsConstructor
public class UsuarioResponse {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String departamentoNombre;
    private ExtensionesResponse extensiones;

    public UsuarioResponse(Usuario usuario) {
        this.id = usuario.getId();
        this.nombre = usuario.getNombre();
        this.apellido = usuario.getApellido();
        this.email = usuario.getEmail();
        this.extensiones = usuario.getExtension() != null ? new ExtensionesResponse(usuario.getExtension()) : null;


    }

}

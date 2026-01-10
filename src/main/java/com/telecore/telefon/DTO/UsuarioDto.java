package com.telecore.telefon.DTO;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UsuarioDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String puesto;
    private Long rolId;
    private String rolNombre;
    private Long departamentoId;
    private String departamentoNombre;
    private Long extensionId;
    private String extensionNumero;
    private LocalDateTime fechaCreacion;
    private Boolean activo;
}

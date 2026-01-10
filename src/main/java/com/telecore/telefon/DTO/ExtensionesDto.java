package com.telecore.telefon.DTO;

import java.time.LocalDateTime;

public class ExtensionesDto {
    private Long extensionId;
    private String numero;
    private String nombre;
    private String descripcion;
    private String username;
    private String tipo;           // "SIP", "IAX", etc.
    private String estado;         // "ACTIVA", "INACTIVA", etc.
    private String contexto;       // "internos", "externos", etc.
    private LocalDateTime fechaCreacion;
    private Long usuarioId;        // null si no está asignada
    private String usuarioNombre;  //
}

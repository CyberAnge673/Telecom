package com.telecore.telefon.DTO.Response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.telecore.telefon.Modelo.Extension;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@NoArgsConstructor
public class ExtensionesResponse {
    private long extensionId;
    private String numero;
    private String nombre;
    private String descripcion;
    private String username;
    private String tipo;           // "SIP", "IAX", etc.
    private String estado;         // "ACTIVA", "INACTIVA", etc.
    private String contexto;       // "internos", "externos", etc.
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fechaCreacion;
    private Long usuarioId;        // null si no está asignada
    private String usuarioNombre;  //
    private boolean tieneUsuario;
    public ExtensionesResponse(Extension extension) {
        Objects.requireNonNull(extension, "Extension cannot be null");
        this.extensionId = extension.getExtensionId();
        this.numero = extension.getNumero();
        this.nombre = extension.getNombre();
        this.descripcion = extension.getDescripcion();
        this.username = extension.getUsername();
        this.tipo = extension.getTipo() != null ? extension.getTipo().name() :  "DESCONOCIDO";
        this.contexto = extension.getContexto() != null ? extension.getContexto() : "DESCONOCIDO";
        this.fechaCreacion = extension.getFechaCreacion();
        this.estado = extension.getEstadoExtension().name();
        if(extension.getUsuario() != null){
            this.usuarioId = extension.getUsuario().getId();
            this.usuarioNombre = extension.getUsuario().getNombre();
            this.tieneUsuario = true;
        }
        else{
            this.usuarioId = null;
            this.usuarioNombre = null;
            this.tieneUsuario = false;
        }


    }

}

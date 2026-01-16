package com.telecore.telefon.DTO.Request;


import com.telecore.telefon.Modelo.Extension;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ExtensionRequest (
        @NotBlank String numeroExtension,
        @NotBlank String passwordExtension,
        @NotBlank String nombreExtension,
        @NotBlank String descripcionExtension,
        @NotBlank String userName,
        @NotNull Extension.TipoExtension tipoExtension,
        @NotNull Extension.EstadoExtension estadoExtension,
        @NotNull Long usuarioId


    ){

}

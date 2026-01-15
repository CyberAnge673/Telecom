package com.telecore.telefon.DTO.Request;

import com.telecore.telefon.Modelo.Usuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsarioRequest (
        @NotBlank String nombre,
        @NotBlank String apellido,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String password
){

}


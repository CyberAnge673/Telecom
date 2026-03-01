package com.telecore.telefon.DTO.Request;

import com.telecore.telefon.Modelo.Extension;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record ExtensionRequest(

		@NotBlank(message = "El número de extensión es obligatorio") @Pattern(regexp = "^\\d{3,6}$", message = "El número debe tener entre 3 y 6 dígitos") String numero,

		@NotBlank(message = "La contraseña es obligatoria") String password,

		@NotBlank(message = "El nombre de la extensión es obligatorio") String nombre,

		@NotBlank(message = "La descripción es obligatoria") String descripcion,

		@NotBlank(message = "El nombre de usuario es obligatorio") String username,

		@NotBlank(message = "necesario el contexto") Extension.Contexto contexto,

		@NotBlank(message = "necesasrop tipo de extension") Extension.TipoExtension tipoExtension,

		@NotBlank(message = "necesario el estado Extension") Extension.EstadoExtension estadoExtension,

		Long usuarioId

) {
	// Método helper para obtener valores por defecto
	public Extension.TipoExtension getTipoConDefecto() {
		return this.tipoExtension != null ? this.tipoExtension : Extension.TipoExtension.SIP;
	}

	public Extension.EstadoExtension Estado() {
		return this.estadoExtension != null ? this.estadoExtension : Extension.EstadoExtension.INACTIVA;
	}

	public Extension.Contexto getContexto() {
		return this.contexto != null ? this.contexto : Extension.Contexto.INTERNOS;
	}
}
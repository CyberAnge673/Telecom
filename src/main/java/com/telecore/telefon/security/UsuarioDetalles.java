package com.telecore.telefon.security;

import com.telecore.telefon.Modelo.Usuario;
import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UsuarioDetalles implements UserDetails {
	private Usuario usuario;

	public UsuarioDetalles(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		String rolNombre = usuario.getRol() != null ? usuario.getRol().getNombre() : "USER";
		return Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + rolNombre));
	}

	@Override
	public @Nullable String getPassword() {
		return usuario.getPassword();
	}

	@Override
	public String getUsername() {
		return usuario.getNombre();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return usuario.getEstado() == null || usuario.getEstado().equalsIgnoreCase("ACTIVO");
	}

}

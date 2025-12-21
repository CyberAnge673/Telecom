package com.telecore.telefon.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecore.telefon.Modelo.Usuario;


public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

}
package com.telecore.telefon.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecore.telefon.Modelo.Rol;

public interface  RolRepo extends JpaRepository<Rol, Long> {
    
}

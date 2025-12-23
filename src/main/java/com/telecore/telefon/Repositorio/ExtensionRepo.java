package com.telecore.telefon.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecore.telefon.Modelo.Extension;


public interface  ExtensionRepo extends JpaRepository<Extension, Long> {
    
}

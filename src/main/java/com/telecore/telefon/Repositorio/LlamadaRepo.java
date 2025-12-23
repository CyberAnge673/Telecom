package com.telecore.telefon.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telecore.telefon.Modelo.Llamada;

public interface  LlamadaRepo extends JpaRepository <Llamada, Long> {
    
}

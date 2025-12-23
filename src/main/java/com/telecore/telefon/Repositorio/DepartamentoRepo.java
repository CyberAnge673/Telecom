package com.telecore.telefon.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telecore.telefon.Modelo.Departamento;

public interface DepartamentoRepo extends JpaRepository <Departamento, Long> {
    
}

package com.telecore.telefon.Modelo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="email", unique=true)
    private String email;
    @Column(name="fechaCreacion")
    private LocalDateTime fechaCreacion;
    @ManyToOne
    @JoinColumn(name="rol_id")
    private Rol rol;
    @OneToMany(mappedBy="usuario", fetch=FetchType.LAZY)
    private List<Llamada> llamadas = new ArrayList<>();
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Extension extension;
    @ManyToOne
    @JoinColumn(name="departamento_id")
    private Departamento departamento;

}
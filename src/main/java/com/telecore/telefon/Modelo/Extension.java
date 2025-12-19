package com.telecore.telefon.Modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Extension {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idExtension")
    private long extensionId;
    @Column(name="numeroExtension")
    private String numero;
    @Column(name="passwordExtension")
    private String password;
    @Column(name="nombreExtension")
    private String nombre;
    @Column(name="descripcionExtension")
    private String descripcion;
    @Column(name="username")
    private String username;
    @Column(name="tipoExtension")
    private String tipo;
    @ManyToOne(cascade=CascadeType.ALL)
    private Usuario usuario;
    
}

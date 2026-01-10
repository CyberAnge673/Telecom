package com.telecore.telefon.Modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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
    private TipoExtension tipo = TipoExtension.SIP;
    @Column(name="contexto")
    private String contexto = "internos";
    @Column(name="estadoExtension")
    private EstadoExtension estadoExtension = EstadoExtension.ACTIVA;
    @Column(name="fechaCreacion")
    private LocalDateTime fechaCreacion;
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinColumn(name="usuario_id", referencedColumnName="id")
    private Usuario usuario;

    public enum TipoExtension{
        SIP,
        IAX,
        VIRTUAL,
        FAX,
        CONFERENCIA

    }
    public enum EstadoExtension{
        ACTIVA,
        INACTIVA,
        BLOQUEADA,
        MANTENIMIENTO
    }
    
}

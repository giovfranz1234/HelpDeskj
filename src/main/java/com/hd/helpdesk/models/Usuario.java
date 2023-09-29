package com.hd.helpdesk.models;

import jakarta.persistence.*;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Long id;
    @Column(name = "nombre_completo")
    private String nombreCompleto;
    @Column(name = "correo")
    private String correoElectronico;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "rol")
    private String rol;

    @OneToMany(mappedBy = "creadoPor", cascade = CascadeType.ALL)
    private List<Ticket> creaTickets;

    @OneToMany(mappedBy = "creadoPorUsuario", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;


}

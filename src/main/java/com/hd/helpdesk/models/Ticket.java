package com.hd.helpdesk.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private String estado;
    private String prioridad;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario creadoPor;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Tecnico asignadoA;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo aplicaA;
    @OneToMany(mappedBy = "perteneceATicket", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;

    @OneToOne(mappedBy = "GuardadoEnTicket", cascade = CascadeType.ALL)
    private Documentos tieneDoc;
}

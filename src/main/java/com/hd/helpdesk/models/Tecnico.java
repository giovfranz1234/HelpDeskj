package com.hd.helpdesk.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table
@Data
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tecnico_id")
    private Long id;
    @Column(name = "nombre_Completo")
    private String nombre;
    @Column(name = "especialidad")
    private String especialidad;
    @Column(name = "disponibilidad")
    private String disponibilidad;

    @OneToMany(mappedBy = "asignadoA", cascade = CascadeType.ALL)
    private List<Ticket> ticketsAsignados;

    @OneToMany(mappedBy = "creadoPorTecnico", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;
}

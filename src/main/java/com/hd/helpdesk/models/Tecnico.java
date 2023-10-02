package com.hd.helpdesk.models;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Table(name="tecnicos")
@Data
@Entity
public class Tecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String especialidad;

    private String disponibilidad;

    @OneToMany(mappedBy = "asignadoA", cascade = CascadeType.ALL)
    private List<Ticket> ticketsAsignados;

    @OneToMany(mappedBy = "creadoPorTecnico", cascade = CascadeType.ALL)
    private List<Comentario> comentarios;
}

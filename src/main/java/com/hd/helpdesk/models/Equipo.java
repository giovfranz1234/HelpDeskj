package com.hd.helpdesk.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table
@Data
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreEquipo;
    private String tipoEquipo;
    private String numeroSerie;
    private String ubicacion;

    @OneToMany(mappedBy = "aplicaA", cascade = CascadeType.ALL)
    private List<Ticket> ticketsRelacionados;

    @OneToOne(mappedBy = "aplicadaEnEquipo", cascade = CascadeType.ALL)
    private Documentos tieneDoc;
}

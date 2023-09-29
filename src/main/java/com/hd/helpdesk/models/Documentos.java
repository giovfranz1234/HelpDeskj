package com.hd.helpdesk.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Documentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Documento;

    @OneToOne
    @JoinColumn(name = "ticket_id")
    private Ticket aplicadaEnTicket;

    @OneToOne
    @JoinColumn(name = "equipo_id")
    private Equipo aplicadaEnEquipo;

}

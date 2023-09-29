package com.hd.helpdesk.models;


import jakarta.persistence.*;
import lombok.Data;
@Table(name = "comentarios")
@Data
@Entity

    public class Comentario {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String textoComentario;

        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private Usuario creadoPorUsuario;

        @ManyToOne
        @JoinColumn(name = "tecnico_id")
        private Tecnico creadoPorTecnico;

        @ManyToOne
        @JoinColumn(name = "ticket_id")
        private Ticket perteneceATicket;
}

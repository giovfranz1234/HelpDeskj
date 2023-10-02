package com.hd.helpdesk.repositories;

import com.hd.helpdesk.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
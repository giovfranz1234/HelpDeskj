package com.hd.helpdesk.repositories;

import com.hd.helpdesk.models.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TecnicoRepository extends JpaRepository<Tecnico, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
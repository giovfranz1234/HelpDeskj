package com.hd.helpdesk.repositories;

import com.hd.helpdesk.models.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}

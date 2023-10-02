package com.hd.helpdesk.repositories;

import com.hd.helpdesk.models.Documentos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentoRepository extends JpaRepository<Documentos, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}
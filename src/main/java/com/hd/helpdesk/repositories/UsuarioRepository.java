package com.hd.helpdesk.repositories;

import com.hd.helpdesk.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar métodos de consulta personalizados aquí si es necesario
}

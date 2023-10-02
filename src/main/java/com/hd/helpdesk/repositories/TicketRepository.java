package com.hd.helpdesk.repositories;
import com.hd.helpdesk.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TicketRepository extends JpaRepository<Ticket, Long>  {

    @Override
    public List<Ticket> findAll() {
        return null;
    }
}

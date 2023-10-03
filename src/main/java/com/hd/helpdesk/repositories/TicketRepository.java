package com.hd.helpdesk.repositories;
import com.hd.helpdesk.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {


}

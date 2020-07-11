package com.bunny.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.bunny.spring.mysql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}

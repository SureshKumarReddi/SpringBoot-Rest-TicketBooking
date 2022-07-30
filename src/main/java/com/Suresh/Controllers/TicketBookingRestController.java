package com.Suresh.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Suresh.Request.Passenger;
import com.Suresh.Response.Ticket;
import com.Suresh.Service.TicketService;

@RestController
public class TicketBookingRestController {

	@Autowired
	private TicketService service;
	@PostMapping("/")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		Ticket bookTicket = service.bookTicket(passenger);
		return new ResponseEntity<>(bookTicket,HttpStatus.CREATED);
	}
}

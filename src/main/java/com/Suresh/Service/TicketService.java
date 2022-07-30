package com.Suresh.Service;

import org.springframework.stereotype.Service;

import com.Suresh.Request.Passenger;
import com.Suresh.Response.Ticket;

@Service
public class TicketService {

	public Ticket bookTicket(Passenger passenger) {
		System.out.println("passenger information " + passenger);

		return new Ticket("10100", "booked", "435");
	}

}

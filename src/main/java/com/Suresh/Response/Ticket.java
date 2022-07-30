package com.Suresh.Response;

public class Ticket {

	private String pnr;
	private String pnrStatus;
	private String ticketPrice;
	
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}


	public Ticket(String pnr, String pnrStatus, String ticketPrice) {
		super();
		this.pnr = pnr;
		this.pnrStatus = pnrStatus;
		this.ticketPrice = ticketPrice;
	}


	public String getPnr() {
		return pnr;
	}


	public void setPnr(String pnr) {
		this.pnr = pnr;
	}


	public String getPnrStatus() {
		return pnrStatus;
	}


	public void setPnrStatus(String pnrStatus) {
		this.pnrStatus = pnrStatus;
	}


	public String getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", pnrStatus=" + pnrStatus + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
}

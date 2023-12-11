package com.zettamine.java.day2;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;

	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		 if(availableTickets > 0) {
		   Ticket.availableTickets = availableTickets;
		 }
	}
	@Override
	public String toString() {
		return "Ticket [ticketid=" + ticketid + ", price=" + price + "]";
	}
	
	public int calculateTicketCost(int nooftickets) {
		 if(availableTickets >= nooftickets) {
			 availableTickets = availableTickets - nooftickets;
			 
			 return nooftickets * getPrice();
		 }
		 return -1;
	}
	
}

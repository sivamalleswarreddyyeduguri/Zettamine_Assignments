package com.zettamine.java.day2;

import java.util.Scanner;

public class TicketTesting {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		Ticket tickets = new Ticket();
		int noOfBookings = 2;
		System.out.print("Enter the available tickets: ");
		int availableTickets = Scn.nextInt();
		Ticket.setAvailableTickets(availableTickets);
		while(noOfBookings > 0) {
		System.out.print("Enter the ticketid: ");
		int ticketId = Scn.nextInt();
		System.out.print("Enter the price: ");
		int price = Scn.nextInt();
		System.out.print("Enter the no of tickets: ");
		int noOfTickets = Scn.nextInt();
		
		tickets.setPrice(price);
		tickets.setTicketid(ticketId);
		
		System.out.println("Available tickets: " + Ticket.getAvailableTickets());
		System.out.println("Total amount: " + tickets.calculateTicketCost(noOfTickets));
		System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
		  
		    noOfBookings--;
		}
		
	}

}

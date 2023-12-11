package com.zettamine.java.day1;

import java.util.Scanner;

public class MovieTicket {
		static Scanner Scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the no of ticket:");
		int noOfTickets = Scn.nextInt();
		System.out.print("Do you want refreshment pls enter y/n:");
		String refreshment = Scn.next();
		System.out.print("Do you have coupon cod y/n:");
		String coupon = Scn.next();
		System.out.print("Enter the circle K/Q:");
		String circle = Scn.next();
		Scn.close();
		if(!circle.equalsIgnoreCase("k") && !circle.equalsIgnoreCase("q")) {
			  System.out.println("Invalid input");
			  return;
		}
		double total =ticketTotal(noOfTickets, refreshment, coupon,circle);
		if(total!=0) {
		System.out.printf("Ticket cost: %.2f",total);
		}
		else {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
		
	}
	public static double ticketTotal(int noOfTickets, String refreshment, String coupon, String circle) {
		 double total =0;
		if(noOfTickets >= 5 & noOfTickets <= 40) {
			if(circle.equalsIgnoreCase("k")) {
				 total = noOfTickets*75;
			}
			
			if( circle.equalsIgnoreCase("q")){
					total = noOfTickets*150;
			}
		if(noOfTickets > 20) {
			total= total*0.9;
		}
		if(coupon.equalsIgnoreCase("y")) {
			total= total*0.98;
		}
		if(refreshment.equalsIgnoreCase("y")) {
			total +=(noOfTickets)*50;
		 }
		}
		return total;
	}
    
}

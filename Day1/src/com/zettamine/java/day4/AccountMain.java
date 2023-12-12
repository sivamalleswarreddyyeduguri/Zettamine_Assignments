package com.zettamine.java.day4;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Account Number: ");
		int accNo = scn.nextInt();
		System.out.print("Enter customer id: ");
		int custId = scn.nextInt();
		System.out.print("Enter customer name: ");
		String name = scn.next();
		System.out.println("Enter customer email: ");
		String email = scn.next();
		scn.nextLine();
		while(true) {
		if(email.matches("[A-Za-z0-9.]*@[A-Za-z]+[.][A-Za-z]+")) {
			    break;
			}
		else {
			System.out.print("Invalid email enter again: ");
			email = scn.next();
		  }	
		}
		System.out.print("Enter Balance: ");
		double balance = scn.nextDouble();
		System.out.print("Enter Minimum Balance: ");
		double minimumBalance = scn.nextDouble();
		
		
		System.out.print("Enter Amount to WithDraw: ");
		scn.close();
		double amount = scn.nextDouble();
		Customer c = new Customer(custId, name, email);
		SavingsAccount sa = new SavingsAccount(accNo, c, balance, minimumBalance);
		 sa.withdraw(amount);
	}
}


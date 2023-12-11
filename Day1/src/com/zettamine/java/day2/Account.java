package com.zettamine.java.day2;

public class Account {
	protected long acNo;
	protected String name;
	protected double amount;
	
	public Account(long acNo, String name, double amount) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.amount = amount;
	}
	

	public long getAcNo() {
		return acNo;
	}


	public String getName() {
		return name;
	}


	public double getAmount() {
		return amount;
	}


	public double Deposit(double depAmount) {
		 double amt = this.amount + depAmount;
		 this.amount = amt;
		return amt;

	}
	
	public double withdraw(double withAmount) {
		double amt = amount - withAmount;
		this.amount = amt;
		 return amt;
		
	}
	
	public String details() {
		return "A/C NO: "+ acNo + " | NAME: "+ name +" | BALANCE: "+ amount;
	}
}

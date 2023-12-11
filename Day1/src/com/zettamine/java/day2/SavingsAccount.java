package com.zettamine.java.day2;

public class SavingsAccount extends Account {
	private int interest;

	public SavingsAccount(long acNo, String name, double amount, int interest) {
		super(acNo,name,amount);
		this.interest = interest;
	}

	public double calculateInterest() {
		return this.getAmount()*12*interest*0.001;
	}
	
}

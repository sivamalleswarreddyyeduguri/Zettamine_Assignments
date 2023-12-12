package com.zettamine.java.day4;

public class SavingsAccount extends Account {
	
	double minimumBalance;
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance-amount > minimumBalance) {
			setBalance(balance - amount);
			System.out.println(amount + " debited" + " | " + this.getBalance());
			return true;
		}
		System.out.println("false");
		return false;
	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	

}

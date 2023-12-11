package com.zettamine.java.day2;

public class CurrentAccount extends Account {

	private static int count;


	public CurrentAccount(long acNo, String name, double amount) {
		super(acNo,name,amount);
	}
	
	@Override
	public double Deposit(double depAmount) {
		count++;
		return super.Deposit(depAmount);
	}

	@Override
	public double withdraw(double withAmount) {
		count++;
		return super.withdraw(withAmount);
	}

	@Override
	public String details() {
		count++;
		return super.details();
	}

	public int serviceCharges() {
		int Limit=3;
		if(count>Limit) {
			int charges = (count-Limit)*100;
			  double amt = this.getAmount()-charges;
			  this.amount = amt;
			System.out.println("Balance left -----> "+getAmount());
			count = 0;    // After charges Again count will become to zero
			return charges;
		}
		return 0;
	}


}

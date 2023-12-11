package com.zettamine.java.day2;

import java.util.Scanner;

public class BankApplication {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
			Account acc = null;
	while(true) {
	System.out.print("1. Create Account\n"+ "2. Deposit\n"+ "3. Withdraw\n"+ "4. AccountDetails\n"+ "5. Interest Amount\n"+ "6. Service Charges\n"
	 + "7. Exit\n"+ "Please Enter your input: ");
		int option = scn.nextInt();
		scn.nextLine();
		if(option>=1 && option<=7) {
		switch(option) {
		case 1:
		if(acc!=null) {
		System.out.println("You have already Created your Bank Account");
		}
		while(acc==null) {
		System.out.print( "1. Savings Account\n"+ "2. Current Account\n"+ "Enter your input: ");
		int input = scn.nextInt();
		scn.nextLine();
		if(input==1 || input==2) {
		System.out.print("Enter Account number: ");
		long accNo = scn.nextLong();
		System.out.print("Enter the Account holder name: ");
		String name = scn.next();
		System.out.print("Enter initial Deposit amount: ");
		double initDeposit = scn.nextDouble();						
		acc = addAccount(input, accNo, name, initDeposit);
		System.out.println("---Welcome to our SBI Bank"+"-".repeat(10));
		if(acc!=null) {
			break;
		}
		}else {
			System.out.println("Please enter a valid input");
		}
		} // while loop end
		break;
		case 2:
			if(acc==null) {
				System.out.println("Please open an Account with us");
			}else {
				System.out.print("Enter the amount to deposit: ");
				double depAmount = scn.nextDouble();
				if(depAmount<=0) {
					System.out.println("---Please enter a valid Amount---");
					break;
				}
				double totalAmount = acc.Deposit(depAmount);
				System.out.println("DepositedAmount : "+depAmount+"Total Balance : "+totalAmount+" Credited");
			}
			break;
		case 3:
			if(acc==null) {
				System.out.println("Please open an Account with us");
			}else {
				System.out.print("Enter the amount to withdraw: ");
				double amtWithDraw = scn.nextDouble();
				if(amtWithDraw>acc.getAmount()) {
					System.out.println("Error----> Insufficient Balance");
					break;
				}
				if(amtWithDraw<=0) {
					System.out.println("---Not a valid Amount---");
					break;
				}
				double totalAmount = acc.withdraw(amtWithDraw);
				System.out.println("Withdrawn Amount : "+amtWithDraw+" Total Balance : "+totalAmount+"");
			}
			break;
		case 4:
			if(acc==null) {
				System.out.println("Please open an Account with us");
			}else {
				System.out.println(acc.details());;
			}
			break;
		case 5:
			if(acc==null) {
				System.out.println("Please open an Account with us");
			}else {
				if(acc instanceof SavingsAccount) {
					System.out.println("Yearly Based Interest is: "+((SavingsAccount)acc).calculateInterest());
				}
				else {
					System.out.println("This Account does not support this.");
				}
			}
			break;
		case 6:
			if(acc==null) {
				System.out.println("Please open an Account with us");
			}else {
				if(acc instanceof CurrentAccount) {
					System.out.println("Current Account Service Charges: "+((CurrentAccount)acc).serviceCharges());
				}
			}
			break;
		case 7:
			System.out.println("----BYE BYE----");
			System.exit(0);
		}// switch statement end
		
		}   //  if statement end
		else {
			System.out.println("Invalid Operation Please Try Again-->");
		}
	  }
	}
	
	public static Account addAccount(int input,long acNo,String name,double initDeposit) {
			if(input==1) {
				System.out.print("Enter Rate Of Interest of your bank: ");
					int inst = scn.nextInt();
				return new SavingsAccount(acNo, name, initDeposit, inst);
			}
			else {
				return new CurrentAccount(acNo, name, initDeposit);
			}
		}


}

package com.zettamine.java.day2;

public class EmployeeMain {

	public static void main(String[] args) {
		Loans loan = new Loans();
		Employee ee1 = new PermanentEmployee(01, "Siva Malleswar Reddy",424000 );
		Employee ee2 = new TemporaryEmployee(02, "Rohit", 20,1200 );
		double loanOfPermanentE = loan.calculateLoanAmount(ee2);
		double loanOfTemproryE = loan.calculateLoanAmount(ee1);
		System.out.println("Temporary Employee  Loan: "+loanOfTemproryE);
		System.out.println("Permanent Employee  Loan: "+loanOfPermanentE);

	}

}

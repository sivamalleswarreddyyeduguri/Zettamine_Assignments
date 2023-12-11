package com.zettamine.java.day2;

public class Loans {
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj instanceof PermanentEmployee) {
			employeeObj.calculateSalary();
			return employeeObj.getSalary()*0.15;
		}else {
			employeeObj.calculateSalary();
			return employeeObj.getSalary()*0.1;
		}
	}
}

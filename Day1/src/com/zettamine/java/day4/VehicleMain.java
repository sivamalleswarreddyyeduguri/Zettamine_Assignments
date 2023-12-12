package com.zettamine.java.day4;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Vehicle number: ");
		String vehicleNo = scn.next();
		System.out.print("Enter ModelName: ");
		String modelName = scn.next();
		System.out.print("Enter VehicleType: ");
		String vehicleType = scn.next();
		scn.nextLine();
		System.out.print("Enter vehicle price: ");
		double price = scn.nextDouble();
	
		Vehicle vehical = new Vehicle(vehicleNo, modelName, vehicleType, price);
		System.out.println(vehical.issueLoan());
		System.out.println(vehical.takeInsurance());
		
	}

}

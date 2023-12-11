package com.zettamine.java.day1;

import java.util.Scanner;

public class AverageAge {
	static Scanner Scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter total no. of employees:");
		int numberEmp = Scn.nextInt();
		int [] ages = new int[numberEmp];
		if(numberEmp >= 2) {
			System.out.println("Enter the age for " + numberEmp + " employees");
			for(int i = 0; i < numberEmp; i++) {
			int num = Scn.nextInt();
			if(num >= 28 && num <= 40) {
				ages[i] = num;
			}
			else {
				System.out.println("invalid age encountered!");
				  return;
			}
		}
			float averageAge =calculateAverage(ages);
			System.out.printf("The average age is %.2f", averageAge);
			  return;
		
	   }
		System.out.println("Please enter a valid employee count");
	
	}

	private static float calculateAverage(int [] ages) {
	    float average = 0;
		for(int i =0; i < ages.length; i++) {
			average+= ages[i];
		}
		return average/ages.length;
	}
}

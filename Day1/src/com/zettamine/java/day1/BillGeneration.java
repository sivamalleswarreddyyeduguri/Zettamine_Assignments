package com.zettamine.java.day1;

import java.util.Scanner;

public class BillGeneration {
	
	 Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought: ");
		int pizza = scn.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int puffs = scn.nextInt();
		System.out.print("Enter the no of cooldrinks bought: ");
		int cooldrinks = scn.nextInt();
		
		scn.close();
		
		System.out.println("Bill Details");
		System.out.println("No of Pizzas:"+" ".repeat(10)+pizza+" ".repeat(5)+"Cost:"+pizza*100);
		System.out.println("No of puffs:"+" ".repeat(11)+puffs+" ".repeat(5)+"Cost:"+puffs*20);
		System.out.println("No of coolDrinks:"+" ".repeat(7)+cooldrinks+" ".repeat(5)+"Cost:"+cooldrinks*10);
		System.out.println();
		System.out.println();
		float a =pizza*100 + puffs*20 + cooldrinks*10;
		System.out.printf("Total Price= %.2f",a);
		System.out.println();
		System.out.println("ENJOY THE SHOW!!!"); 
	}

}

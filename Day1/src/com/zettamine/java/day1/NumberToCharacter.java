package com.zettamine.java.day1;

import java.util.Scanner;

public class NumberToCharacter {
	

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		System.out.println("Enter 4 Numbers:");
		int numbers = 4;
		int [] num = new int [numbers];
		for(int i =0; i < numbers; i++) {
		  int val = Scn.nextInt();
		   num[i] = val;
		}
		Scn.close();
		printCharacters(num);
	}
	
	public static void  printCharacters(int [] values) {
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i] +"-"+(char)values[i]);
		}
	}

 }

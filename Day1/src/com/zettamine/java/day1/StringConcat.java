package com.zettamine.java.day1;

import java.util.Scanner;

public class StringConcat {
	
	 static Scanner Scn = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Inmate's name: ");
		String immateName = Scn.nextLine();
		System.out.print("Enter Inmate's father's name: ");
		String fathersName = Scn.nextLine();
		
		String concat = immateName.concat(fathersName);
		
		  for(char ch : concat.toCharArray()) {
			  if(Character.isDigit(ch)) {
				  System.out.println("Invalid name");
				  return;
			  }
		  }
		
			String s1 = immateName.toUpperCase();
			String s2 = fathersName.toUpperCase();
			String s3 = s1 + " " + s2;
			System.out.println(s3);
  }

}

package com.zettamine.java.day1;

import java.util.Scanner;

public class NumberToWords {
		
	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = Scn.nextInt();
		System.out.println(digitToWord(num));
		Scn.close();
	}
	
	public static String digitToWord(int num) {
		String word = "";
		  while(num > 0) {
			  int r = num % 10;
			  num = num /10;
			  switch(r) {
			  case 0 : 
			     String a= "zero";
			     word = a+" "+word;
			     break;
			      
			  case 1 :
				  String b = "one";
				  word = b+" "+word;
				     break;
				  
			  case 2 :
				  String d = "two";
				  word = d+" "+word;
				     break;
				  
			  case 3 :
				  String e = "three";
				  word = e+" "+word;
				     break;
			  case 4 :
				  String f = "four";
				  word = f+" "+word;
				     break;
			  case 5 :
				  String g = "five";
				  word = g+" "+word;
				     break;
			  case 6 :
				  String h = "six";
				  word = h+" "+word;
				     break;
			  case 7 :
				  String i = "seven";
				  word = i+" "+word;
				     break;
			  case 8 :
				  String j = "eight";
				  word = j+" "+word;
				     break;
			  case 9 :
				  String k = "nine";
				  word = k+" "+word;
				     break;
			  default : 
				  String y = "Not Found";
				  word = y+word;
			      break;
			  }
		  }
		  return word;
		
	}

}

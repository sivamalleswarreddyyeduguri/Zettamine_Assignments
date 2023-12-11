package com.zettamine.java.day1;

import java.util.ArrayList;
import java.util.Scanner;

public class LeastOffer {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
		 System.out.print("Enter the number of items: ");
		 int noOfItems = scn.nextInt();
		 
		 String [] mobile = new String[noOfItems];
		 int [] offer = new int[noOfItems];
		 System.out.println("Enter item details (name, price, discount percentage) separated by commas: ");
		 for(int i = 0; i < noOfItems; i++) {
			 String itemDetail = scn.next();
			 String [] details = itemDetail.split(",");
			  mobile[i] = details[0];
			  int a = Integer.parseInt(details[1]);
			  int b = Integer.parseInt(details[2]);
			  int c = a*(b)/100;
			  offer[i] = c;
		 }
		  ArrayList<String> al = new ArrayList<String>();
		  int n = 0;
		 for(int i = 1; i<offer.length; i++) {
			     if(offer[i] < offer[n]) {
			    	 n = i;
			     }
		 }
		  for(int i = 0; i<offer.length;i++) {
			  if(offer[n]== offer[i]) {
				  if(al.indexOf(mobile[i])== -1) {
				  al.add(mobile[i]);
				  }
			  }
		  }
		  scn.close();
		  System.out.print("Items with Minimum Discount: ");
		 for(String str : al)System.out.print(str+"\t");
		 
	}

}

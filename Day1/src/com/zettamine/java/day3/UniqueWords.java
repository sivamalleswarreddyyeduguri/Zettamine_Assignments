package com.zettamine.java.day3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class UniqueWords {
 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
         System.out.print("Enter the sentence: ");
		 String sentence = scn.nextLine();
		 String [] words = sentence.split("[^a-zA-Z]+");
		 HashSet<String> hset = new LinkedHashSet<String>();
		 for(String unique: words) hset.add(unique.toLowerCase());
         System.out.println("Number of words: "+ words.length);
         System.out.println("Number of Unique Words: "+ hset.size());
         System.out.println("The words are: " + hset);
         
         scn.close();
	}
		
}

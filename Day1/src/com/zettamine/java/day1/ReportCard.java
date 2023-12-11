package com.zettamine.java.day1;

import java.util.Scanner;

public class ReportCard {

	static Scanner scn = new Scanner(System.in);
	static int total = 0;
	
	public static void main(String[] args) {
		System.out.print("Enter the student name: ");
		String name = scn.nextLine();
		System.out.print("Enter the number of subjects: ");
		int numOfSubjects = scn.nextInt();
		int[] marks = addMarks(numOfSubjects);
		String [] names = new String [numOfSubjects];
		reportCardGenerator(names,name,marks);
	}
	
	public static int[] addMarks( int numOfSub) {
		int[] marks = new int[numOfSub];
		int subNum=1;
		for (int i = 0; i < marks.length; i++) {
			 System.out.print("Enter marks for subject - " + subNum++ + ": ");
			 marks[i] = scn.nextInt();
			 total+= marks[i];
		}
		return marks;
	}
	
	public static void  reportCardGenerator(String [] names,String name, int[] marks) {
		  
		
		for(int i = 0; i<marks.length; i++) {
			 System.out.print("Enter  subjectName - " + i+1 + ": ");
			names[i] = scn.next();
		}
		
		System.out.println("--".repeat(20) + "\n" 
		+" ".repeat(10) + "REPORT CARD");
		System.out.println("Name: " + name + "\n" + "--".repeat(20));
		
		System.out.println("Subjects"+" ".repeat(20)+ "Marks" +  "\n" + "--".repeat(20));
		for (int i = 0; i < marks.length; i++) {
			System.out.println(names[i]  + " ".repeat(20) +marks[i]);
		}
		System.out.print("--".repeat(20)+ "\n" + "Total: "+ total + " ".repeat(15));
		float avg = (float)total/marks.length;
		System.out.printf("Average : %.2f",avg);
	}


}

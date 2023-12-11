package com.zettamine.java.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfStudents {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws StudentException {
    ArrayList<Students> students = new ArrayList<Students>();
		
		do {
			System.out.println("enter student name and email: ");
			String name = sc.nextLine();
			
			if(!name.matches("[A-Za-z\\s]+")) {
				throw new StudentException("Invalid Name Exception");
			}  // Name Exception
			
			String email = sc.nextLine();
			
			if(!email.matches("[A-Za-z0-9.]*@[A-Za-z]+[.][A-Za-z]+")) {
				throw new StudentException("Invalid Email Exception");
			}  // Email Exception
			
			Students st = new Students(name, email);
			students.add(st);
			
			System.out.print("do you want to add more students?[Y/N] : ");
		}while(sc.nextLine().equalsIgnoreCase("Y"));
		System.out.println("  STUD_ID   |     STUDENT NAME      |     STUDENT EMAIL       |  COLLEGE NAME" );
		for(Students st : students) System.out.println(st);
	 }

}

package com.zettamine.java.day2;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		System.out.print("Enter Student's Id:");
		int id = Scn.nextInt();
		System.out.print("Enter Student's Name: ");
		String name = Scn.next();
		System.out.print("Enter Student's address: ");
		String address = Scn.next();
		System.out.print("is you from NIT(Yes/No): ");

		while(true) {
		String input = Scn.next();
			if(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no") ) {
				System.out.print("wrong input pls enter again: ");
			}
			else if(input.equalsIgnoreCase("yes")) {
				Student details = new Student(id, name, address);
				System.out.println("student's id: "+ details.getStudentId() );
				System.out.println("student name: " + details.getStudentName() );
				System.out.println("Address: " + details.getStudentAddress() );
				System.out.println("college name: " + "NIT" );
				break;
			}
			else {
				System.out.print
				("Enter the college Name: ");
				String clgName = Scn.next();
				Student detail = new Student(id, name, address, clgName);
				System.out.println("student's id: "+ detail.getStudentId() );
				System.out.println("student name: " + detail.getStudentName() );
				System.out.println("Address: " + detail.getStudentAddress() );
				System.out.println("College Name: " + detail.getCollegeName());
				break;
			}
		}
	}

}

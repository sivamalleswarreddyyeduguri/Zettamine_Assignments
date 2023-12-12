package com.zettamine.java.day4;

import java.util.Scanner;

public class StudentHostelMain {
	static Scanner scn = new Scanner(System.in);
	static Student stud;
	public static void main(String[] args) {
		
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int studentId = scn.nextInt();
		System.out.print("Student Name: ");
		String name = scn.next();
		System.out.print("Department Id: ");
		int deptId = scn.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = scn.next();
		System.out.print("Phone Number: ");
		String phoneNo = scn.next();
		while(true){
		if(!phoneNo.matches("^[6789][0-9]{9}")) {
			System.out.print("please enter a valid phone number: ");
			phoneNo = scn.next();
		}
		if(phoneNo.matches("^[6789][0-9]{9}")) {
			break;
		}
	}
		System.out.print("Hostel Name: ");
		String hostelName = scn.next();
		System.out.print("Room Number: ");
		int roomNum = scn.nextInt();
		
		Hosteller hosteller = new Hosteller(hostelName, roomNum);
		
		stud = new Student(studentId, name, deptId, gender, phoneNo, hosteller);
		getHostellerDetails();
		
		System.out.println("Student ID     :" + stud.getStudentId());
		System.out.println("Student Name   :" + stud.getName());
		System.out.println("Department ID  :" + stud.getDepartmentId());
		System.out.println("Gender         :" + stud.getGender());
		System.out.println("Phone Number   :" + stud.getPhone());
		System.out.println("Hostel Name    :" + stud.hosteller.getHostelName());
		System.out.println("Room Number    :" + stud.hosteller.getRoomNumber());
		
		

	}
	public static Hosteller getHostellerDetails() {
		  System.out.print("Modify room number(Y/N): ");
		  String input = scn.next();
		  if(input.equalsIgnoreCase("y")) {
			  System.out.print("New Room Number: ");
			  stud.hosteller.setRoomNumber(scn.nextInt());
		  }
		  System.out.print("Modify Phone number(Y/N): ");
		  String ModPhNo = scn.next();
		  if(ModPhNo.equalsIgnoreCase("y")) {
			  System.out.print("New Phone Number: ");
			  String phNo = scn.next();
			  while(true) {
			  if(phNo.matches("^[6789][0-9]{9}")) {
				  stud.setPhone(phNo);
				  break;
			  }
			  else {
				  System.out.print("Please enter a valid phone number: ");
			  }
			
		  }
	 }
		  scn.close();
		  return stud.hosteller;
		  
	}

}

package com.zettamine.java.day3;

import java.util.Scanner;

public class StudHostlMain {
	static Scanner Scn = new Scanner(System.in);
	static Student stud = new Hosteller();
	public static void main(String[] args) {
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int studentId = Scn.nextInt();
		System.out.print("Student Name: ");
		String name = Scn.next();
		System.out.print("Department Id: ");
		int deptId = Scn.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = Scn.next();
		System.out.print("Phone Number: ");
		String phoneNo = Scn.next();
		while(true){
		if(!phoneNo.matches("^[6789][0-9]{9}")) {
			System.out.print("please enter a valid phone number: ");
			phoneNo = Scn.next();
		}
		if(phoneNo.matches("^[6789][0-9]{9}")) {
			break;
		}
	}
		stud.setStudentId(studentId);
		stud.setName(name);
		stud.setDepartmentId(deptId);
		stud.setGender(gender);
		stud.setPhoneNo(phoneNo);
		
		
		Hosteller hostDetails = getHostellerDetails();
		System.out.println("Student ID: "+ ((Student)stud).getStudentId());
		System.out.println("Student Name: "+ ((Student)stud).getName());
		System.out.println("Department ID: "+ ((Student)stud).getDepartmentId());
		System.out.println("Student Gender: "+ ((Student)stud).getGender());
		System.out.println("Student PhoneNumber: "+ ((Student)stud).getPhoneNo());
		System.out.println("Hostel Name: "+ hostDetails.getHostelName());
		System.out.println("Room No: "+ hostDetails.getRoomNumber());
		
		
	}
	public static Hosteller getHostellerDetails() {
		  Hosteller host = new Hosteller();
		  System.out.print("Hostel Name: ");
		  String hostelname = Scn.next();
		  host.setHostelName(hostelname);
		  System.out.print("Room number: ");
		  int roomNo = Scn.nextInt();
		  System.out.print("Modify room number(Y/N): ");
		  String input = Scn.next();
		  if(input.equalsIgnoreCase("y")) {
			  System.out.print("New Room Number: ");
			  host.setRoomNumber(roomNo= Scn.nextInt());
		  }
		  host.setRoomNumber(roomNo);
		  System.out.print("Modify Phone number(Y/N): ");
		  String ModPhNo = Scn.next();
		  if(ModPhNo.equalsIgnoreCase("y")) {
			  System.out.print("New Phone Number: ");
			  String phNo = Scn.next();
			  while(true) {
			  if(phNo.matches("^[6789][0-9]{9}")) {
				  stud.setPhoneNo(phNo);
				  break;
			  }
			  else {
				  System.out.print("Please enter a valid phone number: ");
			  }
			
		  }
	 }
		  Scn.close();
		  return host;
		  
	}

}

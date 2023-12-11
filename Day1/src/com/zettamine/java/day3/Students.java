package com.zettamine.java.day3;

public class Students {
	private String studentId;
	private String studentName;
	private String studentEmail;
	static int id = 100;
	private static String collegeName = "Zettamine";
	public Students(String studentName, String studentEmail) {
		
		super();
		this.studentId = "ZETTA_"+(++id);
		this.studentName = studentName;
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return String.format("  %-11s|  %-21s|  %-25s|  %-12s", studentId, studentName, studentEmail, collegeName );
	}
}

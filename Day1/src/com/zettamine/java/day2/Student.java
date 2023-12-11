package com.zettamine.java.day2;

public class Student {
		private int studentId;
		private String studentName;
		private String studentAddress;
		private String collegeName;
		public Student(int studentId, String studentName, String studentAddress) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentAddress = studentAddress;
		}
		public Student(int studentId, String studentName, String studentAddress, String collegeName) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentAddress = studentAddress;
			this.collegeName = collegeName;
		}
		public int getStudentId() {
			return studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public String getStudentAddress() {
			return studentAddress;
		}
		public String getCollegeName() {
			return collegeName;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress="
					+ studentAddress + ", collegeName=" + collegeName + "]";
		}
		
}

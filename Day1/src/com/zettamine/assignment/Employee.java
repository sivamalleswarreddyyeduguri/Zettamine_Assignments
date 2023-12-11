package com.zettamine.assignment;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Comparable, Serializable {
      private int empId;
      private String empName;
       private int dno;
       public Employee() {
	}
	public Employee(int empId, String empName, int dno) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dno = dno;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	@Override
	public int hashCode() {
		return empId;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return dno == other.dno && empId == other.empId && Objects.equals(empName, other.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dno=" + dno + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		return this.empId - e.empId;
		
	}
       
}

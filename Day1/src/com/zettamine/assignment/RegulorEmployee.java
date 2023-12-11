package com.zettamine.assignment;

import java.io.Serializable;
import java.util.Objects;

public class RegulorEmployee extends Employee{
    private String PFNumber;
    public RegulorEmployee(int empId, String empName, int dno, String PFNumber) {
    	super(empId, empName, dno);
		this.PFNumber = PFNumber;
	}
	public String getPFNumber() {
		return PFNumber;
	}
	public void setPFNumber(String pFNumber) {
		PFNumber = pFNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(PFNumber);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegulorEmployee other = (RegulorEmployee) obj;
		return Objects.equals(PFNumber, other.PFNumber);
	}
	@Override
	public String toString() {
		return "RegulorEmployee [PFNumber=" + PFNumber + ", EmpId=" + getEmpId() + ", EmpName=" + getEmpName()
				+ ", Dno=" + getDno() + "]";
	}
	
    
}

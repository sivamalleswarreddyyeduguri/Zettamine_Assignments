package com.zettamine.assignment;

public class Student<T> {
	
	T id;
	String name;
	public Student(T id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	    
}

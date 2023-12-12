package com.zettamine.java.day4;

public class Sphere extends Shape implements Spatial {
	
	private double radius;
	
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return 4*Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double volume() {
		
		return (4*Math.PI*Math.pow(radius, 3))/3;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}

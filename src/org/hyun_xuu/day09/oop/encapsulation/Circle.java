package org.hyun_xuu.day09.oop.encapsulation;

public class Circle {
	private double radius;
	private String name;
	
	public Circle() {}
	
	//setter 메소드
	public void setradius(double radius) {
		this.radius = radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getter  메소드
	public double getradius() {
		return this.radius;
	}
	
	public String getName() {
		return this.name ;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*this.radius*this.radius;
				return area;
	}
}

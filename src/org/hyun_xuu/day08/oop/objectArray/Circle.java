package org.hyun_xuu.day08.oop.objectArray;

public class Circle {
	public int radius;
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = 3.14*this.radius*this.radius;
				return area;
	}
}

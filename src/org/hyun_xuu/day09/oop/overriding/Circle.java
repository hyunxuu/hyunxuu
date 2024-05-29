package org.hyun_xuu.day09.oop.overriding;

public class Circle extends Shape{
	@Override //생략 가능   (>> 어노테이션) @Override
	public void draw() {
		System.out.println("Circle");
	}
}

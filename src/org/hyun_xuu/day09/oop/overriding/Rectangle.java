package org.hyun_xuu.day09.oop.overriding;

public class Rectangle extends Shape{
	@Override
	public void draw() { //draw + ctrl+spacebar 자동완성
		// TODO Auto-generated method stub
//		super.draw();  >> 부모클래스에 출력문이 출력이 그대로 됨.
		System.out.println("Rectangle");  // Overriding 에 출력되는 내용
	}
}

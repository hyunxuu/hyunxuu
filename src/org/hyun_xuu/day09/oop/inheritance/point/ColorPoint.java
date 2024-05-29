package org.hyun_xuu.day09.oop.inheritance.point;

public class ColorPoint extends Point{
	private String color;
	
	public ColorPoint() {
		super(); // this() 처럼 생성자를 호출하는데 부모생성자를 호출함. 
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x,y);
//		this.x=x;
//		this.y=y;
		this.color=color;
	}
	
	public void showColorPoint() {
		super.showPoint();
		System.out.println(this.color+" 색의 점입니다.");
	}
	
}

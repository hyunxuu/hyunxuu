package org.hyun_xuu.day07.oop;

public class Circle {
	//반지름 , 이름
	public String circleName;
	public double radius;
	
	public void setRadius(double redius) {
		this.radius=redius;
	}
	
	// 넓이 구하기
	public double getArea() {	//void 를 double로 변경해서 소수점 사용가능
		//return 을 사용하면 public 옆에 리턴값과 같은 데이터 타입을 사용해야함.
		return 3.14*this.radius*this.radius;
	}
}

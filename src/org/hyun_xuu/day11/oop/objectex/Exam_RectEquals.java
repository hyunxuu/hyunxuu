package org.hyun_xuu.day11.oop.objectex;

class Rectangle{
	int width,heigt;
	
	public Rectangle() {}
	public Rectangle(int width, int heigt) {
		this.width=width;
		this.heigt=heigt;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Rectangle rect = (Rectangle)obj;  		//다운캐스팅
		if(width ==rect.width && heigt ==rect.heigt) { // >> rect1,2 의 주소가 아니라 값을 비교함. 
		//if(width*heigt ==rect.width*rect.heigt) {
			return true;
		}else {
			return false;
		}
	//	return super.equals(obj);
	}
	
}

public class Exam_RectEquals {

	public static void main(String[] args) {
		Rectangle rect1 =new Rectangle(5,7);
		Rectangle rect2 = new Rectangle(5,7);
		// rect1==rect2 >> 주소는 달라서 이렇게 비교하면 false 나옴
		if(rect1.equals(rect2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}
}

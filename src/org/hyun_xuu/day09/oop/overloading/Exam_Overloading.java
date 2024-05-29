package org.hyun_xuu.day09.oop.overloading;

class Weapon {
	String name;
	int price;
	
	public Weapon() {}
	public Weapon(String name, int price) {
		this.name=name;
		this.price=price;
	}
}
	
	public  class Exam_Overloading{
		public static void main(String[] args) {
		/*
		 * 메소드 오버로딩
		 * 이름은 같으나 매개변수의 갯수나 타입이 달라야 적용됨.
		 * 오버로딩 ex) System.out.println("");
		 */
			System.out.println(" int 같은 저장공간을 따로 기입하지 않아도 되게 함");
		}
		
		public void makesomenoise() {}
		
		public void makesomenoise(int num) {}
	}


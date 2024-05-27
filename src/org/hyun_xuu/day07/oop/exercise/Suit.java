package org.hyun_xuu.day07.oop.exercise;

public class Suit {
	
	public static void main(String [] args) {
		Suit s = new Suit(100);
	}
	
	private int size;
	private String brand;
	private int price;
	
	public Suit(int size) {  		//> (1)아래 생성자 메서드 호출
		this(size,"Hazzys");
		System.out.println("Suit(int)호출 !!"); // > (5)아래서 출력 끝나면 다음순으로 여기 출력됨
	}
	public Suit(int size,String brand) {		//>(2) 아래 생성자 메서드 호출
		this(size,brand,100000);
		System.out.println("Suit(int,String)호출"); // > (4)아래 출력완료되면 여기서 다시 완료 끝내고 출력함.
	}
	public Suit(int size,String brand,int price) {  //>> (3)마지막 메서드라 출력됨
		this.size=size;
		this.brand=brand;
		this.price=price;
		System.out.println("Suit(int,String,int)호출");
	}
}

package org.hyun_xuu.day10.oop.polymorphism;

class Car{}

class Sonata extends Car{}

class Genesis extends Car{}

class GV80 extends Genesis{}


public class Exam_InstanceOf {
	
	static void print(Car car) {
		if(car instanceof Sonata) {
			System.out.println("소나타 방방");
		}
		if(car instanceof Genesis) {
			System.out.println("제네시스 부릉");
		}
		if(car instanceof GV80) {
			System.out.println("GV80 고고씽"); //car와 genesis 두개를 상속받아 두가지 Sysout이 모두 출력됨.
		}
	}
	
	public static void main(String[] args) {
		print(new Car());
		print(new Sonata());
		print(new Genesis());
		print(new GV80());
		
	}
}

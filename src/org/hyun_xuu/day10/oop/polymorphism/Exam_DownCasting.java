package org.hyun_xuu.day10.oop.polymorphism;


class Person{
	String name;
	String id;
	
	public Person() {}
	public Person(String name, String id) {
		this.name=name;
		this.id=id;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student() {
		
	}
	public Student(String grade, String department) {
		this.grade=grade;
		this.department=department;
	}
}

public class Exam_DownCasting {
	public static void main(String [] args) {
		Person p=new Student(); //업캐스팅
								//상속관계인 경우 사용 가능.
		System.out.println(p.name);
		System.out.println(p.id);
		
		//다운캐스팅 하기전엔 student의 변수가 적용이 안됨.
		System.out.println(((Student)p).grade);  //(다운캐스팅 하기 전 >)grade,department cannot be resolved or is not a field
		System.out.println(((Student)p).department);
	}
}

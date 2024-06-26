package org.hyun_xuu.day09.oop.polymorphism;

class Person {
	String name;
	String id;
	
	public Person () {}
	public Person(String name, String id) {
		this.name =name;
		this.id=id;
	}
}

class Student extends Person{
	String grade;
	String separtment;
	
	public Student() {}
}

class Worker extends Person{}

class Doctor extends Person{}

public class Exam_upcasting {
	public static void main(String[] args) {
		Person p = new Person();
		Student s =new Student();
		p = s;
		p= new Worker();
		p= new Doctor();
		
		p.id= "@@";
		
		System.out.println("id 명 : "+p.id);
	}
}

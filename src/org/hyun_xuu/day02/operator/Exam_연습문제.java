package org.hyun_xuu.day02.operator;

public class Exam_연습문제 {
	public static void main(String[] args) {
	//<Quiz>
	int a = 5;
	int b = 10;
	int c = (++a) + b; //6+10 = 16
	int d = c / a; // 16/5=3
	int e = c % a; // 16 % 5 = 1
	int f = e++; //1
	int g = (--b) + (d--); // 9+3= 12
	int h = 2; // 2
	int i = a++ + b / (--c / f) * (g-- - d) % (++e + h); //6+10 /(15/1)*(12-3)%(2+2) 

	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("c : " + c);
	System.out.println("d : " + d);
	System.out.println("e : " + e);
	System.out.println("f : " + f);
	System.out.println("g : " + g);
	System.out.println("h : " + h);
	System.out.println("i : " + i);
	
	
}
}

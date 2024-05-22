package org.hyun_xuu.day03.control.loop;

public class Exam_01_for {
	public static void main(String [] args) {
		//반복문
		// 실행문징을 원하는 횟수만큼 반복 해줌
		// 문법
		// for(초기식; 조건식; 증감식) { 실행문장; }
		System.out.print(0);
		System.out.print(1);
		System.out.print(2);
		// ... ~ // System.out.print(10); (10까지 다 출력)
		// 초기문을 바깥에 선언하는 법 > >  int i;
		for(int i=0;i<11;i++) {
			System.out.print(i); //print로 출력 > 가로출력 //println으로 출력 > 세로로 출력됨(엔터효과)
		}
	}
}

package org.hyun_xuu.day04.control.loop;

public class Exam_Fordouble {
	public static void main(String [] args) {
		//중첩 for문 문법
		// for () { for() {} }
		//for문(;;i++) 은 i+=2 / i*=2 로 변경 가능
		// - 복합대입 연산자
		// i = i=1; > i+=1; // i=i*2; > i*=2;
		
		for(int j =2; j<10; j++) {	 	 // 구구단을 2단부터 9단까지 출력
			for(int i= 2; i<10; i++) {  // 구구단 
			System.out.println(j+"x"+i+"="+(j*i));
			}
		}
	}
}

package org.hyun_xuu.day02.printbasic;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.println("사용");
		System.out.print("문자 \n");
		
		//형식 문자
		//1. 정수 : %d 
		//2. 실수 : %f
		//3. 문자 : %c
		//4. 문자열 : %s
		//> printf 출력문자 마지막에 \n을 적어줘야 enter효과로 출력됨.
		System.out.printf("정수 출력 : %d, 문자출력 : %s\n", 1023, "일공이삼");
		System.out.println("end");
		// "%f 사이 .1 /.2 등 소수점 자리 출력 까지 설정 가능."
		System.out.printf("개강날짜 : %.1f, 종강날짜 : %.2f \n",5.7,10.23);
		
	}
}

package org.hyun_xuu.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		//논리연산자
		// 남자이면서 평균 평점 4.3이상인  사람 > and
		// 컴퓨터공학과 또는 경영학과인 사람    > or
		boolean result1, result2, result3, result4, result5, result6, result7, result8, result9, result10;
//		boolean result2;		
//		boolean result3;
//		boolean result4;
		//and > &&, or > || 
		int num1 = 50;
		int num2 = 30;
		result1 = (num1 > num2)&&(num1 < num2); //&& 는 두 식 모두 true 여야 true 가 나옴
		System.out.println("결과값1:"+result1);
		
		result2 = (num1 > num2 )||(num1 == num2); //||는 두식 중 한가지 식만 true여도 true 가 나옴
		System.out.println("결과값2 :"+result2);
		
		//연습 문제
		
		int a = 50;
		int b = 30;
		result3 = (a!=b) && (a<b); //(true)&&(false) = false
		result4 = (a<b) || (a!=b); //(false) || (true) = true
		result5 = (a>b) && (a!=b); //(true) && (true) = true
		result6 = (a>b) || (a==b); //(true) || (false) = true
		System.out.println("결과1:"+result3);
		System.out.println("결과2:"+result4);
		System.out.println("결과3:"+result5);
		System.out.println("결과4:"+result6);
		
		int c= 70;
		int d= 55;
		result7 = (c==d) || (c++ < 100); // (false) || (true) =true
		result8 = (c<d) && (c==d); // (false) && (false) = false
		result9 = (c!=d) && (d-- < c++); // (true) && (true) = true
		result10 = (c++ != d) || (d++ >= 85); // (true) || (false) = true
		System.out.println("결과5:"+result7);
		System.out.println("결과6:"+result8);
		System.out.println("결과7:"+result9);
		System.out.println("결과8:"+result10);
		System.out.println("c:"+c+",d:"+d);
	}
}

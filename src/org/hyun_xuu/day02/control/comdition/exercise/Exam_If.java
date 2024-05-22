package org.hyun_xuu.day02.control.comdition.exercise;

import java.util.Scanner;

public class Exam_If {
	public static void main(String [] args) {
		//제어문 - 조건문
		// 삼항 연산자와 같음
		// 문법 > if(조건식){실행문장;}
		
		//예제1. 입력받은 정수가 짝수인지 홀수인지 판별하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		if(input%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
//		String result = (input%2==0)? "짝수":"홀수";
//		System.out.println(result + "입니다.");
		
		 // 예제2. 입력받은 정수가 양의 정수인지 음의정수인지 0인지 판별하는 코드작성
		if(input > 0) {
			System.out.println("양의 정수 입니다.");
		}else if(input == 0) {
			System.out.println("0입니다.");
		}else {
			System.out.println("음의 정수 입니다.");
		}
		
		//삼항연산자
		String result =(input == 0) ? "0" : (input > 0) ? "양의정수":"음의정수" ;
		System.out.println(result + "입니다.(삼항)");
//	 같은 출력
//		if(input != 0) {
//			if(input > 0) {
//				System.out.println("양의 정수 입니다.");
//			}else {
//				System.out.println("음의 정수 입니다.");
//			}
//		}else {
//			System.out.println("0입니다.");
//		}
	}
	

}


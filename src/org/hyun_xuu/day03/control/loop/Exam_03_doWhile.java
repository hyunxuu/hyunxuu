package org.hyun_xuu.day03.control.loop;

import java.util.Scanner;

public class Exam_03_doWhile {
	public static void main(String[] args) {
		// do ~ while 문법
		// 초기식;
		// do{
		//	실행문장; 증감식;
		//} while(조건식)
		
		// while 문을 이용하여 -1이 입력될때까지 정수를 입력받자. -1입력시 합계출력
		Scanner sc = new Scanner(System.in);
		int num =0, sum = 0 ;
		
		do {
			System.out.print("정수 입력 :");
			num= sc.nextInt();
			sum += num;
		}while(num != -1);
		System.out.println("총합 :"+ sum);
	}
}

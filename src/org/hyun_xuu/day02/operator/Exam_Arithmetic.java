package org.hyun_xuu.day02.operator;

import java.util.Scanner;

public class Exam_Arithmetic {
	public static void main(String [] args) {
	//산술연산
	//+ - * / %(나머지값 구하는 연산)
	// 문제 1
	// 초 단위의 정수를 입력받고 몇시간,몇분,몇초 인지 출력하는 프로그램 만들기
		Scanner sc = new Scanner(System.in);
		System.out.println("초 단위를 입력해 주세요");
		int time = sc.nextInt();
		
		//5000/60 = 1(hour0
		//83%60 =23 (minute)
		//5000 %60 = 20(second)
		int hour = time / 60 / 60;
		int minute = (time / 60) % 60;
		int second = time % 60;
		System.out.println(hour+"시간"+minute+"분"+second+"초입니다.");
	
	}
	
}

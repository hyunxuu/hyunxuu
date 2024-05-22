package org.hyun_xuu.day02.control.comdition.exercise;

import java.util.Scanner;

public class Exercise_If3 {
	public static void main(String [] args) {
		//점수를 입력받아 등급을 알려주는 코드 작성
		// 점수를 입력해 주세요 : 92점 > 학점 A
		//단, 점수는 0~100사이의 수를 입력해야함.
		//100이상의 점수는 0~100사이의 수를 입력해 주세요 라고 출력
		// 커트라인 ( 90~100 A, 80~89 B,70~79 c,60~69 D , 그외 F) 
		//문제3
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요.");
		int score = sc.nextInt();
		
		char grade;
		
		if(score >= 90 && score <= 100) {
			System.out.println("A등급입니다.");
		}else if(score >= 80 && score <=89) {
			System.out.println("B등급입니다.");
		}else if(score >= 70 && score <=79) {
			System.out.println("C등급입니다.");
		}else if(score >= 60 && score <=69) {
			System.out.println("D등급입니다.");
		}else if(score >= 0 && score <=59) {
			System.out.println("F등급입니다.");
		}else {
			System.out.println("0~100까지의 숫자만 입력해 주세요.");
		}
		

	}
}

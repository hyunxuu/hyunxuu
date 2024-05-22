package org.hyun_xuu.day03.control.condition;

import java.util.Scanner;

public class Exercise_Switch2 {
	public static void main(String [] args) {
		//점수를 입력받아 등급을 알려주는 코드 작성
		// 점수를 입력해 주세요 : 92점 > 학점 A
		//단, 점수는 0~100사이의 수를 입력해야함.
		//100이상의 점수는 0~100사이의 수를 입력해 주세요 라고 출력
		// 커트라인 ( 90~100 A, 80~89 B,70~79 c,60~69 D , 그외 F) 
		//문제2
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요");
		int score = sc.nextInt();
		
		// 점수에서 10을 나눠 10이 나오면 100점, 9가나오면 90점 대...//
		switch(score/10) {
		case 10 :
			System.out.println("학점은 A입니다.");
			break;
		case 9 :
			System.out.println("학점은 A입니다.");
			break;
		case 8 :
			System.out.println("학점은 B입니다.");
			break;
		case 7 :
			System.out.println("학점은 C입니다.");
			break;
		case 6 :
			System.out.println("학점은 D입니다.");
			break;
			default :
				System.out.println("학점은 F입니다.");
		}
	}
}

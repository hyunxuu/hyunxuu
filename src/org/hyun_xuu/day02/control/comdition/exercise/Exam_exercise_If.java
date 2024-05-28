package org.hyun_xuu.day02.control.comdition.exercise;

import java.util.Scanner;

public class Exam_exercise_If {

	public void exercise_if1() {
		//점수와 학년을 정수로 입력받아 60점 이상이면 합격
		//60점 미만이면 불합격을 출력한다.
		//단 , 4학년의 경우 70점 이상이어야 합격을 출력하는 코드를 작성하시오.
		//문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요.");
		int score = sc.nextInt();
		System.out.print("학년을 입력해 주세요.");
		int grade = sc.nextInt();
		
		if(score >= 60 && grade !=4) {
			System.out.println("합격입니다.");
		}else if(score >= 70 && grade ==4) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}}

	public void exercise_if2() {
		//커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 커피를 주문하시겠어요 ? 가격을 알려드립니다.
		// (에스프레소,카푸치노,카페라떼,아메리카노)
		// 메뉴별 가격 / 없는 메뉴입니다.
		//문제2
		Scanner sc= new Scanner(System.in);
		System.out.print("커피를 입력해 주세요. 가격을 알려드립니다.");
		String menu = sc.next();
		
		
		//문자열 비교는 == 사용불가함 , equals / contains 로 사용함 (두 태그 같음)//
		if(menu.equals("에스프레소")) {
			System.out.println("3000원");
		}else if(menu.equals("카푸치노")) {
			System.out.println("3500원");
		}else if(menu.equals("카페라떼")) {
			System.out.println("3300원");
		}else if(menu.equals("아메리카노")) {
			System.out.println("3000원");
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	public void exercise_if3(){
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
		}}
	
	public void exercise_1() {
		//점수와 학년을 정수로 입력받아 60점 이상이면 합격
		//60점 미만이면 불합격을 출력한다.
		//단 , 4학년의 경우 70점 이상이어야 합격을 출력하는 코드를 작성하시오.
		//문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요.");
		int score = sc.nextInt();
		System.out.print("학년을 입력해 주세요.");
		int grade = sc.nextInt();
		
		if(score >= 60 && grade !=4) {
			System.out.println("합격입니다.");
		}else if(score >= 70 && grade ==4) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
	
	public void exercise_2() {
		//커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 커피를 주문하시겠어요 ? 가격을 알려드립니다.
		// (에스프레소,카푸치노,카페라떼,아메리카노)
		// 메뉴별 가격 / 없는 메뉴입니다.
		//문제2
		Scanner sc= new Scanner(System.in);
		System.out.print("커피를 입력해 주세요. 가격을 알려드립니다.");
		String menu = sc.next();
		
		
		//문자열 비교는 == 사용불가함 , equals / contains 로 사용함 (두 태그 같음)//
		if(menu.equals("에스프레소")) {
			System.out.println("3000원");
		}else if(menu.equals("카푸치노")) {
			System.out.println("3500원");
		}else if(menu.equals("카페라떼")) {
			System.out.println("3300원");
		}else if(menu.equals("아메리카노")) {
			System.out.println("3000원");
		} else {
			System.out.println("없는 메뉴입니다.");
		}
	}
	
	public void exercise_3(){
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


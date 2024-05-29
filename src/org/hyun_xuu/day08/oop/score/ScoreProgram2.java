package org.hyun_xuu.day08.oop.score;

import java.util.Scanner;



public class ScoreProgram2 {
	
	static int kor ;
	static int eng ;
	static int math;		// 맨아래 메소드 안에서 같은 변수를 쓰기 위해서 class 안,메소드 밖에 선언한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		
		
		end :
		while(true) {
			int choice = printMenu1();   //코드보기 단축키 ctrl+클릭, 지우기 alt+ < (방향키)
			
			switch(choice) {
			case 1: 
				inputScore2();
				break;
			case 2: 
				printScore3();
				break;
			case 3: 
				displayMsg("프로그램을 종료합니다.");
				break end;
			default : displayMsg("1~3 사이의 수를 입력해 주세요.");
			
			}
		}
	}
	
	
	
	public static int printMenu1() {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("==== 메인메뉴 ====");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.종료");
		System.out.println("선택: ");
		int choice = sc.nextInt();
		return choice; 				
	}
	
	private static void inputScore2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
		
	}
	
	private static void displayMsg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	private static void printScore3() {
		// TODO Auto-generated method stub

		System.out.println("==== 성적 출력 ====");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3);
	}


	

}

package org.hyun_xuu.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram1 {
	public static void main(String[] args) {
//		==== 메인 메뉴 ====
//		1.성적입력
//		2.성적출력
//		3.종료
//		선택:
		Scanner sc = new Scanner(System.in);
		int kor=0 ,eng=0 ,math=0;
		
		happy : 		// while 문 break 뒤에 붙여 그 부분의 반복을 끝냈음 이유: 레이블.. 명칭이 안정해져 있음 ㅋㅋ ??
	while(true) {
		printMenu();

		int choice = sc.nextInt();

		switch(choice) {
		case 1 : 
			System.out.println("==== 성적 입력 ====");
			System.out.println("국어 : ");
			kor = sc.nextInt();
			System.out.println("영어 : ");
			eng = sc.nextInt();
			System.out.println("수학 : ");
			math = sc.nextInt();
			break;
		case 2 : 
			System.out.println("==== 성적 출력 ====");
			System.out.println("국어 : "+kor);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
			System.out.println("총점 : "+(kor+eng+math));
			System.out.println("평균 : "+(kor+eng+math)/3.0);
			break;
		case 3 : 
			System.out.println(" 프로그램이 종료되었습니다. ");
			break happy; //아예 끝내기
		case 4: 
			System.out.println(" 1~3사이의 숫자를 입력해 주세요. ");
			break;
		}
	}
		
		
//if 문으로 작성 하였을때 >> 
		
//		if(choice ==1 ) {
////			==== 성적 입력 ====
////			국어 : 
////			영어 :
////			수학 :
//		}else if(choice==2) {
////			==== 성적 출력 ====
////			국어 : 
////			영어 :
////			수학 :
////			총점 :
////			평균 :
//			
//		}else if(choice==3) {
////			프로그램이 종료 되었습니다.
//		}else {
////			1~3 사이의 숫자만 입력해 주세요.
//		}
	}
	public static void printMenu() {
		System.out.println("==== 메인메뉴 ====");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.종료");
		System.out.println("선택: ");
	}
}

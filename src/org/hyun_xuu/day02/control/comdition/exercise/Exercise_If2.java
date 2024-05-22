package org.hyun_xuu.day02.control.comdition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args) {
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

}

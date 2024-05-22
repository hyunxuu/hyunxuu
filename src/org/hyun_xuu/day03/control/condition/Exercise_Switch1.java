package org.hyun_xuu.day03.control.condition;

import java.util.Scanner;

public class Exercise_Switch1 {
	public static void main(String [] args) {
		//커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		// 커피를 주문하시겠어요 ? 가격을 알려드립니다.
		// (에스프레소,카푸치노,카페라떼,아메리카노)
		// 메뉴별 가격 / 없는 메뉴입니다.
		//문제1
		Scanner sc= new Scanner(System.in);
		System.out.println("커피메뉴를 입력해 주세요. 가격을 알려드립니다.");
		String menu=sc.next();
		
//		switch(menu) {
//		case "에스프레소" : 
//			System.out.println("2000원");
//			break;
//		case "카푸치노" : 
//			System.out.println("3000원");
//			break;
//		case "카페라떼" : 
//			System.out.println("3000원");
//			break;
//		case "아메리카노" : 
//			System.out.println("2500원");
//			break;
//			default :
//				System.out.println("없는 메뉴 입니다.");
//		}
		int price = 0;
		
		switch(menu) {
		case "에스프레소" : 
			price = 2000;
			break;
		case "카푸치노" : 
			price = 3000;
			break;
		case "카페라떼" : 
			price = 3000;
			break;
		case "아메리카노" : 
			price = 2500;
			break;
			default :
				System.out.println("없는 메뉴 입니다.");
		}
		if(price != 0) //price가 없는 값일 때 출력이 안된다. dfault가 동작했을때 false 인값은 출력이 안됨.
			System.out.println(price+"원 입니다.");
	}
}

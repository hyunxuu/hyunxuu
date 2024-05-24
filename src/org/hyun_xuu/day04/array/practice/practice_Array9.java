package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array9 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 입력해 주세요 :");
		String[] menu = {"후라이드","양념치킨","옛날치킨","간장치킨"};
		String ch = sc.next();
		
		for(int i=0; i< menu.length ; i++) {
			if(menu[i].equals(ch)) {
				System.out.println(ch+" 배달 가능합니다.");
				return;
			}
		} System.out.println(ch+" 은 없는 메뉴입니다.");
	}
}

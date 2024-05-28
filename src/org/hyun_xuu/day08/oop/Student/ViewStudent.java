package org.hyun_xuu.day08.oop.Student;

import java.util.Scanner;

public class ViewStudent {

	public ViewStudent() {}
	
	public int printMenu() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		System.out.println("==== 메인메뉴 ====");
		System.out.println("1.성적 입력");
		System.out.println("2.성적 출력");
		System.out.println("3.종료");
		System.out.println("선택: ");
		int choice = sc.nextInt();
		return choice;  //return 은 값이 저장되어 메서드 밖의 식에도 choice값이 적용되게 함.
	}

	public void displayMsg(String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

}

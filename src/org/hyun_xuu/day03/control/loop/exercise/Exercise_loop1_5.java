package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_5 {
	public static void main(String [] args) {
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int dan = sc.nextInt();							// 단수 입력
		
		for(int i=1; i<=9; i++) {          				// 구구단이니까 9까지 곱할 수 있게 9<= 로 지정
			System.out.println(dan+"x"+i+"="+(dan*i));  // 단수X1~9= dan*i
		}
	}
}

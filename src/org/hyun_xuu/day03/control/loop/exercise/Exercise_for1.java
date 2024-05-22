package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_for1 {
	public static void main(String [] args ) {
		 //정수 하나를 입력 받아 그 수가 1~9사이의 수일때만 그 수의 구구단을 출력하세요.
		//단, 조건이 맞지 않을때 1~9사이의 양수를 입력하여야 합니다를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력 :");
		int dan = sc.nextInt();
		
		if(dan<2 || dan>9) {
			System.out.println("2~9사이 숫자들만 입력해 주세요");
		}else {
			System.out.println(dan+"단:");
			for (int i = 1; i<=9;i++) {
				System.out.println(dan+ "x"+i+"="+(dan*i));
			}
//			for (int i = 1; i<=9;i++) {  >> 이 for문으로 입력 구구단 출력 모두 가능
//				System.out.println(dan+ "x"+i+"="+(dan*i));}
		}
	}
}

package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_1 {
	public static void main(String [] args) {
		//1번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요");
		int num = sc.nextInt();
		int i = 1;
		
		if(num>=1) {
			for(i=1; i<=num; i++) {
			System.out.print(i+" ");
			}
		}else {
			System.out.println("0이하 숫자 X");
		}
	}
}


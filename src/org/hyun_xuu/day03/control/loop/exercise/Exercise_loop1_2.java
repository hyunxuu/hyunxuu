package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_2 {
	public static void main(String [] args) {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		if(num >=1) {
			while (i <= num) {
				System.out.print(num);
				num--; 
			}
		}else {
			System.out.println("1보다 작은 정수 X");    //없어도 됨, 1보다 작으면 출력 안됨.
		}
	}
}

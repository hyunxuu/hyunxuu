package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_3 {
	public static void main(String [] args) {
		//3번
		// 1부터 사용자에게 입력 받은 
		// 수 까지의 정수들의 합을 for문을 이용하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요: ");
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		} System.out.println("1부터"+num+"까지 수의 합: "+sum);
		
	}
}

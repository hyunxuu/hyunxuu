package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_6 {
	public static void main(String [] args) {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요.");
		int dan = sc.nextInt();
		
		if(dan>=10) {
			System.out.println("10이하의 수만 입력 가능");
		}else { 
			for(int i = 1; i<=dan; i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
		}
	}
}

package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop1_4 {
	public static void main(String [] args) {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2 = sc.nextInt();
		
		if( num1<1 || num2<1) {    				// 1미만의 수가 입력됬을때.
			System.out.println("1이상의 정수만 입력해 주세요.");
		}else {
			if(num1<num2) { 
				for(int i=num1; i<=num2; i++) {  //첫번째 정수가 더 컸을때.
				System.out.print(i+" ");}
			}else 
				{for(int i=num2; i<=num1;i++) {  //두번째 정수가 더 컸을때.
					System.out.print(i+" ");
				}
			}
		}
    }
}

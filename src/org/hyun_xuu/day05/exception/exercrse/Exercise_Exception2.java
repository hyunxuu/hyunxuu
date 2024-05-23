package org.hyun_xuu.day05.exception.exercrse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception2 {
	public static void main(String [] args) {
		//문제 2 3개의 정수를 입력받아 합을 구하는 프로그램을 작성해라
		//사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외처리를 해 InputMismatchException다시 입력
		//정수 3개를 입력하세요. 1 2 3 합:6
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요:");
		int sum = 0;
		
		for(int i =0; i<3; i++) {
			try {	
				sum +=sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("정수로 입력해 주세요.");
				sc.next();
				i--;      //** 중요 **
			}
		} System.out.print("합은 :"+sum);
	}
}

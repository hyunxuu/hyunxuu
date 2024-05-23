package org.hyun_xuu.day05.exception.exercrse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception1 {
	public static void main(String [] args) {
		//문제 1 정수를 0으로 나누는 경우레 "0으로 나눌 수 없습니다!" 를
		//출력받고 다시 입력 받는 프로그램
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		while(true) {
			int result = 0;

			try {
				System.out.print("첫번째 정수: ");
				num1 = sc.nextInt();
				System.out.print("두번째 정수: ");
				num2 = sc.nextInt();
				result = num1/num2;
				}catch (InputMismatchException e) {
					System.out.print("문자를 입력하셨습니다.\n");
					sc.next();
					continue;
				}catch (ArithmeticException e) {
					System.out.print("0으로 나눌 수 없습니다./n");
					continue;
				}				
			System.out.print(num1+"에 "+num2+"를 나눈 값은 :"+result+"\n");
		}
	}
}

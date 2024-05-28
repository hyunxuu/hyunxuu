package org.hyun_xuu.day05.exception.exercrse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void Exercise_01() {
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
	
	public void Exercise_02() {
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

	public void Exercise_03() {
		//문제 3 배열의 인덱스가 범위를 벗어날때 발생하는 
		//ArrayIndexOutOfBoundsException을 처리하는 프로그램
		int[] intArrs = new int[5];
		
		try {
			System.out.println(intArrs[5]);  // 0~4까지라 5는 벗어남
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}

	}
	
	public void Exercise_04() {
		//문제 4 문자열을 정수로 변환할 때 발생하는 
		//NumberFormatExecption을 처리 하는 프로그램
		String[] words = {"507","10.23",""};
		// String -> int
		
		try {
			int result = Integer.parseInt(words[0]);
			System.out.println(result);
			int result2 = Integer.parseInt(words[1]);
			System.out.println(result2);
			int result3 = Integer.parseInt(words[2]);
			System.out.println(result3);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
		}

	}

	public void Exercise_05() {
		//문제 5 NullPointerException
		String word = null;
		
		try {
			if(word.equals("키위")) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("다릅니다");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null값을 참조 하였습니다.");
			// .앞이 null인데 명령어를 작성함
		}
	}
}

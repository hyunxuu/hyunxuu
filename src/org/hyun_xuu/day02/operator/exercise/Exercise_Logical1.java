package org.hyun_xuu.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터100까지의 수를 입력하세요.");
		int inVal = sc.nextInt();
		boolean result;
		result = 1<=inVal && 100>=inVal ;
		System.out.println("1부터 100사이의 숫자인가?"+result);
	}
}

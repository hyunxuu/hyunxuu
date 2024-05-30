package org.hyun_xuu.day10.oop.abstractex.exersice;

import java.util.Scanner;

public class CalcRun{
	public static void main(String[] args) {
		Calculator calc = new GoodCalc(); // > GoodCalc calc = new GoodCalc 와 같음.
//		Scanner sc = new Scanner(System.in);
//		System.out.println("더할 숫자 2가지를 입력해 주세요 : ");
//		int i = sc.nextInt();
//		int j = sc.nextInt();
//		System.out.println("빼기 할 숫자 2가지를 입력해 주세요 : ");
//		int h = sc.nextInt();
//		int l = sc.nextInt();
//		System.out.println("평균을 구할 숫자를 4가지 입력하세요 : ");
//		int ㅋ = sc.nextInt();
//		int ㅌ = sc.nextInt();
//		int ㅊ = sc.nextInt();
//		int ㅍ = sc.nextInt();
		
		int[] array = {5,7,10,23};
		
		System.out.println("합 : "+calc.add(5,7));   	//Scanner 선언된 변수들을 대입하여 입력한 결과를 출력 받을 수 있음.
		System.out.println("차 : "+calc.substract(10,23));
		System.out.println("평균 방법1 : "+calc.average(array));
		System.out.println("평균 방법2 : "+calc.average(new int[] {5,7,10,23}));
	}
}

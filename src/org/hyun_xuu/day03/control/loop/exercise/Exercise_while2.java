package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_while2 {
	public static void main(String [] args ) {
		//while문을 이용하여 -1이 입력될 때까지 정수를 입력받고
		//-1이 입력되면 입력한 수의 합을 출력하시오. 문제2
		Scanner sc = new Scanner(System.in);
		int i =0;
		int sum = 0;

//		while(i<10) {  // num을 Scanner에 선언 하며 while 안에서 계속 반복 입력하게 할 수 있다.
//			System.out.print("정수입력 :");
//			int num = sc.nextInt();
//			
//			if(num==-1)  //입력선언된 num에 -1을 입력하면 break; 아래식이 출력됨.
//				break;
//			
//			sum += num ;
//			i++;
//		} System.out.println("총합:"+sum);
		System.out.print("정수 입력");
		while ((i = sc.nextInt()) != -1) {
			sum += i;
			System.out.print("정수 입력:");
		}
		System.out.println("총합 :" + sum);
	}
}

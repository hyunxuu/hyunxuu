package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_while1 {
	public static void main(String [] args ) {
		//while문을 이용해 1~100사이 홀수의 합을 출력하시오
		//1~100 사이 홀수의 합 : 문제1
//		int i=0;
//		int sum=0; //선언
//		
//		while (i <= 100) {   //if에 i++을 적용하면 반복안됨. 한번만 증가하게 됨
//			if(i%2!=0) {
//				sum += i;
//			}
//			i++;
//		}
////		int i=0; (다른 방법)
////		int sum=0; //선언
//		
////		while (i++<100) {
////			if(i%2 ==1) sum+=i;
////		} System.out.println("합:"+sum);
//		
//		
//			System.out.print("1부터 100사이 홀수의 합 : "+sum);
//	}

		int i = 1;
		int sum = 0;
		while (i < 100) {
			sum += i;
			i += 2;
		}
		System.out.println("합 :" + sum);

	}
}

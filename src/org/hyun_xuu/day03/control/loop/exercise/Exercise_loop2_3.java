package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop2_3 {
	public static void main(String [] args) {
		System.out.print("출력할 별의 개수 :");
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int line =1; line<=i; line++) {
			for(int star =1; star<=line; star++) {  //line==star로 시도 ㄴㄴ 무제한 출력됨.
				System.out.print("*");
			}System.out.println();
		}
	}
}

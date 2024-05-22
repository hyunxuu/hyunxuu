package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop2_2 {
	public static void main(String [] args) {
		System.out.print("출력하고 싶은 별의 개수 :");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();  //개수 입력
		
		for(int line=1; line<=i; line++) { //줄을 1에서 i만큼 늘림
			for(int star=1; star<=line; star++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}
		
		for(int line=i-1; line>=1; line--) { //줄을 i에서 1로 줄임
			for(int star=1; star<=line; star++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}
	}
}

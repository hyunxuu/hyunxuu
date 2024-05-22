package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array7 {
	public static void main(String [] args) {
		System.out.print("배열 길이: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		int[] arry = new int[length];
		
		for(int i=0; i<length; i++) {
			System.out.print("배열의"+i+"번째 인덱스 값: ");
			arry[i]=sc.nextInt();
		}System.out.print("배열의 값: ");
		
		
	}
}

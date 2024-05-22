package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
			int num = sc.nextInt();
			int[] arrs = new int[num];
			
			if(num>0) {
			for(int i=0;i<num;i++) {
				arrs[i] = i+1;
			System.out.print((arrs[i] = i+1) +" ");
			}
		}
	} 
}

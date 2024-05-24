package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
			int num = sc.nextInt();
			int[] arrs = new int[num];
			
			if(num<1) {
				System.out.print("1이상의 수로 입력해 주세요.");
			}else {
			for(int i=0;i<num;i++) {
				arrs[i] = i+1;
			System.out.print((arrs[i] = i+1) +" ");
			}
		} // 배열은 음수로 배열되지 않아서 뭐 어쩌고 방법은 있겟지만 음수입력하면 에러뜸.
	} 
}

package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array8 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int length;
		
		while(true) {
			System.out.print("정수 입력: ");
			length = sc.nextInt();
			if(length>=3 && length%2 != 0) {	//3보다크고 홀수여야 실행됨.
				break;
			}else {
				System.out.println("홀수, 3 이상의 수로 입력 ㄱ");
			}
		}
		int[] arry = new int[length];			//입력할 정수 만들기
		int mid=length/2;						//중간자리 만들기
		
		for(int i=0; i<=mid; i++) {				//중간 전자리까지
			arry[i] = i+1;
		}
		for(int i=mid+1; i<length; i++) {  		//중간자리부터 내려가는 곳
			arry[i] = length-i;
		} 
		for(int v : arry) {
			System.out.print(v);
		}
	}
}


package org.hyun_xuu.day04.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main(String [] args) {
		//배열의 lenght 필드를 이용해 배열 크기만큼 입력받고 평균을 구해라
		//단 배열의 크기는 5
		int[] nums=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		
		//정수 입력 5번하고 배열에 저장
		for(int i =0; i<5;i++) {
			System.out.print("정수입력:");
			nums[i] = sc.nextInt();
			sum+= nums[i];
		}System.out.println("평균:"+(double)sum/nums.length);
		
		//배열에 있는 값을 꺼내서 평균출력
//		for(int i=0;i<5;i++) {
//		sum+= nums[i];
//		}  ^위 for문에서 한번에 출력 가능
		
//		sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];

		//배열에 있는 값 꺼내서 평균구하기
	}
}

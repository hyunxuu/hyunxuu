package org.hyun_xuu.day06.array.sort;

import java.util.Scanner;

public class Exercise_sort_Question1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);

		int arr[]= new int[5];
		
		for(int n=0; n<arr.length; n++) {
			System.out.print((n+1)+"번째 입력: ");
			int num = sc.nextInt();
			arr[n]=num;
		}
			
		for(int i=0; i<=arr.length; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) 
				{int temp = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.print("정렬 결과 : ");	
		for(int num1 : arr) {
			System.out.print(num1);
		}
//		int f1 = arr[0];
//		int fi1 = arr[4];
//		int sum = f1+fi1;
			System.out.print("\n정렬 후 첫번째,마지막 수의 합: "+(arr[0]+arr[4]));
	} //문자+ 정수 같이 출력할 땐 식은 묶어줘야 함.
}

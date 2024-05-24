package org.hyun_xuu.day06.array.sort;

public class Exam_ArraySort {
	public static void main(String [] args) {
//		정렬
//		크기가 5인 배열이 있을때 크기 순으로 정렬하는 법 24 5 7 10 23
//		01. 정렬 알고리즘
//		문제해결을 하기 위한 절차나 방법, 프로그래밍 언어로 어떻게 해결하는지.
//		02. 정렬 알고리즘 종류
//		1.삽입정렬 2.선택정렬 3.버블정렬 4.퀵정렬 5.병합정렬
		
		//자리바꿈 발생
		int num1 =5;
		int num2 = 7;
		System.out.printf("num1 :%d, num2:%d\n" ,num1 , num2);
		//num1 에는 7 num2에는 5가 들어가도록 해야 할 때
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.printf("num1 :%s, num2:%s\n",num1,num2);
		
		int nums[] = {2,1,3};
		//3, 2, 1 로 변경
		num1 =nums[0];
		num2 =nums[2];
		temp = num1;
		nums[0] = num2;
		nums[2] = temp;
		
		temp = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		
		for(int num : nums) {
			System.out.print(num+" ");
		}System.out.println(" ");
		
		int[] opens = {24, 5, 7};
		int temp2 = opens[0];
		
		opens[0] = opens[1];
		opens[1] = temp2;
		temp2 = opens[1];
		opens[1] = opens[2];
		opens[2] = temp2;
		
	for(int open : opens) {
		System.out.print(open+" ");
	}
	}
}

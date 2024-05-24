package org.hyun_xuu.day04.array.practice;

public class practice_Array1 {
	public static void main(String [] args) {
		//문제1
		int[] array = new int[10];
		
		for(int i=0;i<10;i++) {  			//배열이 10개면 0~9이기 때문에 10과 같다고 하면 에러남.
			array[i]=i+1;					//배열(array)안에 공간(i)이라고 태그해줘야 출력됨.
			System.out.print(array[i]+" ");
		}
	}
}

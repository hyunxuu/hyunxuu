package org.hyun_xuu.day06.array.sort;

public class Exam_Bubblesort {
	public static void main(String [] args) {
		// 버블 정렬
		//인접한 두개의 원소를 검사하여 정렬하는 방법
		// 구현이 쉽다, 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		// 기본적으로 다른 정렬에 비해 속도가 느리고 역순으로 정렬 할때 가장느림 (근데 쉬워서 씀)
		int[] arrs = {2,5,4,1,3};
		
		for(int i=0; i<arrs.length; i++) {			//i= for문 돌때마다 1씩 증가(비교 범위가 점점 줄어듦)
			for(int j=0; j<arrs.length-1-i; j++) { //j=비교할 기준이 되는 인덱스, i-1 범위까지 진행됨
				if(arrs[j]>arrs[j+1]) {				//j자리에 있는 값이 비교자리(우측)보다 크면 이동한다.
					int temp = arrs[j+1];
					arrs[j+1]=arrs[j];
					arrs[j]=temp;
				}
			}
		} for ( int num : arrs) {
			System.out.print(num+" ");
		}
	}
}

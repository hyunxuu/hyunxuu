package org.hyun_xuu.day06.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		//삽입 정렬
		//정렬 알고리즘 중에 하나, 가장 간단한 기본
		// 배열의 n번 인덱스 값을 0번에서 n-1번 인덱스까지 비교
		//n은 1부터 시작
		// {2,5,4,1,3} >> 5와 2를 비교 > 변경 x
		int[] arrs = {14,5,3,8,21};
		
		for(int i=1; i<arrs.length; i++) {
			for(int j=i; j>=1; j--) {
				if(arrs[j-1]>arrs[j]) {
				int temp = arrs[j];   	// 변수생성하여 1번자리수 삽입
				arrs[j] = arrs[j-1];	// 1에 0번 자릿수 삽입
				arrs[j-1] = temp;		// 0에 1자리수 삽입된 변수 삽입
				}
			}
		}
		//정렬 결과 출력
		for(int num : arrs) {
		System.out.print(num+" ");
		}
	}
}

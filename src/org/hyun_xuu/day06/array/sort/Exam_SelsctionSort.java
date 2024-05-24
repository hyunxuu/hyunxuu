package org.hyun_xuu.day06.array.sort;

public class Exam_SelsctionSort {
	public static void main(String[] args) {

			//선택 정렬
			// 배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나감
			// 특징 : 데이터 양이 적을 때 좋음
			// 배열 n번 인덱스값을 n+1~마지막 인덱스 까지 비교
			int[] arrs = {2,5,4,1,3};
			
			for(int i=0; i<4; i++) {
				int min = i;
				for(int j=i+1; j<5; j++) {
					if(arrs[min]>arrs[j]) {
						min=j;				//최소값이 정해졌을때 arrs[min]으로 구하면 최소값
					}
				}
				int temp = arrs[i];
				arrs[i] = arrs[min];
				arrs[min] = temp;
			}
			for(int num : arrs) { 
			System.out.print(num+" ");
			}	
				// if(arrs[0] > arrs[1]) {
				// // 니가 최소값이야
				// }
				// if(arrs[0] > arrs[2]) {
				// // 니가 최소값이야
				// }
				// if(arrs[0] > arrs[3]) {
				// // 니가 최소값이야
				// }
				// if(arrs[0] > arrs[4]) {
				// // 니가 최소값이야
				// }
				// int temp = arrs[0];
				// arrs[0] = 최소값;
				// 최소값의 자리 = temp;
				//
				// if(arrs[1] > arrs[2]) {
				// // 니가 최소값이야
				// }
				// if(arrs[1] > arrs[3]) {
				// // 니가 최소값이야
				// }
				// if(arrs[1] > arrs[4]) {
				// // 니가 최소값이야
				// }
				// int temp = arrs[1];
				// arrs[1] = 최소값;
				// 최소값의 자리 = temp;
				//
				// if(arrs[2] > arrs[3]) {
				// // 니가 최소값이야
				// }
				// if(arrs[2] > arrs[4]) {
				// // 니가 최소값이야
				// }
				// int temp = arrs[2];
				// arrs[2] = 최소값;
				// 최소값의 자리 = temp;
				//
				// if(arrs[3] > arrs[4]) {
				// // 니가 최소값이야
				// }
				// int temp = arrs[3];
				// arrs[3] = 최소값;
				// 최소값의 자리 = temp;
	}
}

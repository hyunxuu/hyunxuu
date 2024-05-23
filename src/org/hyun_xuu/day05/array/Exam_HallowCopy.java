package org.hyun_xuu.day05.array;

public class Exam_HallowCopy {
	public static void main(String [] args) {
		//얉은 배열 복사
		int[] arrs = new int[4];
		for(int i=0; i<arrs.length; i++) {
			arrs[i]=i*i;
		}
		int[] copy=arrs;
		copy[1]=11;
		//for-esch문 이전 식 >> sor(int i=0;i<arrs.length; i++){}
		for(int i:arrs) {
			System.out.print(i+" ");
		}
		System.out.println("");

		for(int i:copy) {
			System.out.print(i+" ");
		}

	}
}

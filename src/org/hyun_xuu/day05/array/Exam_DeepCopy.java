package org.hyun_xuu.day05.array;

public class Exam_DeepCopy {
	public static void main(String [] args) {
		//깊은 복사
		int[] arrs= {0,1,4,9};
		int[] copy= new int[4];  // > 현재 4가지 배열 자리만 가져옴.{0,0,0,0}임 /{0,1,4,9}배열 자리는 못가져옴.
		for(int i=0; i<arrs.length; i++) {
			copy[i]=arrs[i];
		}
		copy[1]=11;
		for(int i:copy) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i:arrs) {
			System.out.print(i+" ");
		}
	}
}

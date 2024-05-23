package org.hyun_xuu.day05.dimarray;

public class Exam_DimArray {
	public static void main(String [] args) {
		int[][] dimNums=new int[4][3];
		System.out.println("행의 길이: "+dimNums.length);
		System.out.println("열의 길이: "+dimNums[0].length);
		
		int k = 1;
		int[][] arrs = new int[4][4];
		arrs[2]=new int[6];					//arrs2번 배열에 길이를 6으로 선언함.
		//2차원 배열 값 입력하기
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" ");
			} System.out.println("");
		}
		
//for-each > for(int[] i : arrs){				^위 식을 for-each문으로 대체 가능
//				for(int j : i){
//				System.out.print( j+" ");}
//				} System.out.println("");
	}
}


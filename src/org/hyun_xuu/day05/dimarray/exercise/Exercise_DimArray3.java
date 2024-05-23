package org.hyun_xuu.day05.dimarray.exercise;

public class Exercise_DimArray3 {
	public static void main(String [] args) {
		int[][] arrs = new int[5][5];
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[j][i] = (i+1)*5-j ;			// < 여기나
			}
		}
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" \t"); //< 여기 i,j 순서 바꿈 (가로열/세로열 변경)
			} System.out.println("");
		}
	}
}

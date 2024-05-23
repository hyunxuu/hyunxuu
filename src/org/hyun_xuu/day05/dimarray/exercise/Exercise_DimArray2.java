package org.hyun_xuu.day05.dimarray.exercise;

public class Exercise_DimArray2 {
	public static void main(String [] args) {
		int n = 1;
		int[][] arrs = new int[5][5];
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[i][j] = n;
				n++;
			}
		}
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.print(arrs[j][i]+" \t");
			} System.out.println("");
		}
	}
}

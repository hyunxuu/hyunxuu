package org.hyun_xuu.day05.dimarray.exercise;

public class Exercise_DimArray1 {
	public static void main(String [] args) {
		int[][] arrs = new int[5][5];
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[i][j] = (i+1)*5-j ;
				
			}
		}
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" \t");
			} System.out.println("");
		}
	}
}

package org.hyun_xuu.day05.dimarray.exercise;

public class Exercise_DimArray4 {
	public static void main(String [] args) {
		int[][] arrs = new int[6][6];
		
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				if(i%2 == 1) {
				arrs[i][j] = (i+1)*arrs[i].length-j ;
				}else {
				arrs[i][j] = (i+0)*arrs[i].length+j+1;}
			}
		}
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.print(arrs[i][j]+" \t");
			} System.out.println("");
		}
	}
}

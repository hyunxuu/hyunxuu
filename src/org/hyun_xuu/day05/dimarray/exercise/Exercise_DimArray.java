package org.hyun_xuu.day05.dimarray.exercise;

public class Exercise_DimArray {

	public void practice1() {
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

	public void practice2() {
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

	public void practice3() {
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
	
	public void practice4() {
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

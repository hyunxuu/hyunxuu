package org.hyun_xuu.day00.prectice;

import java.util.Scanner;

public class practice {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		while(true) {
			System.out.print("단수 입력 : ");
			int i = sc.nextInt();
		if(i >= 2 && i<= 9) {
			for(int dan=1; 9>=dan; dan++) {
				int avg = dan*i;
				System.out.printf("%d x %d = %d\n" , i,dan, avg);
			}
		}else {System.out.println("단수를 입력");}
		}
	}
}

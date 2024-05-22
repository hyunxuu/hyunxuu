package org.hyun_xuu.day04.control.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		for(int line = 1;line<=10;line++) {     
			for(int star=1;star<=line;star++) {
				System.out.print("*");            //line안에 맞추기 위해 ln빼기
			}System.out.println("");			// line은 엔터효과?아랫줄로 이동
		}
	}
}

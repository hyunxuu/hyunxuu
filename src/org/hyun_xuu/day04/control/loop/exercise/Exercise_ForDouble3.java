package org.hyun_xuu.day04.control.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		//2단을 세로로 출력,그옆에 세로로 3단,4단 출력
		
		for(int dan=1;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(i+"x"+dan+"="+(i*dan));
				System.out.print("\t");         // "|t" tap만큼 띄어줘서 균일하게 정리됨.
			}		System.out.println("");
		}
	}
}

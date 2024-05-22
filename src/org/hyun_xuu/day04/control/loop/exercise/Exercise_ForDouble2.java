package org.hyun_xuu.day04.control.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args) {
		//0시 0분 ~23시 59분까지 출력
		//안보고 푼 문제 개꿀
		for(int h = 0; h<24; h++) {
			for(int m=0;m<60;m++) {
				System.out.println(h+"시"+m+"분");
			}
		}
	}
}

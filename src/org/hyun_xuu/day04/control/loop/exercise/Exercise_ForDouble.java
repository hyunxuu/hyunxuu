package org.hyun_xuu.day04.control.loop.exercise;

import java.util.Scanner;

public class Exercise_ForDouble {

	public void Exercise_01() {
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
	
	public void Exercise_02() {
		//0시 0분 ~23시 59분까지 출력
		//안보고 푼 문제 개꿀
		for(int h = 0; h<24; h++) {
			for(int m=0;m<60;m++) {
				System.out.println(h+"시"+m+"분");
			}
		}
	}
		
	public void Exercise_03() {
			//2단을 세로로 출력,그옆에 세로로 3단,4단 출력
			
			for(int dan=1;dan<=9;dan++) {
				for(int i=1;i<=9;i++) {
					System.out.print(i+"x"+dan+"="+(i*dan));
					System.out.print("\t");         // "|t" tap만큼 띄어줘서 균일하게 정리됨.
				}		System.out.println("");
		}
	}
	
	public void Exercise_04() {
		//별 반피라미드 모양
		System.out.print("출력하고 싶은 별의 개수 :");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();  //개수 입력

		for(int star=1; star<=i; star++) { //줄을 1에서 i만큼 늘림
			for(int line=1; line<=star; line++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}

		for(int star=i-1; star>=1; star--) { //줄을 i에서 1로 줄임
			for(int line=1; line<=star; line++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}
	}
}


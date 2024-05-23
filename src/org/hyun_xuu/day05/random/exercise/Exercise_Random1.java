package org.hyun_xuu.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {
	public static void main(String[] args) {
		//동전 앞뒤 맞추기 게임 
		// 1.앞면 / 2.뒷면 : 1 > 맞췄습니다.
		Scanner sc = new Scanner(System.in)	;
//		Random rand = new Random(); 

		
		while(true) {
		System.out.print("숫자를 입력해주세요 (1.앞면/2.뒷면)");
		int ch = sc.nextInt();
		if(ch==-1)break;
		int num=(int)(Math.random()*2)+1;
		if(num==ch) {
			System.out.println("맞췄습니다.");
		}else {System.out.println("틀렸습니다.");}
		}
	}
}

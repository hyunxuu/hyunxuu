package org.hyun_xuu.day05.random;

import java.util.Random;

public class Exam_Random {
	public static void main(String [] args) {
//		Random rand = new Random();  //Random 객체 선언(Math.random() 쓸때 생략 가능)
//		
//		for(int i=0; i<10; i++) {
//			int num =rand.nextInt(10);   //태그 변수에 등록(0~9사이 랜덤 수)
//			System.out.print(num);
//			
		
		// 25~36 사이의 랜덤한 수를 출력 하시오
		//rand.nextInt(11)+25
//		
//		int num =rand.nextInt(10);  	// Random 변수 등록
//			for(int i=0; i<10; i++) {
//			num =rand.nextInt(10)+1; //0~9사이에서 1~10사이로 변경
//			System.out.print(num);
//			}
		
			for(int i = 0; i<100;i++) {
//double randNum=Math.random();  이 값을 아래 식 정수만 나오게 변경
			int randNum=(int)(Math.random()*10); //0~9사이 값
			//1~10 사이값
			//(int)(Math.random()*10)+1;
			System.out.println(randNum);
			}
		}
	}



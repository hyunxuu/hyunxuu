package org.hyun_xuu.day02.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		//char a = 'A' + 1;
		//a='a'+1;
		//System.out.println("문자 :"+a);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력해 주세요 :");
		char word= sc.next().charAt(0);
		boolean result = word>=65 && word<=90;
		System.out.println("영어 대문자 확인 :"+ result);
		// ASCII 코드 대문자 : 65~90 , 소문자 :97~122 //
		
	}
}

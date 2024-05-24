package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String object=sc.next();
		int count = 0;
		
		int size=object.length();
		char[] word=new char[size];
		
		for(int i=0; i<object.length();i++) {
			word[i]=object.charAt(i);
		}System.out.print("검색문자: ");
		
		char search = sc.next().charAt(0);
		System.out.print(object+"에 "+search+"가 존재하는 위치: ");
		for(int i=0; i<word.length;i++) {
			if(word[i]==search) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+search+" 개수"+count);
	}
}

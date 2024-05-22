package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array5 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열:");
		String object = sc.next();
		int count= 0;
		
		int size = object.length();
		char[] word = new char[size]; //만들어진 문자배열은 입력한 문자열의 길이만큼 크기를 가져야 함.
		
		for(int i=0;i<object.length(); i++) {  //"문자열".length() "문자열"의 길이가 구해짐. 문(0)자(1)열(2) 길이:3
			word[i] = object.charAt(i); 		//"문자열".charAt(0) "문자열" 안에 0번째에 해당하는 문자를 가져옴 0번:문 1번:자 와 같음.
		}System.out.print("검색문자: ");
		
		char search = sc.next().charAt(0);
		System.out.print(object+"에 "+search+"가 존재하는 위치(인덱스): " );
		for(int i=0; i<word.length;i++) {	//배열.length >(소괄호 안붙음.)/하면 배열의 크기가 구해짐
			if(word[i]==search) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("");
		System.out.println(search+" 개수: "+count);
	}
}

package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array_10 {
	public static void main(String [] args) {
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-입력): ");
		String idnum = sc.next();				//입력 선언
		char[] id = new char[idnum.length()];  //배열 선언
		for(int i=0; i<id.length; i++) {
			id[i]= idnum.charAt(i);
		}
		char[] copy=new char[id.length];
		for(int i=0; i<id.length; i++) {
			//copy[i]=id[i];
			if(i<8) {						//배열자리는 0~7까지가 8번째 숫자임.
				copy[i]=id[i];
			}else {
				copy[i]='*';
			}
		} for(char num:copy) {
			System.out.print(num);
		}
	}
}
	

package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array6 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String[] day = {"월","화","수","목","금","토","일"};
		System.out.print("0~6사이 숫자: ");
		int week = sc.nextInt();
		
		if(week>7||week<0) {System.out.println("잘못 입력함");
		}else {
			for(int i=week;week>=i;) {
				System.out.println(day[i]+"요일");
				break;
			}
		}
	}

}

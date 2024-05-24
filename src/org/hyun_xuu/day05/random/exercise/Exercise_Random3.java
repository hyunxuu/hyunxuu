package org.hyun_xuu.day05.random.exercise;

import java.util.Random; //<< 임포트
import java.util.Scanner;

public class Exercise_Random3 {
	public static void main(String[] args) {
		//가위 바위 보 2
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------가위바위보 GAME START-----------");
		
		do {
			System.out.print("가위 / 바위 / 보 중에 한가지를 입력해주세요 :");
			String me = sc.next();
			System.out.println("-----------GAME SCORE-----------");
			// 내가 입력한 "@@"이 String 변수로 == 을 만들고 시퍼용
			System.out.println(">>   당신은 "+me+"를 냈습니다.   <<");      // 내가 입력한 값 출력
			
			String[] options = {"가위", "바위", "보"}; 					    // 스트링으로 배열 변수를 설정
			int randomIndex = (int) (Math.random() * 3);					// Math.random();은0.1~0.9까지를 출력하기 때문에 *3으로 세가지를 출력할 수 있게함. 
			String com = options[randomIndex]; 
			
			System.out.println(">>  컴퓨터는 "+com+"를 냈습니다.  <<");
			
			if(com.equals(me)) {											// com == me
				System.out.println("####비겼습니다. 다시 시작합니다.####");
			}else {
				boolean win = false;										//false 일때 else가 실행됨.
					
				if(com.equals("가위")) {									// 이기는 경우 설정 (true)
					if(me.equals("바위"))win = true;
				}else if(com.equals("바위")) {
					if(me.equals("보")) win = true;
				}else {if(me.equals("가위"))win = true;
			    }
				
				if(win) {
					System.out.println("-------------YOU WIN-------------");
					break;
				}else {
					System.out.println("-------------YOU LOSE-------------");
					break;
				}
			}
		}while(true);
	}
}

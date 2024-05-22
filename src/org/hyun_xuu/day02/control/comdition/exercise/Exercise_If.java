package org.hyun_xuu.day02.control.comdition.exercise;

import java.util.Scanner;

public class Exercise_If {
	public static void main(String [] args) {
		//점수와 학년을 정수로 입력받아 60점 이상이면 합격
		//60점 미만이면 불합격을 출력한다.
		//단 , 4학년의 경우 70점 이상이어야 합격을 출력하는 코드를 작성하시오.
		//문제1
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해 주세요.");
		int score = sc.nextInt();
		System.out.print("학년을 입력해 주세요.");
		int grade = sc.nextInt();
		
		if(score >= 60 && grade !=4) {
			System.out.println("합격입니다.");
		}else if(score >= 70 && grade ==4) {
			System.out.println("합격 입니다.");
		} else {
			System.out.println("불합격 입니다.");
		}
	}
}

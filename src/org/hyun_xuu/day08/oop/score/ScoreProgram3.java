package org.hyun_xuu.day08.oop.score;

import java.util.Scanner;

public class ScoreProgram3 {
	public static void main(String[] args) {
		Student student = new Student();
		
		end:
		while(true) {
			int choice = student.printMenu();  //여기 오류나면 private인지 확인하고 public으로 고치면 사용가능해짐.
			switch(choice) {
			case 1 : 
				student.inputScore();
				break;
			case 2 : 
				student.printScore();
				break;
			case 3 : 
				student.displayMsg("프로그램을 종료합니다.");
				break end;
			default : 
				student.displayMsg("1~3 사이의 숫자를 입력해 주세요");
				break;
			}
		}
	}
}

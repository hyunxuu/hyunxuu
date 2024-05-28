package org.hyun_xuu.day08.oop.Student;

import org.hyun_xuu.day08.oop.score.Student;

public class StudentApp {
	public static void main(String [] args) {
		ManagerStudent student = new ManagerStudent();
		ViewStudent view = new ViewStudent();
			
			end:
			while(true) {
				int choice = view.printMenu();  //여기 오류나면 private인지 확인하고 public으로 고치면 사용가능해짐.
				switch(choice) {
				case 1 : 
					student.inputScore();
					break;
				case 2 : 
					student.printScore();
					break;
				case 3 : 
					view.displayMsg("프로그램을 종료합니다.");
					break end;
				default : 
					view.displayMsg("1~3 사이의 숫자를 입력해 주세요");
					break;
				
			}
		}
	}
}

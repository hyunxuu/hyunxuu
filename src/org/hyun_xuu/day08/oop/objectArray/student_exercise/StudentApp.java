package org.hyun_xuu.day08.oop.objectArray.student_exercise;

import java.util.Scanner;

import org.hyun_xuu.day08.oop.objectArray.Book;

public class StudentApp {


	public static void main(String[] args) {
		ManagerStudent mng = new ManagerStudent();
		ViewStudent view = new ViewStudent();
		끝 :
		while(true) {
			int input = view.printMenu();
			Student [] students = null;
			switch(input) {
			case 1 :
				//mng.inputInfo();
				students = view.displayInput();
				mng.inputInfo(students);
				break;
			case 2 : 
				//mng.printInfo();
				students = mng.printInfo();
				view.displayInfo(students);
				break;
			case 3 :
				view.displayMsg("프로그램을 종료합니다.");
				break 끝;
			default : 
				view.displayMsg("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}

}

package org.hyun_xuu.day12.collection.student;

import java.util.List;

public class StudentRun {
	public static void main(String[] args) {
		ManageStudent mng = new ManageStudent();
		ViewStudent view =new ViewStudent();
		end:
		while(true) {
			int input = view.printMenu();
			switch(input) {
			case 1:
				Student std=view.inputStudent();
				mng.registerStudent(std);
				break;
			case 2:
				break;
			case 3:
				List<Student> stdList = mng.selsctAllStudent();
				view.disPlayStudents(stdList);
				break;
			case 4:
				break;
			case 5:
				
				break;
			case 6:
				break;
			case 0:
				view.disPlayMsg("프로그램을 종료합니다.");
				break end;
			default :
				view.disPlayMsg("1~3 사이의 수를 입력해 주세요.");
			}
		}
	}
}

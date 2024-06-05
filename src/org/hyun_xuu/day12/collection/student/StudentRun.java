package org.hyun_xuu.day12.collection.student;

import java.util.List;
import java.util.Map;

public class StudentRun {
	

	public static void main(String[] args) { 
		String name = "";
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
				String searchName = view.inputName("검색");
				view.displayStudent(mng.searchOneByName(searchName));
				break;
			case 3:
				List<Student> stdList = mng.selsctAllStudent();
				view.displayStudents(stdList);
				break;
			case 4:
				name : view.inputName("수정");
				Map<String, Object> result =mng.searchModifyStudent(name);
				Student student = view.modifyStudent((Student)result.get("student"));
				mng.modifyStudent((int)result.get("insdex"), student);
				break;
			case 5:
				name = view.inputName("삭제");
				int index =mng.searchIndexByName(name);
				mng.deleteStudent(index);
				break;
			case 6:
				name = view.inputName("재평가 여부를 확인");
				student = mng.searchOneByName(name);
				String passResult =checkPass(student);
				view.displayMsg(passResult);
				break;
			case 0:
				view.displayMsg("프로그램을 종료합니다.");
				break end;
			default :
				view.displayMsg("1~3 사이의 수를 입력해 주세요.");
			}
		}
	}
	public static String checkPass(Student student) {
		int first =student.getFirstScore();
		int second =student.getSecondScore();
		
		
		double avg = (first+second)/(double)2;
		if(avg >= 60) {
			if(first<40) {
				return("1차 재평가");
			}else if(second<40) {
				return("2차 재평가");
			}else {
				return("모두 통과 입니다.");
			}
		}else {
			String result = "";
			if(first < 60 ) {
				result += "1차 시험 재평가";
			}
			if(second < 60) {
				result += "2차 시험 재평가";
			}
			return result;
		}
	}
}

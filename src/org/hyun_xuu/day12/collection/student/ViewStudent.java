package org.hyun_xuu.day12.collection.student;

import java.util.List;
import java.util.Scanner;

public class ViewStudent {

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 성적 관리 프로그램");
		System.out.println("1. 학생 정보 입력 ");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu =sc.nextInt();
		return menu;
	}

	public void disPlayMsg(String mng) {
		// TODO Auto-generated method stub
		System.out.println(mng);
	}

	public Student inputStudent() {
		Scanner sc =new Scanner(System.in);
		System.out.print("이름 :");
		String name = sc.next();
		System.out.print("1번째 정수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2번째 정수 : ");
		int secondScore = sc.nextInt();
		Student std = new Student(name, firstScore, secondScore);
		
		return std;
	}

	public void disPlayStudents(List<Student> stdList) {
		// TODO Auto-generated method stub
		System.out.println("========== 학생 전체 정보 출력 ==========");
		for(Student std : stdList) {
			System.out.printf("\t이름 : %s\n",std.getName());		//printf 일땐 "", @@ 로 콤마로 적어줘야 함. + 쓰지 마셈.
			System.out.printf("\t1차 점수 : %d\n",std.getFirstScore());
			System.out.printf("\t2차 점수 : %d\n",std.getSecondScore());
			System.out.println("=========================================");
		}
	}
 

}

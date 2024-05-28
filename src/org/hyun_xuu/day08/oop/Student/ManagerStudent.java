package org.hyun_xuu.day08.oop.Student;

import java.util.Scanner;

public class ManagerStudent {
	int kor ;
	int eng ;
	int math;
	
	public ManagerStudent() {}
	
	public void inputScore() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.println("국어 : ");
		kor = sc.nextInt();
		System.out.println("영어 : ");
		eng = sc.nextInt();
		System.out.println("수학 : ");
		math = sc.nextInt();
	}

	public void printScore() {
		// TODO Auto-generated method stub
		System.out.println("==== 성적 출력 ====");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+ eng);
		System.out.println("수학 : "+ math);
		System.out.println("총점 : "+(kor+eng+math));
		System.out.println("평균 : "+(kor+eng+math)/3);
	}

}

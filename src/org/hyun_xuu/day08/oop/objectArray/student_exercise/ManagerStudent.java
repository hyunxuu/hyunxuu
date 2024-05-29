package org.hyun_xuu.day08.oop.objectArray.student_exercise;

import java.util.Scanner;

public class ManagerStudent {
	Student [] students = new Student[3];
	
	public Student [] printInfo() {
		return students;
	}
	
	public void inputInfo(Student [] students) {
		this.students = students;
	}
	

}

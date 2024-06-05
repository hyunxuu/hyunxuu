package org.hyun_xuu.day12.collection.student;

import java.util.List;

public interface ManageInterface {

		void registerStudent(Student student);
		
		List<Student> searchListByName(String name);
		
		List<Student> selsctAllStudent();
		
		void modifyStudent(int index, Student student);
		
		void deleteStudent(int index);

}

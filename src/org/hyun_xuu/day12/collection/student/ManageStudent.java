package org.hyun_xuu.day12.collection.student;

import java.util.ArrayList;
import java.util.List;

public class ManageStudent implements ManageInterface{
	private List<Student> sList;
	
	public ManageStudent() {
		sList=new ArrayList<Student>();
	}
	
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public List<Student> searchOneByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> selsctAllStudent() {
		return sList;
	}

	@Override
	public void modifyStudent(int index, Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteStudent(int index) {
		// TODO Auto-generated method stub
		
	}

}

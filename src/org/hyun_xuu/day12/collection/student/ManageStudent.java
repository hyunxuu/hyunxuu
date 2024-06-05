package org.hyun_xuu.day12.collection.student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public List<Student> searchListByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			List<Student> searchList = new ArrayList<Student>();
			for(Student std : sList) {
				if(name.equals(std.getName())) {
				searchList.add(std);
				}
			}
			return searchList;
		}
		return null;
	}
	
	public Student searchOneByName(String name) {
		// TODO Auto-generated method stub
		if(name != null) {
			for(Student std : sList) {
				if(name.equals(std.getName())) {
					return std;
				}
			}
		}
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
		sList.remove(index);
	}

	public Map<String, Object> searchModifyStudent(String name) {	//리턴용 List를 따로 만들어서 던져주자
		// TODO Auto-generated method stub
		if(name != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i=0; i<sList.size(); i++) {
				Student student = sList.get(i);
				if(name.equals(student.getName())) {
					result.put("student", student);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}
	
	public int searchIndexByName(String name) {
		// TODO Auto-generated method stub
		return 0;
	}


}

package org.hyun_xuu.day12.collection.student;

public class Student {
	// 이름 , 점수1 , 점수2
	private String name ;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int fistScore, int secondScore) {  //overloding
		this.name=name;
		this.firstScore = fistScore;
		this.secondScore = secondScore;
	}
	public String getName() {  			
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", firstScore=" + firstScore + ", secondScore=" + secondScore + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.name+this.firstScore+this.secondScore).hashCode();
		//return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {  //String 은 equals 를 사용. int는 == 를 사용 함.
		if(obj instanceof Student) {
		Student std = (Student)obj;
		return this.hashCode() == std.hashCode();
		}else {
			return false;
		}
//		if(name.equals(std.getName())
//				&& firstScore == std.getFirstScore()
//				&& secondScore == std.getSecondScore()) {
//			return true;
//		}else {
//			return false;
//		}
		//return super.equals(obj); >> 4 로 출력됨.
	}
}

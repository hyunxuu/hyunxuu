package org.hyun_xuu.day12.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {
	public static void main(String[] args) {
		//List 인터페이스를 구현하여 만든 클래스 > ArrayList 클래스
		//업캐스팅
		List<String> list =new ArrayList<String>();  //List 가 인터페이스(추상클래스도) > new 선언 불가함
		list.add("김만규");		// 중복 가능.
		list.add("김지혁");
		list.add("양희준");
		list.add("오정민");
		list.add("김태우");
		list.add("이용재");
		list.add("조홍빈");
		//이 이상 선언도 가능함 , 자동으로 크기가 늘어남.
		
		list.add(2,"조승효");		// 인덱스 2번 , 즉 3번째 순서에 적용됨.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println("크기 : "+ list.size());
		int listSize = list.size() -1;		// index 값이 배열크기가 7이므로 배열마다 숫자가
											//0~6이기 때문에 size-1 을 하여 마지막값 6번을 찾아준다.
		System.out.println("마지막 값 : "+list.get(listSize));
		
		for(int i=0; i< list.size(); i++) {
			System.out.println(i+" : "+ list.get(i));
		}
		list.remove(listSize);
		list.remove(2);
		list.clear(); // 삭제
		for(String name : list) {
			System.out.println(name);
		}
		System.out.println("isEmpty() : "+list.isEmpty()+" size() : "+list.size());
	}
	
	public void objListSample() {
		GenericList<String> strList =new GenericList<String>();
		
		strList.add("김정욱");
		strList.add("이현주");
		strList.add("강신욱");
		
		String a1 = strList.get(0);			//강제 형변환 없이 사용가능함.Generic
		String a2 = strList.get(1);
		String a3 = strList.get(2);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		ObjectList obj =new ObjectList();
		obj.add("개강");
		obj.add("프로젝트");
		obj.add("종강");
		
		String start =(String)obj.get(0);
		String project =(String)obj.get(1);
		String end =(String)obj.get(2);
		System.out.println(start);
		System.out.println(project);
		System.out.println(end);
		
		ObjectList objList =new ObjectList();
		objList.add(5.7);
		objList.add(1023);
		objList.add("종강");
		
		double start1 = (double)objList.get(0);  //getter 랑 상관없음 . 만든 get 메소드임
		int end1 = (int)objList.get(1);
		String msg =(String)objList.get(2);		  // 강제 형변환
		System.out.println(start1);
		System.out.println(end1);
		System.out.println(msg);
	}
	
	public void intListSample() {
		IntList nums = new IntList();
		nums.add(5);
		nums.add(7);
		nums.add(1023);
		
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : "+nums.size());
		nums.clear();//모두 삭제
		System.out.println("clear 후 크기 : "+ nums.size() );
	}
}

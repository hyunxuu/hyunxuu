package org.hyun_xuu.day12.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hyun_xuu.day12.collection.student.Student;

public class Exam_SetCollection {
	public static void main(String[] args) {
		
		// 중복을 제거할 수 있음.(순서는 중요하지 않음.)
		Set<Student> stdSet = new HashSet<Student>();
		stdSet.add(new Student("이세훈",90,80));  // >> 
		stdSet.add(new Student("허태성",88,44));
		stdSet.add(new Student("남궁성",78,67));
		stdSet.add(new Student("이세훈",90,80)); //set 의 중복값은 출력되지 않지만 넷다 주소가 다르기 때문에 4가 나옴.
		
		System.out.println("크기 : "+ stdSet.size());
		
		Iterator<Student> it = stdSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		}
		
		public void setSample() {
			//Collection 의 List,Set,Map -> 저장소
			// 지료구조의 특성에 따라 선택하여 사용
			Set<String> strSet = new HashSet<String>();
			strSet.add("체리");
			strSet.add("딸기");
			strSet.add("사과");
			strSet.add("수박");
			strSet.add("포도");
			strSet.add("딸기");	//중복 불가로 size로 크기를 나타냈을때 카운트 되지 않음.(중복 제거할때 사용함.)
			
			System.out.println("크기 : "+ strSet.size());  //.size 는 length처럼 메서드 없이도 사용 가능함.(ex : 복권)
			// 순서가 있는 경우 : index 활용 / set처럼 순서가 없는 경우 : 지시자 활용(Iterator)
			Iterator<String> it = strSet.iterator();
			while(it.hasNext()) {
				System.out.println(it.next().toString());  // 순서는 보장하지 않음.프로그램에서 알아서 정함,순서를 정할 수 없음
		}
	}
}

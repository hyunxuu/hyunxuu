package org.hyun_xuu.day11.oop.objectex;
	class Member{
		String name;
		int age;
		String email;
		String phone;
		String address;
		
		public Member() {} // 기본 생성자는 필수로 작성하고.
		// 필요한게 있다면 하나 더 만들어서 아래 처럼 필요한 생성자가 있다면 새로 작성 해라.
		public Member(String name, int age, String email, String phone, String address) {
			this.name = name;
			this.age = age;
			this.email= email;
			this.phone = phone;
			this.address = address;
		}
		
		
		@Override				//toString 입력 후 ctrl+spacebar
		public String toString() {
			// TODO Auto-generated method stub
			return "이름 : "+name+", 나이 : "+age+", 이메일 : "+email+", 전화번호 : "+phone+", 주소 : "+address; //super 키워드 오브젝트의 어쩌구를 리턴함.
		}
	}
	
public class Exam_ObjectProperty {
	
	public static void print(Object obj) {
		System.out.println("클래스 이름 : "+ obj.getClass().getName());
		System.out.println("해시 코드값 : "+ obj.hashCode());
		//의미있는 데이터로 만들어 출력하고 싶을 때 오버라이딩 필수.
		System.out.println("객체 문자열로 만들어 출력 : "+obj.toString());
		// System.out.println("객체 출력 : "+obj);//toString() 생략 가능. 객체를 출력하면 toString()의 결과로 출력됨.
		}	
	
	public static void main(String[] args) {
	//print(new Member("일용자",11,"Kh@naver.com","0100000000","서울시 중구"));
	//print(new Member());
	
		String javaStr = "java";
		String javaStr2 = new String("java");
		String javaStr3 ="java";
		//문제 if(@@)
		//javaStr3 == javaStr  	> 같음 : (상수풀) 같은 주소("java")를 반복해서 주입?? 함.
		//javaStr3 == javaStr2	> 다름 : new String() 으로 이름은 같지만 다른 주소가 들어감.
		//javaStr3 == "java"	> 같음 : 반복된 같은 주소가 비교되어 같음.
								// equals 사용하면 문자열로만 비교할 수 있음.
		
		System.out.println("javaStr : "+javaStr+", javaStr2 : "+ javaStr2);
		//if(javaStr2 == "java") {			??
		//if(javaStr2.equals("java")) {
		if("java".equals(javaStr2)) {	// 문자열 비교는 equals, equals 는 Object클래스의 메소드임.
			System.out.println("똑같음");
		}else {
			System.out.println("다름");
		}
	}
}

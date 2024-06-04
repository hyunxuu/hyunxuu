package org.hyun_xuu.day07.oop;

import java.util.Scanner;

import org.hyun_xuu.day07.oop.exercise.Rectangle;
//실행용 클래스
public class Run {
	
	//생성자 줫나 이해 안됨 미쳐씀 ;; 
	
	public static void main(String [] args) {
//		Run ex = new Run();  >> static 안적혀 있는건 이거 하고 검색 / 있는건 없어도 됨.
		Run.oopPractice1();    // 접어둔 메서드 이름 검색?기능
		oopExercise();
		
		Run.constructorEx();

		

	}
	public static void constructorEx() {
		//기본생성자 이용해서 객체 생성,bookName,author은 모두 비어있음.
//		book.bookName = "춘향전";
//		book.author = "작자미상";
		Book book = new Book("춘향전","작자미상");
		Book emptyBook = new Book();
		System.out.println(book.auther + book.bookName);
	}
	
	public static void oopPractice1() {
		//Ractangle 너비와 높이를 입력받아 사각형의 넓이를 출력
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		System.out.println("사각형의 높이,길이 입력: ");
		
		rec.width = sc.nextInt();
		rec.heigth = sc.nextInt();
		int result = rec.area();
		System.out.println("넓이: "+result);
		
		Circle bintz = new Circle();
		bintz.setRadius(3.14);
	}
	
	public static void oopExercise() {
		//예제 1 
		//Circle의 instance를 이용하여 이름이 달덩이 , 반지름은 5인 Circle의 넓이를 출력
		Circle circle = new Circle();
		circle.circleName = "달덩이";
		circle.radius = 5;
		double area = circle.getArea();
		System.out.println(area); //메소드 옆엔 소괄호 같이 작성.
		
		Circle donut = new Circle();
		donut.radius=2;
		donut.circleName = "던킨도넛";
		area=donut.getArea();
		System.out.println(area);
		
	}
	
	public static void memberPractice() {
		Scanner sc=new Scanner(System.in);
		Member member1= new Member();//참조
		member1.name="일용자";
		member1.age=33;
		member1.job="의사";	
		Member member2 = new Member();
		member2.name = "이용자";
		member2.age = 22;
		System.out.println(member1.name);
		System.out.println(member2.name);
		System.out.println(member1.job);
	}
}

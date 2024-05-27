package org.hyun_xuu.day07.oop.exercise;

public class Rectangle {
//너비와 높이를 입력받아 사각형의 넓이를 출력하는 클래스를 만드세요.
	public String name;
	public int width;
	public int heigth;
	
	public int area(){
		return width*heigth;
	}	
}
// Scanner sc = new Scanner(System.in);
// int width = sc.nextInt();
// int heigth = sc.nextInt();
// int result = width*heigth;
// System.out.println("사각형의 넓이: "+ result); >>를 class객체 를 이용하여 풀어보기
//>> run파일 첫번째 식
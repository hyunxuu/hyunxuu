package org.hyun_xuu.day09.oop.overriding;

public class Exam_Overriding {
	
	static void paint(Shape shape) {
//		Shape shape =new Shape();
//		Shape shape =new Circle();
//		Shape shape =new Line();
//		Shape shape =new Rectangle();
		shape.draw();
	}
	
	public static void main(String[] args) {
		Shape shape = new Shape();
		paint(shape);
		Circle circle = new Circle();
		paint(circle);
		Line line= new Line();
		paint(line);
		Rectangle rectangle=new Rectangle();
		paint(rectangle);
		/*
		 * 오버라이딩
		 * 1.상속관계에서 사용하며 모두 같음(접근지정자,반환형,메소드형,매개변수 갯수,타입)
		 * 실행문장만 재정의 함
		 * 2.오버라이딩이 되면 동적바인딩이 되어 다형성을 이용함
		 */
//		Shape shape=new Shape();
//		shape.draw();
//		Circle circle = new Circle();
//		circle.draw();
//		Line line = new Line();
//		line.draw();
//		Rectangle rect = new Rectangle();
//		rect.draw();
// 출력 >>
//		Shape
//		Circle
//		Line
//		Rectangle
	}
}

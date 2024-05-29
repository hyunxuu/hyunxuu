package org.hyun_xuu.day09.oop.inheritance;

import org.hyun_xuu.day09.oop.inheritance.point.ColorPoint;

public class Exam_inheritance {
	public static void main(String[] args) {
//		ColorPoint cp =new ColorPoint();
//		cp.setx(5);
//		cp.setY(7);
//		cp.showPoint();
		
		ColorPoint cp = new ColorPoint(10,23,"green");
		cp.showColorPoint();
	}
}

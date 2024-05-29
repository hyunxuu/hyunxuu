package org.hyun_xuu.day09.oop.inheritance;

import org.hyun_xuu.day09.oop.inheritance.point.Point;

class Super{
	public int pub;
	int def;		//default
	protected int pro;
	private int pri;
}

class Sub extends Super{
	void set() {
		Super sup=new Super();
		sup.pro =507;
		super.pub=24;
		super.def=5;
		super.pro=7;
//		super.pri=1023; //is not visible
	}
}

class shapePoint extends Point{
	void set() {
		Point p = new Point();
		p.pub =24;
//		p.def =57; //같은 패키지만 가능하여 오류
//		p.pro =10; // 같은 패키지,상속일 때 가능
//		p.pri =23; //당연히 안됨.
		
		super.pro =23;
		super.pub =2024;
//		super.def =507; //안됨.
//		super.pri=9; 도 안됨. 
	}
}

public class Exam_protected {

}

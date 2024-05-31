package org.hyun_xuu.day11.oop.objectex.exercise;

public class point {
	int x,y;
	
	public point() {}
	public point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public boolean equals(Object obj) {
		point p = (point)obj;
		if(x ==p.x && y==p.y) {
			return true;
		}else {
			return false;
		}
	}
	
}

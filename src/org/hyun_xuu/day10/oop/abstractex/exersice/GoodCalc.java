package org.hyun_xuu.day10.oop.abstractex.exersice;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	//배열에서 값을 꺼내어 누적합 후 배열의 크기로 나눔.
	public double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num : a)
			sum += num;
		return (double)sum/a.length;   // (double)변수 > double로 출력
	}

}

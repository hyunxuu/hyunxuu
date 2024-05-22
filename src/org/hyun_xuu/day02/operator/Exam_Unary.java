package org.hyun_xuu.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항 연산자
		//a++,++a -> a = a + 1;
		int a1 = 1;
		System.out.println(a1);
		System.out.println(++a1);// 전이연산
		System.out.println(a1++); // 후이연산 > 이 식 밑으로 출력되는 a1부터 ++ 가 적용됨.
		System.out.println(a1);
		// 문제 1
		// a가 10이고 b는 20, c는 30 입니다.
		// a++;
		// b= (--a) + b;
		// c= (a++) + (--b);
		// a,b,b 의 값은 얼마일까요.
		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b=(--a)+b;
		c=(a++)+(--b);
		
		System.out.println("a:"+a+",b:"+b+",c:"+c);
		
		// 문제 2
//		논리형 변수 flag를 true 초기화 하고 다음 연산을 수행하고 결과값을 확인 하세요.
		
		//문제 3
		// x 는 100, y는 33, z는 0
		int x=100;
		int y = 33;
		int z=0;
		
		x--; //99
		z = x-- + --y; //99+32 = 131
		x= 99 + x++ + x; // 99+98+99
		y = y-- + y+ ++y; // 32+31+32
		
		System.out.println("x:"+x+", y:"+y+", z:"+z);
	}

}

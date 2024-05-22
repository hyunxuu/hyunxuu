package org.hyun_xuu.day03.control.loop.exercise;

public class Exercise_for2 {
	public static void main(String[] args) {
		// 문제2
		// 1부터 10까지의 덧셈을 표시하고 합을 구하시오.
		int sum = 0;

		for (int i = 1; i < 11; i++) {
			sum += i;
			if (10 == i) { // 10일때 +를 빼고 =를 바꾸는 if작업
				System.out.print(i + "=" + sum);
			} else
				System.out.print(i + "+");
		} // i가 10일때 i=sum 으로, else 10이 아닐때 i+로 출력
	}
}

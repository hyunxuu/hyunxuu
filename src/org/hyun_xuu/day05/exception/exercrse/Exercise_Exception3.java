package org.hyun_xuu.day05.exception.exercrse;

public class Exercise_Exception3 {
	public static void main(String [] args) {
		//문제 3 배열의 인덱스가 범위를 벗어날때 발생하는 
		//ArrayIndexOutOfBoundsException을 처리하는 프로그램
		int[] intArrs = new int[5];
		
		try {
			System.out.println(intArrs[5]);  // 0~4까지라 5는 벗어남
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}

	}
}

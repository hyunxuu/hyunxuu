package org.hyun_xuu.day05.exception.exercrse;

public class Exercise_Exception5 {
	public static void main(String [] args) {
		//문제 5 NullPointerException
		String word = null;
		
		try {
			if(word.equals("키위")) {
				System.out.println("맞습니다.");
			}else {
				System.out.println("다릅니다");
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null값을 참조 하였습니다.");
		}


	}
}

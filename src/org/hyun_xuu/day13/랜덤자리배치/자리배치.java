package org.hyun_xuu.day13.랜덤자리배치;

import java.util.Random;

public class 자리배치 {
//	1~23 사이의 랜덤한 수 중복 x
	public static void main(String[] args) throws InterruptedException {
		
	int seats [] = new int [23];
	Random rand = new Random();
	int count = rand.nextInt(3);
		for(int k=0; k<count;k++)
			for(int i =0; i<seats.length; i++) {
				int choice = rand.nextInt(23)+1;
				seats[i] = choice;
				for(int j =0; j<i; j++ ) {
				if(seats[i] == seats[j]) {
					i--;
				}
			}
		}
		System.out.println("결과");
		
		for(int seat : seats) {
			Thread.sleep(2000);
			System.out.print(seat+" ");
		}
	}
}


package org.hyun_xuu.day07.oop.caring_chicks;

import java.util.Scanner;

public class Caring_Chicks {
	public static void main(String [] args) {
		int type = 1;					//병아리 종류/정보
		int login = 1;					//내 병아리 등록
		int[] cairing =new int [4];	//병아리 관리 (1.밥/2.응아/3.놀기/4.잠)
		int myPet = 1;					//내 병아리 정보(병아리이름,나이,성별,성격,현재상태)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" ::=======삐약이 키우기=======::");
		System.out.println(" <O// 삐약이를 고르시겠습니까 \\O>");
		System.out.println("      :: 1번 YES :: 2번 NO ::");
		int YN = sc.nextInt();
		
		int[] chick = {1,2,3,4,5,6,7};
		
		while(true){									//YES,NO 선택 후
		if(YN == 1) {
			System.out.println ("1.빨간 삐약이");
			System.out.println("- 빨간 삐약이는 밥도 많이 먹고 성격도 안좋아요.\n");
			System.out.println ("2.주황 삐약이");
			System.out.println("- 주황 삐약이는 자주 아프지만 성격은 좋아요.\n");
			System.out.println ("3.노랑 삐약이");
			System.out.println("- 노랑 삐약이는 많이 먹지만 마음씨가 좋아요.\n");
			System.out.println ("4.초록 삐약이");
			System.out.println("- 초록 삐약이는 머리가 안좋지만 애는 착해요.\n");
			System.out.println ("5.파란 삐약이");
			System.out.println("- 파란 삐약이는 머리가 엄청 좋지만 사회에 불만이 많으며 성격이 안좋아요\n");
			System.out.println ("6.보라 삐약이");
			System.out.println("- 보라 삐약이는 항상 괴롭힘 당하지만 제일 키우기 쉬워요\n");
			break;
			}else {System.out.println("!<경고>! 삐약이를 안고르면 삐약이 게임 플레이가 불가합니다. !<경고>! ");break;}
		}
		for(int i=0; i<=chick.length; i++) {
//			int chick = sc.nextInt();
		}
		
		
		
	}
}

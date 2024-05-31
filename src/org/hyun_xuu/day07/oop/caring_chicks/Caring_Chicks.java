package org.hyun_xuu.day07.oop.caring_chicks;

import java.util.Scanner;

public class Caring_Chicks {
	static String name;
	static String eat, foot, play, sleep;
	static String[] color= {"빨강","주황","노랑","초록","파랑","보라"};
	static int i = color.length;
	static int step;
	public static void main(String [] args) {
		Caring_Chicks_print print = new Caring_Chicks_print();
//		int type = 1;					//병아리 종류/정보
//		int login = 1;					//내 병아리 등록
//		int[] caring =new int [4];	//병아리 관리 (1.밥/2.응아/3.놀기/4.잠)
//		int myPet = 1;					//내 병아리 정보(병아리이름,나이,성별,성격,현재상태)
		
		String h = "=========HAPPY ENDING==========";
		String o = "========== GAME OVER ==========";
		
		
		Scanner sc = new Scanner(System.in);
		
//		int[] chick = {1,2,3,4,5,6,7};
		
		while(true){	
			print.first();
			
			int YN = sc.nextInt();
			
			if(YN==1){	//YES,NO 선택 후
				print.ChickChoose();
				i = sc.nextInt();
				
				break;
			}else {
				print.ChickPrint("!<경고>! 삐약이를 안고르면 삐약이 게임 플레이가 불가합니다. !<경고>! ");
				print.first();
				YN = sc.nextInt();
				}
			}
		for (step=1; step <= i ; step++) {
			name = print.nameTag(i);
			switch(i){
			
			case 1 : //빨강이
				print.red(name, h, o);
				print.second(step);
				
			case 2 : //주황이
				print.orange(name, h, o);
				
			case 3 : //노랑이
				print.yellow(name, h, o);
				
			case 4 :  //초록이
				print.green(name, h, o);
				
			case 5 :  //파랑이
				print.blue(name,h,o);
				
			case 6 :  //보랑이
				print.purple(name,h,o);
					
			default : print.ChickPrint("삐약이를 골라주세요. ㅡ3ㅡ "); }	
	        while (true) {
	            playGame();
	            System.out.println("게임을 다시 시작하시겠습니까? (1:재시작, 0:종료)");
	            int restart = sc.nextInt();
	            if (restart == 0) {
	                System.out.println("게임을 종료합니다.");
	                break;
	            }
	        }}
	}
	
	
	private static void playGame() {
		// TODO Auto-generated method stub
		 while (true) {
			 Scanner sc = new Scanner(System.in);
	            // 게임 내용
	            System.out.println("========= 게임 진행 중 =========");
	            // 여기에 게임 로직을 추가하세요.

	            System.out.println("게임이 종료되었습니다. HAPPY ENDING!");
	            System.out.println("===============================");
	            
	            System.out.println("게임을 계속 진행하시겠습니까? (1:계속, 0:종료)");
	            int continueGame = sc.nextInt();
	            if (continueGame == 0) {
	                break;
	            }
	        }
	}
}

package org.hyun_xuu.day07.oop.caring_chicks;

import java.util.Scanner;

public class Caring_Chicks {
	public static void main(String [] args) {
		Caring_Chicks_print print = new Caring_Chicks_print();
		
//		int type = 1;					//병아리 종류/정보
//		int login = 1;					//내 병아리 등록
//		int[] caring =new int [4];	//병아리 관리 (1.밥/2.응아/3.놀기/4.잠)
//		int myPet = 1;					//내 병아리 정보(병아리이름,나이,성별,성격,현재상태)
		String[] color= {"빨강","주황","노랑","초록","파랑","보라"};
		print.first();
		Scanner sc = new Scanner(System.in);
		int YN = sc.nextInt();
//		int[] chick = {1,2,3,4,5,6,7};
		
		while(true){	
			if(YN==1){		//YES,NO 선택 후
				print.ChickChoose();
				break;
			}else {print.ChickPrint("!<경고>! 삐약이를 안고르면 삐약이 게임 플레이가 불가합니다. !<경고>! ");break;}
		}
		
		for(int i=color.length; i<=color.length+1; i++){
			 i = sc.nextInt();
			 String eat=" 밥주기.", foot=" 응가 치우기.", play=" 놀아주기.", sleep=" 재우기.";

			 //eat를 골랐을때 멘트가 랜덤으로 나오게 하기...
			switch(i){
				case 1 :	
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					String name = sc.next();
					print.ChickPrint("빨간 삐약이를 고르셨습니다 ㅡ_ㅡ^");
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
					int care = sc.nextInt();
				case 2 :
					print.ChickPrint("주황 삐약이를 고르셨습니다 ..+_^/");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						
					break;
				case 3 :
					print.ChickPrint("노란 삐약이를 고르셨습니다. (+3+);");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");	
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);

				case 4 :
					print.ChickPrint("초록 삐약이를 고르셨습니다. ..^o^// ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);

				case 5 :
					print.ChickPrint("파란 삐약이를 고르셨습니다. ㅡ_ㅡ* ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");;
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);

				case 6 :
					print.ChickPrint("보라 삐약이를 고르셨습니다. ㅠoㅠ; ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
				
				default : print.ChickPrint("삐약이를 골라주세요. ㅡ3ㅡ "); }
				}
			}
		 }


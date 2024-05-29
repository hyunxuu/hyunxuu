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
		
			
			int i = sc.nextInt();
			 String eat=" 밥주기.", foot=" 응가 치우기.", play=" 놀아주기.", sleep=" 재우기.";

			 //eat를 골랐을때 멘트가 랜덤으로 나오게 하기...
			 end:
			switch(i){
				case 1 :	
					print.ChickPrint("빨간 삐약이를 고르셨습니다 ㅡ_ㅡ^");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					String name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
					int care = sc.nextInt();
					switch(care) {
					case 1: System.out.println(name+"가 밥을 먹었습니다! 양이 적다고 화내는 중 입니다...!");break;
					case 2: System.out.println("<< 1. 당신이 치워줍니다. >> \n<< 2. 혼자 치우라고 합니다. >>");
							int ch = sc.nextInt();
							if(ch==1) {System.out.println(name+"이가 당신이 깨끗이 치우지 않아 화를 내다 고혈압으로 쓰러집니다.");
								System.out.println("========== GAME OVER ==========");
							break end;}else {System.out.println(name+"가 혼자 깨끗이 잘 치웠습니다.");}
					
					case 3: System.out.println(name+"와 공놀이를 하였습니다. \n"+name+"가 주인의 체력에 실망하며 공을 담넘어로 뻥 차버립니다...");break;
					case 4: System.out.println(name+"를 재웠습니다.Zzz 자는 모습이 제일 귀엽습니다.");break;
					}
				case 2 :
					print.ChickPrint("주황 삐약이를 고르셨습니다 ..+_^/");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						int care1 = sc.nextInt();
						switch(care1) {
						case 1: System.out.println(name+"이 밥을 먹이는 중입니다. 목이 아파 잘 먹지 못합니다 ㅜㅜ");break;
						case 2: System.out.println(name+"의 응아를 치웠습니다. 응아색이 건강하지 못합니다ㅜㅜ");break;
						case 3: System.out.println(name+"와 공놀이를 하였습니다. \n"+name+"가 공을차다 기절하였습니다.......");
								System.out.println("========== GAME OVER ==========");
							break end;	
						case 4: System.out.println(name+"를 재웠습니다.영영 일어나지 못했습니다.......");
								System.out.println("========== GAME OVER ==========");
							break end;
						}
					break;
				case 3 :
					print.ChickPrint("노란 삐약이를 고르셨습니다. (+3+);");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");	
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						care = sc.nextInt();
						switch(care) {
						case 1: System.out.println(name+"가 밥을 먹었습니다! 당신 밥까지 모두 먹어버렸습니다..!!!");break;
						case 2: System.out.println(name+"의 응아를 치워야 합니다. 너무 커서 이 휴지로는 치우지 못합니다.....");
						System.out.println("========== GAME OVER ==========");
						break end;
						case 3: System.out.println(name+"와 걷기 운동을 하였습니다. \n"+name+"는 벌써 지쳤습니다.");break;
						case 4: System.out.println(name+"를 재웠습니다.Zzz 당신이 잘 곳 까지 차지해 당신은 잠을 못자게 되었습니다ㅜㅜ");break;
						}
				case 4 :
					print.ChickPrint("초록 삐약이를 고르셨습니다. ..^o^// ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						care = sc.nextInt();
						switch(care) {
						case 1: System.out.println(name+"가 < 밥을 먹지 않고 100일 사는 법 > 이라는 책을 읽고 도전한다고 합니다.");
								System.out.println(" 3주 뒤 굶어 죽었습니다.");
								System.out.println("========== GAME OVER ==========");
								break end;
						case 2: System.out.println(name+"의 응아를 하고 혼자 치웁니다! 하지만 깨끗하지 않아 당신이 한번더 치웁니다..");break;
						case 3: System.out.println(name+"와 공놀이를 하였습니다. \n"+name+"가 공놀이 하는 법을 몰라 그만합니다..");break;
						case 4: System.out.println(name+"가 자기위해 양을 세다 18마리에서 멈춥니다. 18다음 숫자를 몰라 당신이 대신 세줍니다.");break;
						}
				case 5 :
					print.ChickPrint("파란 삐약이를 고르셨습니다. ㅡ_ㅡ* ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");;
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						care = sc.nextInt();
						switch(care) {
						case 1: System.out.println(name+"가 밥을 차려줬습니다. 소시지는 건강하지 않다며 건강한 식단을 만드는 법 124가지를 알려줍니다.");break;
						case 2: System.out.println(name+"는 혼자 처리합니다.");break;
						case 3: System.out.println(name+"는 과학실험 놀이를 좋아합니다. 당신이 화학약품을 잘못 제조하여 펑하고 터져버립니다....");
						System.out.println("========== GAME OVER ==========");
						break end;
						case 4: System.out.println(name+"를 재웠습니다.Zzz \n"+name+"는 잠꼬대로 아침뉴스에 나왔던 경제 상황에 대한 욕을 합니다...");break;
						}
				case 6 :
					print.ChickPrint("보라 삐약이를 고르셨습니다. ㅠoㅠ; ");
					print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
					name = sc.next();
					print.ChickPrint("삐약이의 이름은 "+ name+ "입니다.");
					print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
					print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
						care = sc.nextInt();
						switch(care) {
						case 1: System.out.println(name+"가 밥을 줬더니 다른 친구한테 뺏기고 말았습니다.");break;
						case 2: System.out.println(name+"가 바지에 응아를 해 놀림 당하고 있습니다.");break;
						case 3: System.out.println(name+"와 공놀이를 하였습니다. 누군가와 함께 하는 공놀이가 처음이라 펑펑 웁니다.ㅜㅜ");break;
						case 4: System.out.println(name+"를 재웠습니다.Zzz 아주 잘 잡니다.");break;
						}
				default : print.ChickPrint("삐약이를 골라주세요. ㅡ3ㅡ "); }
				
			}
		 }


package org.hyun_xuu.day07.oop.caring_chicks;

import java.util.Scanner;

public class Caring_Chicks_print {
	String[] color= {"빨강","주황","노랑","초록","파랑","보라"};
	int i;
	public Caring_Chicks_print () {}
	
	public void ChickPrint (String message) {
		// TODO Auto-generated method stub
		System.out.println(message);
	}

	public void first() {
		System.out.println(" ::=======삐약이 키우기=======::");
		System.out.println(" <O/ 삐약이를 고르시겠습니까 \\O>");
		System.out.println("    :: 1번 YES : : 2번 NO ::");
	}
	
	public void second(int step) {
		System.out.println(" ::======= "+step+" 번째 PLAY =======::");
		System.out.println(" <O/ 삐약이를 고르시겠습니까 \\O>");
		System.out.println("    :: 1번 YES : : 2번 NO ::");
	}
	
	public void ChickChoose() {
		
		System.out.println ("1.빨간 삐약이 \\O>");
		System.out.println(":: 빨간 삐약이는 밥도 많이 먹고 성격도 안좋아요. ::\n");
		System.out.println ("2.주황 삐약이 \\O>");
		System.out.println(":: 주황 삐약이는 자주 아프지만 성격은 좋아요. ::\n");
		System.out.println ("3.노랑 삐약이 \\O>");
		System.out.println(":: 노랑 삐약이는 많이 먹지만 마음씨가 좋아요. ::\n");
		System.out.println ("4.초록 삐약이 \\O>");
		System.out.println(":: 초록 삐약이는 머리가 굉장히 좋지만 성격이 굉장히 안좋아요. ::\n");
		System.out.println("5.파란 삐약이 \\O>");
		System.out.println(":: 파란 삐약이는 너무 멍청하지만 아주 착해요. ::\n");
		System.out.println("6.보라 삐약이 \\O>");
		System.out.println(":: 보라 삐약이는 항상 괴롭힘 당하지만 제일 키우기 쉬워요 ::\n");
		
	}

	public String nameTag(int i) {
		Caring_Chicks_print print = new Caring_Chicks_print();
		Scanner sc = new Scanner(System.in);
		String eat=" 밥주기.", foot=" 응가 치우기.", play=" 놀아주기.", sleep=" 재우기.";
		
		print.ChickPrint(color[i-1]+"삐약이를 고르셨습니다 ㅡ_ㅡ^");
		print.ChickPrint(color[i-1]+"의 이름을 지어주세요.");
		String name = sc.next();
		print.ChickPrint(color[i-1]+"삐약이의 이름은 "+ name+ "입니다.");
		print.ChickPrint("이제 "+name+" 키우기를 시작합니다.");
		print.ChickPrint("1."+name +eat+ "\n2."+name+foot+"\n3."+name+play+"\n4."+name+sleep);
		return name;
	}
	
	public void red(String name, String h, String o) {
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
		end:
		switch(care) {
			case 1:  
				System.out.println("<< 1. 스스로 먹게 한다. >> \n<< 2. 먹여 준다. >>");
				int ch = sc.nextInt();
				if(ch==1) {System.out.println(name+"이가 밥을 혼자 잘먹습니다.");
				System.out.println(h);break;
				
				}else {System.out.println(name+"이는 당신이 밥을 맥여주는게 답답해서 집을 나갔습니다.");
				System.out.println(o);break end;}	
			case 2: System.out.println("<< 1. 당신이 치워줍니다. >> \n<< 2. 혼자 치우라고 합니다. >>");
					ch = sc.nextInt();
					if(ch==1) {System.out.println(name+"이가 당신이 깨끗이 치우지 않아 화를 내다 고혈압으로 쓰러집니다.");
						System.out.println(o);
					break end;
					}else {System.out.println(name+"가 혼자 깨끗이 잘 치웠습니다.");
						System.out.println(h);break;}					
			case 3: 						
					System.out.println("<< 1. 엄청 신나게 놀아준다. >> \n<< 2. 노는거 구경이나 하자. >>");
					ch = sc.nextInt();
					if(ch==1) {System.out.println(name+"이가 왜이리 귀찮게 하냐며 놀이를 그만둡니다.");
					System.out.println(o);
					break end;
					}else {System.out.println(name+"이가 다른 삐약이들을 괴롭히며 즐거워 합니다.");
					System.out.println(h);break;}
			case 4: System.out.println(name+"를 재웠습니다.Zzz 자는 모습이 제일 귀엽습니다.");
					System.out.println(h);break;
		}
	}
	
	public void orange(String name, String h, String o) {
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
		end:
		switch(care) {
			case 1:System.out.println(name+"이 밥을 먹습니다. 보양식으로 삼계탕을 먹더니 아주아주 건강해 집니다.");
					System.out.println(h);
					break;
			case 2: System.out.println(name+"의 응아를 치웠습니다. 응아색이 건강하지 못합니다ㅜㅜ");
					System.out.println("<< 1.병원에 간다. >> \n<< 2.집에 있는 오래된 약을 먹인다. >>");
					int ch = sc.nextInt();
					
					if(ch==1) {
						System.out.println(name+"이는 병원에서 제대로 된 치료를 받고 아주아주 건강해 졌습니다.");
						System.out.println(h);
						break;
					}else {
						System.out.println(name+"이가 오래된 약을 먹고 병이 악화 되었습니다.");
						System.out.println(o);break end;}
			
			case 3:System.out.println("<< 1.빡센 운동을 시킨다. >> \n<< 2.천천히 강도 낮은 놀이를 한다. >>");
					ch = sc.nextInt();
					if(ch==2) {
						System.out.println(name+"이는 운동량이 부족하여 성인병에 걸렸습니다.");
						System.out.println(o);
					break end;
					}else {
						System.out.println(name+"이가 빡센 운동으로 근육빵빵맨이 되어 건강해졌습니다.");
						System.out.println(h);break;}
				
			case 4: System.out.println(name+"를 재웠습니다.영영 일어나지 못했습니다.......");
					System.out.println(o);
					break end;
		}
		
	}

	public void yellow(String name, String h, String o) {
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
		end:
			switch(care) {
				case 1: System.out.println(name+"가 밥을 먹었습니다! 당신 밥까지 모두 먹어버렸습니다..!!!\n"+name+"이는 아주 만족해 합니다.");
						System.out.println(h);
						break;
				case 2: System.out.println(name+"의 응아를 치워야 합니다. 너무 커서 이 휴지로는 치우지 못합니다.....");
						System.out.println(o);
						break end;
				case 3: System.out.println(name+"와 걷기 운동을 하였습니다. \n"+name+"는 벌써 지쳤습니다.");
						
						break;
				case 4:System.out.println(name+"이가 야식이 먹고 싶다고 투정을 부린다.");
						System.out.println("<< 1. 시간이 늦었으니 안 된다고 한다. >> \n<< 2. 알아서 하라고 한다. >>");
						int ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이는 배가 너무 고파 결국 집을 뛰쳐 나갔습니다.");
						System.out.println(o);
						break end;
						}else {System.out.println(name+"이가 야식을 먹는 중 강도가 들었습니다.\n"+name+"이가 강도를 잡았습니다. *^-^*^-^");
						System.out.println(h);break;}	}
	}


	public void green(String name, String h, String o) {
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
			end:
			switch(care) {
				case 1: System.out.println(name+"이가 밥먹을때 책을 봐도 되냐고 물어본다.");
						System.out.println("<< 1. 책 봐도 돼^-^ >> \n<< 2. 안돼. 밥먹고 보자. >>");
						int ch = sc.nextInt();
							if(ch==1) {System.out.println(name+"이가 < 밥을 먹지 않고 100일 사는 법 > 이라는 책을 보고 굶더니 굶어 죽었습니다.");
							System.out.println(o);
							break end;
							}else {System.out.println(name+"이는 어차피 당신 말을 듣지 않습니다.\n"+name+"이는 < 밥을 먹지 않고 100일 사는 법 > 이라는 책을 보고 굶더니 굶어 죽었습니다.");
							System.out.println(o);
							break end;}
				case 2: System.out.print(name+"이가 < 응가 하지 않고 100일 사는 법 > 이라는 책을 읽고 응가를 참다가 몸이 안 좋아졌습니다.");
						System.out.println("<< 1. 병원에 데려간다. >> \n<< 2. 화장실에 데려간다. >>");
						ch = sc.nextInt();
							if(ch==1) {System.out.println(name+"이는 어차피 당신말을 듣지 않습니다.\n "+name+"이는 오래오래 참다가 큰 병에 걸려 세상을 떠납니다.");
							System.out.println(o);
							break end;
							}else {System.out.println(name+"이는 어차피 당신말을 듣지 않습니다.\n "+name+"이는 오래오래 참다가 큰 병에 걸려 세상을 떠납니다.");
							System.out.println(o);
							break end;}	
						case 3: System.out.println(name+"가 공놀이는 재미없다며 집에서 화학물질 실험을 합니다.");
								System.out.println("<< 1. 같이 합니다. >> \n<< 2. 구경 합니다. >>");
								ch = sc.nextInt();
								if(ch==1) {System.out.println("당신이 "+name+"이의 말을 듣지 않고 약품을 섞어 약품이 폭팔합니다.\n 온 집안이 폭팔해버렸습니다.");
								System.out.println(o);
								break end;
								}else {System.out.println(name+"이가 이 세상에 없던 굉장한 약품을 만들어 내어 부자가 됩니다.");
								System.out.println(h);
								break;}
						
						case 4: System.out.println(name+"는 잠자는 시간이 아깝다며 자는시간을 아껴 공부를 하다가 천재 연구원이 됩니다.");
								System.out.println(h);
								;break;
						}
	}

	public void blue(String name, String h, String o) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
			end:
			switch(care) {
				case 1: 
						System.out.println(name+"가 밥을 차려줬습니다. 맛있냐고 물어봅니다.(엄청 맛 없음)");
						System.out.println("<< 1. 맛있다고 해준다. >> \n<< 2. 맛없다고 솔직하게 말한다. >>");
						int ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이가 맛있어하는 당신을 보고 매일매일 밥을 차려줍니다. \n 당신은 매일 맛없는 음식만 먹다 죽습니다. ^-^*");
						System.out.println(o);
						break end;
						}else {System.out.println(name+"이가 그 말을 듣고 요리를 그만둡니다. 맛없는 음식을 이제 안먹어도 됩니다.");
						System.out.println(h);break;}	
				case 2: 
						System.out.println(name+"이의 응아를 치워줍니다. 오늘은 그냥 당신은 기분이 좋은날 입니다.");
						System.out.println(h);
						break;
				case 3: 
						System.out.println(name+"이가 자전거를 타다가 실수로 옆에 주차되어 있던 벤틀리를 긁었습니다.\n(아직 보험이 없습니다 ㅋㅋㅋㅋㅋ)");
						System.out.println(o);
						break end;
				case 4: System.out.println(name+"이가 무섭다며 같이 있어달라 합니다.");
						System.out.println("<< 1.혼자 재운다. >> \n<< 2. 같이 자준다. >>");
						ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이가 강하게 자랍니다.");
						System.out.println(h);
						break;
						}else {System.out.println(name+"이는 커서 아무것도 못하는 닭으로 자라 사회부적응자가 되었습니다.");
						System.out.println(o);break;}
						}
	}
	
	public void purple(String name, String h, String o) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int care = sc.nextInt();
			end:
			switch(care) {
				case 1: System.out.println(name+"가 밥을 줬더니 다른 친구한테 뺏기고 말았습니다.");
						System.out.println("<< 1. 뺏어준다. >> \n<< 2. 알아서 하게 방치한다. >>");
						int ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이가 커서 아무것도 하지 못하는 닭이 되어 사회의 악이 되었습니다.");
						System.out.println(o);
						break end;
						}else {System.out.println(name+"이는 스스로 강해지는 법을 배우며 성공한 닭이 되었습니다.");
						System.out.println(h);break;}
				case 2:System.out.println(name+"가 바지에 응아를 해 놀림 당하고 있습니다.");
						System.out.println("<< 1. 방치한다. >> \n<< 2. 놀리는 친구를 혼내준다. >>");
						ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이가 방치당하는 것을 본 이웃이 당신을 가정폭력범으로 신고하여 감옥에 갑니다.");
						System.out.println(o);
						break end;
						}else {System.out.println(name+"이가 혼나는 친구를 보며 자신감이 생겨 강해집니다.");
						System.out.println(h);break;}
				case 3: 
						System.out.println(name+"와 공놀이를 하였습니다. 누군가와 함께 하는 공놀이가 처음이라 펑펑 웁니다.ㅜㅜ");
						System.out.println("<< 1. 달래줍니다. >> \n<< 2. 뭘 그런거 가지고 우냐고 눈치를 줍니다. >>");
						ch = sc.nextInt();
						if(ch==1) {System.out.println(name+"이가 더 감동받아 커서 당신에게 은혜를 갚는 멋진 닭이 됩니다.");
						System.out.println(h);
						break;
						}else {System.out.println(name+"이는 서러워 집을 나가 닭장수에게 잡혀갑니다.");
						System.out.println(o);break end;}
				case 4: 
						System.out.println(name+"를 재웠습니다.Zzz 당신과 행복하게 사는 꿈을 꿉니다.");
						System.out.println(h);
						break;
			}
	    }
	}
	


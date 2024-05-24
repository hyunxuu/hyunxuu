package org.hyun_xuu.day05.random.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random2_RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		
		

		while(true){
			System.out.println("===========가위 바위 보 게임============");
			System.out.println("숫자를 선택하세요.(1.가위, 2.바위 ,3.보)");	
			int num = sc.nextInt();
			int num2 = rand.nextInt(3)+1;
			System.out.println("=============결과=============");
		if(num == 1	) { System.out.println("    당신은 가위를 냈습니다.");
			if(num2 == 1) { 
				System.out.println("  컴퓨터는 가위를 냈습니다.");
				System.out.println("       It's a tie!");}
			else if(num2 == 2) {
				System.out.println("  컴퓨터는 바위를 냈습니다.");
				System.out.println("       YOU LOSE!!!! ㅠㅠ^");}
			else {
				System.out.println("    컴퓨터는 보를 냈습니다.");
				System.out.println("       YOU WIN!!!! ^^*"); }
		}else if (num ==2 ) {System.out.println("   당신은 바위를 냈습니다.");
			if(num2==1) {
				System.out.println("  컴퓨터는 가위를 냈습니다.");
				System.out.println("        YOU WIN!!!! ^^*^^*");
				}
			else if(num2==2) {
				System.out.println("  컴퓨터는 바위를 냈습니다.");
				System.out.println("       It's a tie!");
				}
			else {
				System.out.println("   컴퓨터는 보를 냈습니다.");
				System.out.println("       YOU LOSE!!!! ㅠㅠ^");
				}
		}else if (num ==3 ) { System.out.println("    당신은 보를 냈습니다.");
			if(num2==1) {
				System.out.println("  컴퓨터는 가위를 냈습니다.");
				System.out.println("     YOU LOSE!!!! ㅠㅠ^");
			}
			else if(num2==2) {
				System.out.println("  컴퓨터는 바위를 냈습니다.");
				System.out.println("        YOU WIN!!!! ^^*^^*");
			}
			else{
				System.out.println("  컴퓨터는 보를 냈습니다.");
				System.out.println("     It's a tie!");
			}
			}System.out.println("==============================");
		}
	}
}



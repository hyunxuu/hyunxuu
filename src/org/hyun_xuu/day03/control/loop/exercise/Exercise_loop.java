package org.hyun_xuu.day03.control.loop.exercise;

import java.util.Scanner;

public class Exercise_loop {

	public void exercise_loop1_1() {
		//1번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요");
		int num = sc.nextInt();
		int i = 1;
		
		if(num>=1) {
			for(i=1; i<=num; i++) {
			System.out.print(i+" ");
			}
		}else {
			System.out.println("0이하 숫자 X");
		}
	}
	
	public void exercise_loop1_2() {
		//2번
		//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		//단, 입력한 수는 1보다 크거나 같아야 합니다
		Scanner sc = new Scanner(System.in);
		int i = 1;
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		
		if(num >=1) {
			while (i <= num) {
				System.out.print(num);
				num--; 
			}
		}else {
			System.out.println("1보다 작은 정수 X");    //없어도 됨, 1보다 작으면 출력 안됨.
		}
	}
	
	public void exercise_loop1_3() {
		//3번
		// 1부터 사용자에게 입력 받은 
		// 수 까지의 정수들의 합을 for문을 이용하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해 주세요: ");
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			sum += i;
		} System.out.println("1부터"+num+"까지 수의 합: "+sum);
		
	}
	
	public void exercise_loop1_4() {
		//4번  
		//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int num2 = sc.nextInt();
		
		if( num1<1 || num2<1) {    				// 1미만의 수가 입력됬을때.
			System.out.println("1이상의 정수만 입력해 주세요.");
		}else {
			if(num1<num2) { 
				for(int i=num1; i<=num2; i++) {  //첫번째 정수가 더 컸을때.
				System.out.print(i+" ");}
			}else 
				{for(int i=num2; i<=num1;i++) {  //두번째 정수가 더 컸을때.
					System.out.print(i+" ");
				}
			}
		}
	}
	
	public void exercise_loop1_5() {
		//5번
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int dan = sc.nextInt();							// 단수 입력
		
		for(int i=1; i<=9; i++) {          				// 구구단이니까 9까지 곱할 수 있게 9<= 로 지정
			System.out.println(dan+"x"+i+"="+(dan*i));  // 단수X1~9= dan*i
		}
	}
				
	public void exercise_loop1_6() {
		//6번  
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("단수를 입력하세요.");
		int dan = sc.nextInt();
		
		if(dan>=10) {
			System.out.println("10이하의 수만 입력 가능");
		}else { 
			for(int i = 1; i<=dan; i++) {
				System.out.println(dan+"x"+i+"="+(dan*i));
			}
		}
	}

	public void exercise_loop2_1() {}
	
	public void exercise_loop2_2() {
		System.out.print("출력하고 싶은 별의 개수 :");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();  //개수 입력
		
		for(int star=1; star<=i; star++) { //줄을 1에서 i만큼 늘림
			for(int line=1; line<=star; line++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}
		
		for(int star=i-1; star>=1; star--) { //줄을 i에서 1로 줄임
			for(int line=1; line<=star; line++) { //별이 줄만큼 생김
				System.out.print("*");
			}System.out.println(); //줄 바꿈
		}
	}

	public void exercise_loop2_3() {
		System.out.print("출력할 별의 개수 :");
		Scanner sc=new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int line =1; line<=i; line++) {
			for(int star =1; star<=line; star++) {  //line==star로 시도 ㄴㄴ 무제한 출력됨.
				System.out.print("*");
			}System.out.println();
		}
	}

	public void exercise_loop2_4() {}
	
	public void exercise_loop2_5() {}
	
	public void exercise_loop2_6() {}
	
	public void exercise_loop2_7() {}
	
	
	
	
	
	
}
	


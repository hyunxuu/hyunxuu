package org.hyun_xuu.day04.array.practice;

import java.util.Scanner;

public class practice_Array {

	public void practice_Array01() {
		//문제1
		int[] array = new int[10];
		
		for(int i=0;i<10;i++) {  			//배열이 10개면 0~9이기 때문에 10과 같다고 하면 에러남.
			array[i]=i+1;					//배열(array)안에 공간(i)이라고 태그해줘야 출력됨.
			System.out.print(array[i]+" ");
		}
	}
	
	public void practice_Array02() {
		//문제2
		int[] array=new int[10];
		
		for(int i=0; 10>i; i++) {
			array[i]=10-i;
			System.out.print(array[i]+" ");
		}
	}
	
	public void practice_Array03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
			int num = sc.nextInt();
			int[] arrs = new int[num];
			
			if(num<1) {
				System.out.print("1이상의 수로 입력해 주세요.");
			}else {
			for(int i=0;i<num;i++) {
				arrs[i] = i+1;
			System.out.print((arrs[i] = i+1) +" ");
			}
		} // 배열은 음수로 배열되지 않아서 뭐 어쩌고 방법은 있겟지만 음수입력하면 에러뜸.
	} 
			
    public void practice_Array04() {
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		
		System.out.println(fruits[1]);
	}

	public void practice_Array05() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열: ");
		String object=sc.next();
		int count = 0;
		
		int size=object.length();
		char[] word=new char[size];
		
		for(int i=0; i<object.length();i++) {
			word[i]=object.charAt(i);
		}System.out.print("검색문자: ");
		
		char search = sc.next().charAt(0);
		System.out.print(object+"에 "+search+"가 존재하는 위치: ");
		for(int i=0; i<word.length;i++) {
			if(word[i]==search) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+search+" 개수"+count);
	}
				
	public void practice_Array06() {
		Scanner sc = new Scanner(System.in);
		String[] day = {"월","화","수","목","금","토","일"};
		System.out.print("0~6사이에 숫자 :");
		int week= sc.nextInt();
		
		if(week>7 || week<0) {
			System.out.print("0보다 작거나 6보다 큰거 ㄴㄴ");
		}else { 
			for(int i=week;week>=i;) {
				System.out.println(day[i]+"요일");
				break;
			}
		}
	}
		
	public void practice_Array07() {
			System.out.print("배열 길이: ");
			Scanner sc = new Scanner(System.in);
			int length = sc.nextInt();
			int sum = 0;
			
			int[] arry = new int[length];
			
			for(int i=0; i<length; i++) {
				System.out.print("배열의"+i+"번째 인덱스 값: ");
				arry[i]=sc.nextInt();
			}for(int i=0; i<length; i++) {
				System.out.print(arry[i]+" ");
				sum += arry[i];
			}
			System.out.println("\n총합: "+sum); // "\n" >> 띄어쓰기
					
	}
		
	public void practice_Array08() {
		Scanner sc = new Scanner(System.in);
		int length;
		
		while(true) {
			System.out.print("정수 입력: ");
			length = sc.nextInt();
			if(length>=3 && length%2 != 0) {	//3보다크고 홀수여야 실행됨.
				break;
			}else {
				System.out.println("홀수, 3 이상의 수로 입력 ㄱ");
			}
		}
		int[] arry = new int[length];			//입력할 정수 만들기
		int mid=length/2;						//중간자리 만들기
		
		for(int i=0; i<=mid; i++) {				//중간 전자리까지
			arry[i] = i+1;
		}
		for(int i=mid+1; i<length; i++) {  		//중간자리부터 내려가는 곳
			arry[i] = length-i;
		} 
		for(int v : arry) {
			System.out.print(v);
		}
	}
		
	public void practice_Array09() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 입력해 주세요 :");
		String[] menu = {"후라이드","양념치킨","옛날치킨","간장치킨"};
		String ch = sc.next();
		
		for(int i=0; i< menu.length ; i++) {
			if(menu[i].equals(ch)) {
				System.out.println(ch+" 배달 가능합니다.");
				return;
			}
		} System.out.println(ch+" 은 없는 메뉴입니다.");
	}
		
	public void practice_Array10() {
//		ex.
//		주민등록번호(-포함) : 123456-1234567
//		123456-1******
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-입력): ");
		String idnum = sc.next();				//입력 선언
		char[] id = new char[idnum.length()];  //배열 선언
		for(int i=0; i<id.length; i++) {
			id[i]= idnum.charAt(i);
		}
		char[] copy=new char[id.length];
		for(int i=0; i<id.length; i++) {
			//copy[i]=id[i];
			if(i<8) {						//배열자리는 0~7까지가 8번째 숫자임.
				copy[i]=id[i];
			}else {
				copy[i]='*';
			}
		} for(char num:copy) {
			System.out.print(num);
		}
	}
		
	public void practice_Array11() {}
						
	public void practice_Array12() {}	
		
	
}
	

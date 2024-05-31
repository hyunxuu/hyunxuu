package org.hyun_xuu.day11.oop.member;

import java.util.Scanner;

public class ViewMember {

	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====회원 관리 프로그램=====");
		System.out.println("1. 회원 가입");
		System.out.println("2. 회원 검색");
		System.out.println("3. 회원 정보 조회");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.print("메뉴 선택 >>");
		int input = sc.nextInt();
		return input;
	}

	public Member inputMember() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("=====회원 가입====");
			System.out.print("이름 : ");
			String memberName = sc.next();
			System.out.print("이메일 : ");
			String memberEmail = sc.next();
			System.out.print("전화번호 : ");
			String memberPhone = sc.next();
			sc.nextLine();
			System.out.print("주소 : ");
			String memberAddress = sc.nextLine();
			Member member = new Member(memberName, memberEmail, memberPhone, memberName);
	//		member.setMemberName(memberName);
	//		member.setMemberEmail(memberEmail);
	//		member.setMemberPhone(memberPhone);
	//		member.setMemberAddress(memberName);
			return member;
		}
	
public Member modifymember(String memberEmail) {
	Scanner sc = new Scanner(System.in);
	System.out.println("=====회원 정보 수정====");
	System.out.print("이름 : ");
	String memberName = sc.next();
	System.out.print("전화번호 : ");
	String memberPhone = sc.next();
	sc.nextLine();
	System.out.print("주소 : ");
	String memberAddress = sc.nextLine();
	Member member = new Member(memberName ,memberEmail, memberPhone, memberName);
		return member;
	}

	public String inputEmail(String category) {
		Scanner sc = new Scanner(System.in);
		System.err.println(category+"할 Email 입력 : ");
		String email = sc.next();
		return email;
	}
	
//public String modifyInput() {
//		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("수정할 이메일 입력 : ");
//		String email = sc.next();	
//		return email;  // sc.next(); 로 대체 가능 위 변수 선언 없이 사용가능함.
//						// 어차피 못쓸거같으니까 안알아도 됨.
//	}

	public void displayMassage(String mng) {
		// TODO Auto-generated method stub
		System.out.println(mng);
		
	}

	public void printAllMembers(Member[] members) {
		// TODO Auto-generated method stub
		System.out.println("=======회원 정보 출력=======");
		for(Member member : members) {
			if(member != null) {
				System.out.println(member.toString());
			}
		}
	}

	public void printOneByEmail(Member member) {
		// TODO Auto-generated method stub
		System.out.println("=======회원 검색 결과 =====");
		System.out.println("이름 : "+member.getMemberName());
		System.out.println("전화번호 : "+member.getMemberPhone());
		System.out.println("주소 : "+member.getMemberAddress());
		System.out.println("이메일 : "+member.getMemberEmail());
	}

	

	



	
}

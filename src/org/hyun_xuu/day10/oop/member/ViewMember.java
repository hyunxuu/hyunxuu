package org.hyun_xuu.day10.oop.member;

import java.util.Scanner;

public class ViewMember {
	public int printMenu() {
		Scanner sc =new Scanner(System.in);
		System.out.println("======== 회원 관리 프로그램 =========");
		System.out.println("1.회원 가입");
		System.out.println("2.회원 검색");
		System.out.println("3.회원 정보 보기");
		System.out.println("4.종료");
		System.out.println("메뉴 선택 : ");
		return sc.nextInt();
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

	public Member inputMember() {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("======회원가입======");
		System.out.println("아이디 :");
		String memberId =sc.next();
		System.out.println("비밀번호 : ");
		String memberPw =sc.next();
		System.out.println("이름 : ");
		String memberName =sc.next();
		System.out.println("나이 : ");
		int memberAge =sc.nextInt();
		System.out.println("이메일 : ");
		String memberEmail =sc.next();
		System.out.println("전화번호 : ");
		String memberPhone =sc.next();
		sc.nextLine();
		System.out.println("주소");
		String memberAddress =sc.nextLine();
		
		Member member = new Member();
		member.setMemberId(memberId);
		member.setMemberPw(memberPw);
		member.setMemberName(memberName);
		member.setMemberAge(memberAge);
		member.setMemberEmail(memberEmail);
		member.setMemberPhone(memberPhone);
		member.setMemberAddress(memberAddress);
		return member;
	}


	public void displayMemberList(Member[] members) {
			for(Member member : members) {
				if(member != null) {
				System.out.println("=========== 정보 보기 ============");
				System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d,주소 : %s\n" 
						,member.getMemberId(), member.getMemberName()
						, member.getMemberAge(), member.getMemberAddress());
				System.out.println("==================================");
			break;
				}
			}
		}
			
	public void displayMember(Member member) {
		// TODO Auto-generated method stub
		System.out.println("======= 회원 정보 =======");
		System.out.printf("아이디 : %s, 이름 : %s, 나이 : %d,\n",member.getMemberId(), member.getMemberName(), member.getMemberAge());
	}
	
	public String inputMemberId() {
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 아이디 : ");
		String memberId = sc.next();
		return memberId;
	}
}

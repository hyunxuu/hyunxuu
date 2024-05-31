package org.hyun_xuu.day11.oop.member;

import java.util.Scanner;

public class ManageMember {

	Member [] members;
	int index;
	
	//필드 초기화를 생성자에서
	public ManageMember() {
		members = new Member[5] ;
		index = 0;
	}
	
	//회원 정보 저장 
	public void insertMember(Member member) {
		// TODO Auto-generated method stub
		if(index<members.length) {
			members[index] = member;
			index++;
		}
	}
	
	public void updateMember(Member member) {
		// TODO Auto-generated method stub
		int i =0;
		for(Member mOrigin : members) {
			if(mOrigin != null) {
				String memberEmail = mOrigin.getMemberEmail();
				if(mOrigin != null && mOrigin.equals(member.getMemberEmail()));{
					members[i] = member;
				}
			}
		}i++;
	}
	
	public Member[] getAllMembers() {
		// TODO Auto-generated method stub
		return members;
	}

	public Member searchOneByEmail(String email) {
		// TODO Auto-generated method stub
		for(Member member : members) {
			if(member != null && email.equals(member.getMemberEmail())) {
				return member;
			}
		}
		return null;
	}

	public void deleteAllMember() {
		Scanner sc= new Scanner(System.in);
		// all delete 다 지움 == 다 비움 > 초기상태로 만들기
		members = new Member[5];
		index =0;
//		for(Member member : members) {
//			member = null;
//		}
		
	}


}

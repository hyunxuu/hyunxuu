package org.hyun_xuu.day10.oop.member;

public class ManageMember {
	private Member[] members;
	private int index;

	public ManageMember() {
		members = new Member[5];
		index =0;
	}
	
	public void registerMember(Member member) {
//		this.member = member;
		members[index] = member;
		if(index < members.length-1) {
			members[index] = member;
			index++;
		}
	}
	
	public Member[] allMember() {
//		return member;
		return members;
	}

	public Member searchOneById(String memberId) {
		// TODO Auto-generated method stub
		for(Member member : members) {
			if(memberId.equals(member.getMemberId())) {
				return member;
			}
		}
		return null;
	}
}

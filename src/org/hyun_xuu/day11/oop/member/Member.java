package org.hyun_xuu.day11.oop.member;

public class Member {
	private String memberName;// 접근을 막는 private
	private String memberEmail;
	private String memberPhone;
	private String memberAddress;

	public Member() {
	}

	public Member(String memberName, String memberEmail, String memberPhone, String memberAddress) {
		super(); // 우클릭 > source >
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
	}

	// getter,setter 는 입력데이터에 대한 검증이 가능해짐./입력하거나 출력하거나
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		// if(memberName.length()>2)
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	@Override
	public String toString() {
		return "Member [memberName=" + memberName + ", memberEmail=" + memberEmail + ", memberPhone=" + memberPhone
				+ ", memberAddress=" + memberAddress + "]";
	}
}

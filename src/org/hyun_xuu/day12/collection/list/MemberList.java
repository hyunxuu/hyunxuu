package org.hyun_xuu.day12.collection.list;

class Member{
	
}
//배열의 한계 : 배열은 1개의 데이터 타입에 대해 여러 데이터를 넣을 수 있음.
// -> 1개의 데이터 타입에 대해서만 넣을 수 있음.
// -> object 클래스를 사용하면 모든 클래스를 사용할 수 있음.
public class MemberList {
	Member[] members;
	int size;
	
	public MemberList() {
		members = new Member[3];
		size =0;
	}
	//추가
	public void add(Member member) {
		members[size] = member;
		size++;
	}
	//조회
	public Member get(int index) {
		return members[index];
	}
	//크기
	public int size() {
		return size;
	}
	//삭제
	public void clear() {
		members = new Member[5];
		size=0;
	}
}

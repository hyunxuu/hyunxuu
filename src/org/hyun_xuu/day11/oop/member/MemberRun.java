package org.hyun_xuu.day11.oop.member;

public class MemberRun {
	public static void main(String[] args) {
		ViewMember view = new ViewMember();
		ManageMember mng = new ManageMember();
		
		end:
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1:
				Member member = view.inputMember();
				mng.insertMember(member);  // 저장 완료
				break;
			case 2: 
				//회원 검색(이메일)
				String email = view.inputEmail("검색");
				member = mng.searchOneByEmail(email);
				if(member != null)
					view.printOneByEmail(member);
				else
				view.displayMassage("검색 결과가 없습니다.");
				break;
			case 3: 
				//회원 전체 정보 출력
				Member[] members = mng.getAllMembers();
				view.printAllMembers(members);
				break;
			case 4:
				//회원 정보 수정
				// 이메일 입력
				email = view.inputEmail("수정");
				// 데이터 확인
				member = mng.searchOneByEmail(email);
				if(member != null) {
					//수정할 값을 입력받음
					member = view.modifymember(email);
					// 수정
					mng.updateMember(member);
				}
				break;
			case 5:
				//회원 정보 삭제
				mng.deleteAllMember();
				break;
			case 0: 
				view.displayMassage("프로그램을 종료합니다.");
				break end;
			default : view.displayMassage("잘못 입력하셨습니다.");
			}
		}
	}
}

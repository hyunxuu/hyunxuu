package org.hyun_xuu.day10.oop.interfaceex;

public class Exam_Interface {
	public static void main(String[] args) {
		//PhoneInterface phone = new PhoneInterface(); >> 사용 불가 : 상속받은 클래스 써줘야 함 
		PhoneInterface phone = new SamsungPhone();
		phone.printLogo();
		phone.sendCall();
	}
}

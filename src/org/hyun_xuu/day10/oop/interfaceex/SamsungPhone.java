package org.hyun_xuu.day10.oop.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("====== SAMSUN ======");
	}

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("====== S-PHONE CALL ======");
	}

}

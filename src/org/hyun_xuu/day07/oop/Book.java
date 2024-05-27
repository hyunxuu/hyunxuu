package org.hyun_xuu.day07.oop;

public class Book {
//멤버필드
	String bookName;
	String auther;
	
	public Book() {
		this("","");
	}
	
//멤버메소드
		public Book(String bookName, String author) {
			this.bookName=bookName;
			this.auther=author;
	}
}

package org.hyun_xuu.day08.oop.objectArray;

public class Book {
	String title;
	String author;
	
		public Book() {}
		
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
		
		public String toString() {
			return"("+this.title+","+this.author+")";
		}
}

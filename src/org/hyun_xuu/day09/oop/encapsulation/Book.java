package org.hyun_xuu.day09.oop.encapsulation;

public class Book {
	
	public static void main(String [] args) {
//		Book book=new Book();
//		book title = "춘향전";
//		book.author = "작자미상";
		
		//필드에 직접 접근하지 않고 객체 초기화
		//생성자를 통해서 초기화
		Book book = new Book("춘향전","작자미상");
		
		//setter() 메소드를 이용한 초기화
		Book bookbook = new Book();
		bookbook.setTitle("춘향전");
		bookbook.setAuthor("작자미상");
	}
	
	private String title;
	private String author;
	
		public Book() {
			this("","");
		}
		
		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}

		//1.set을 쓰고 필드명을 낙타표기법으로 써줌
		//ex)필드가 name이면 setter()메소드는 setName() 이 됨.
		//2.get을 쓰고 필드명을 낙타표기법으로 써줌
		//ex)필드가 age면 getter() 메소드는 getAge가 됨.
		
		//setter()메소드 : 필드에 직접 적급하지 못하게 하고 우회해서 접근하게 함
		public void setTitle(String tilte) {
			this.title = title;
		}
		
		public void setAuthor(String author) {
			this.author=author;
		}
		
		//getter()메소드 :
		public String getTitle() {
			return this.title;
		}
		
		public String getAuthor() {
			return this.author;
		}
		
		public String toString() {
			return"("+this.title+","+this.author+")";
		}
}

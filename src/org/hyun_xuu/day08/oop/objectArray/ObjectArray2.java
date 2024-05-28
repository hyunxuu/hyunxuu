package org.hyun_xuu.day08.oop.objectArray;

import java.util.Scanner;

public class ObjectArray2 {

	public static void main(String[] args) {
	//여러개의 챙이 존재하는데 그 책의 정보를 여러개 저장하려고 함
	// 책은 5권까지 지정할 수 있고 제목과 저자만 입력받아 저장할 수 있는 프로그램
		Book [] books =new Book[3];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i<books.length; i++) {
			System.out.println((i+1)+"번째 책 이름을 입력하세요.");
			System.out.print(">>");
			String title = sc.nextLine();	
			System.out.println((i+1)+"번째 책 저자를 입력하세요.");//nextLine >> 띄어쓰기 가능.
			System.out.print(">>");
			String author = sc.nextLine();
			books[i] = new Book(title, author);
		}
		
		for(Book book : books) {
			System.out.println(book.toString());
		}
	}
}

package org.hyun_xuu.day01.inputsc;

import java.util.Scanner;

public class Exercise_Scanner1 {
	public static void main(String [] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름은 무엇인가요?");
		String name = sc.next();
		System.out.println("도시는 어디에 사나요?");
		String city = sc.next();
		System.out.println("나이를 숫자로 적어주세요.");
		int age = sc.nextInt();
		System.out.println("몸무게를 숫자로 입력해 주세요");
		double weight = sc.nextDouble();
		System.out.println("독신 여부를 입력해 주세요.");
		String soloYn = sc.next();
		System.out.println("이름은 "+name+", 도시는 "+city+", 나이는 "+age+ ", 체중은 "+weight+", 독신 여부는 "+soloYn );
		sc.close();
	}
}

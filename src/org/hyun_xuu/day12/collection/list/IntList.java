package org.hyun_xuu.day12.collection.list;

public class IntList {
	int[] nums;
	int size;   
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	//배열에 넣을 값
	public void add(int num) {
		nums[size] =num;
		size++;
	}
	//전달할 값 ( 전체값을 가져올 때는 매개변수 없어도 됨.// 1개의 값을 가져올 땐 필요함.
	public int get(int index) {
		//return nums;       // 리턴 타입 int[]  <- 리턴값의 자료형
		return nums[index];	 // 리턴 타입 int 	 <- 리턴값의 자료형
	}
	
	public int size() {
		return size;
	}
	// 지우기
	public void clear() {
		//1. for문 으로 초가화 , 2. 배열 자체 초기화
		nums = new int[3];
		size = 0;
	}
}

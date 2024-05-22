package org.hyun_xuu.day04.array;

public class Exam_Array {
	public static void main(String [] args) {
		int num; // 변수 선언
		num = 1;  //변수 초기화
		
		int[] nums;			//배열 선언
		nums = new int[10];//배열 생성
		nums[0]=1;			//배열 초기화
		//[stack영역 (nums의 주소값,num이 들어있음)] (nums:참조변수 > 주소값을 저장함)
		//[heap영역(nums에 지정한 영역(/주소)이 들어감)]
		//[static영역]
		System.out.println(nums[0]);  //=1; 로 출력시킴
		System.out.println(nums[1]);  //1만 넣었기 때문에 1로 생성하면 0으로 출력(1은0번) 
		//System.out.println(nums[10]); //new int[10] 은 0~9까지임 10을 넣으면 오류.
		
		System.out.println(nums.length);  //태그이용하여 길이 알기
		
		for(int i=0;i<10;i++) {      
			System.out.println(nums[i]);  //for문으로 길이 알기
		}
	}
}

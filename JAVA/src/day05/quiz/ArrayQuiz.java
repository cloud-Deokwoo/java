package day05.quiz;

import java.util.Arrays;

public class ArrayQuiz {

	public static void main(String[] args) {
		// 1. 1000개짜리 int형 배열을 생성한 뒤 모든 값을 1 - 100사이의 
		//    램덤 숫자로 채워보세요
		int[] num = new int[1000];
		
		for (int i=0;i<1000;i++) {
			num[i] = (int)(Math.random() * 100) + 1; // 1 - 100 정수 
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num.length);
		
		// 2. 1000개의 램덤 숫자들 중 각 숫자가 몇번씩 나왔는지 세어 출력하세요 
		int[] cnt = new int[100];
		
		for(int j = 1; j <= 100; j++) {   // 1 - 100 의 나온 횟수 
			for(int i = 0;i < num.length;i++) {   // 전체 데이터에서 1-100사이 값 찾기
				if(j==num[i]) {
					cnt[j-1]++;
				}
			}
		}
		
		int check = 0;    // 검증!!
		for (int i = 0; i < cnt.length; i++) {
			System.out.println(i+1 +"이 나온 횟수 : "+cnt[i]);
			check += cnt[i];
		}
		System.out.println(check);  // 1000
	
	}

}

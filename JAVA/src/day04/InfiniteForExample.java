package day04;

import java.util.Scanner;

public class InfiniteForExample {
	
	public static void main(String[] args) {
	
		//for문의 무한 루프
//		for(int i=0;true;i++) {
//			System.out.println(i);
//		}
		
		// 루프(반복문)에서 빠져나올 코드를 만들어 놓아야 합니다.  
//		for(;;) {
//			System.out.println('a');
//		}
		
		// break 문
		// 반복문 내부에서 쓸 수 있음.
		// 반복문에서 break를 만나면 반복문을 종료-탈출
		// 다중 반복문 내부에 속해 있더라도 break를 만나면 해당 break가 속한
		// 반복문 하나만 탈출
//		for(int i = 0; true; i++) {
//			System.out.println(i);
//			for (int j = 0; true; j++) {
//				System.out.println("j반복");
//				if(j== 58) {
//					break;
//				}
//			}
//		}
		
		System.out.println("루프 탈출");
		//무한 반복 활용 예
		String answer = "자동차";
		Scanner scan = new Scanner(System.in);
		
//		for(;;) {
//			System.out.print(">");
//			String attempt = scan.nextLine();
//			if(answer.equals(attempt)) {      // 문자열 비교는 "=="쓰지 않음! equals() 메서드 사용!!
//				System.out.println("정답!!");
//				break;
//			}
//		}
		
		
		String attempt = "";
		for (;!attempt.contentEquals(answer);) {
			System.out.print("> ");
			attempt = scan.nextLine();
		}
		System.out.println("정답!");
		
		
		
		
		
		
		
		
	}
	
}

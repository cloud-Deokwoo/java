package day03;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// switch case 문을 사용하여 특정 문자를 입력받는 경우에 내용출력
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
//		System.out.println(str.charAt(0));
		switch(str.charAt(0)) {
			case 'I':
			case 'ㅑ':
			case 'i':
				System.out.println("데이터를 입력합니다.");
				break;
			case 'ㅕ':
			case 'U':
			case 'u':
				System.out.println("데이터를 수정합니다.");
				break;
			default :
				System.out.println("명령어가 올바르지 않습니다.");
				break;
		}
		
			
		

	}

}

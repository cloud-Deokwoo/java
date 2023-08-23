package day05.quiz;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// 1. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		Scanner scan = new Scanner(System.in);
		System.out.print("> ");
		char ch = scan.nextLine().charAt(0);  //charAt()
		
		if(ch >='A' && ch <='Z') {
			ch = (char)(ch - 'A' + 'a');  // B
		}else if(ch >='a' && ch<='z') {
			ch = (char)(ch - 'a' + 'A');
		}
		
		System.out.println(ch);
		
		// String.toUpperCase() : 문자열을 대문자 문자열로 변경 
		// String.toLowerCase() : 문자열을 소문자 문자열로 변경
		System.out.println("Hello, world!".toUpperCase());  //HELLO, WORLD!
		System.out.println("Hello, world!".toLowerCase());  //hello, world!
		
		
		
		// 2. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		
		// 3. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...

	}

}

package day03;

//패키지는 소문자로만 구성됨. 대/소문자로 패키지와 클래스를 쉽게 구분 
import java.util.Scanner;


public class IOExample {

	public static void main(String[] args) {
		// Scanner 클래스는 입력값을 처리하는 객체 
		Scanner scan = new Scanner(System.in);
		
		// 사용자의 입력을 기다리다가 
		// next()는 한 단어를 nextLine()은 한 문장읽기
		System.out.print(">");
//		String line = scan.next();  	// 입력값의 공백(space, tab, enter)까지 처리
		String line = scan.nextLine();	// 입력값 중 enter("\n")까지 입력 처리
		System.out.println("사용자가 입력한 문자열 : "+line);
		
		// 참조 타입 변수에 "."을 찍은 후에 Ctrl + Space를 사용하여 그 타입에서 사용할 수 있는 기능
		// 기능들(함수-메서드들)을 볼 수 있음.
//		System.out.print("has next boolean : ");
//		boolean b = scan.hasNextBoolean();
//		System.out.println("boolean 포함 여부 : "+ b);
		
		// 사용자 입력 기다리고, 
		// 사용자가 입력한 정수 값을 읽어들임. 
		System.out.print("아무 정수 값이나 입력하세요 >>>");
		int num = scan.nextInt();
		System.out.println("사용자가 입력한 정수 : "+ num);
		System.out.println("사용자가 입력한 정수로 만든 char :"+(char)num);
		
		// 객체 정리하는 close()
		scan.close();
	}

}

package day03;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// 단순 if 구문
		
		// if (조건식) { 여러개의 실행문 }  or 실행문
		// if문은 조건식이 true인 경우에 실행문이 동작합니다. 
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 >>");
		int num = scan.nextInt();
		
		if(num >= 10) System.out.println("입력한 정수는 10보다 크거나 같습니다.");
		if(num < 0) {
			System.out.println("입력한 정수 "+num+"는 음수입니다.");
		}
		
		System.out.println("프로그램 종료!!");
		
		scan.close();
	}

}

package day03;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// quiz01
		int num = (int)(Math.random()*100) + 1;  //1 ~ 101미만의 int (1 ~ 100)
		System.out.println("랜덤수는 : "+num);
		// if
		System.out.println("3항 연산의 결과 : "+(num%2==0? "짝수":"홀수"));
		
		// quiz02
		int num2 = 5 - (int)(Math.random()*11); // 0 ~ 10
		System.out.println("램덤수는 : "+num2);
		//3항
		int abs = (num2 >= 0)? num2 : -num2;
		System.out.println(num2 + "의 절대값은 : "+abs);

		// quiz03
		Scanner scan = new Scanner(System.in); 
		System.out.print("정수를 입력하세요 > ");
		int num3 = scan.nextInt();
		String result = num3%2 == 0? "짝수":"홀수";
		System.out.println("입력받은 수는 : "+(num3%2 == 0? "짝수":"홀수"));
		
		
		//quiz04
		// 키(double), 나이(int) 
		// Scanner scan = new Scanner(System.in);
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키 : ");
		double height = scan.nextDouble();
		System.out.print("나이: ");
		int age = scan.nextInt();
		System.out.println("========================");
		if(height >= 140) {
			if(age >= 8) {
				System.out.println("놀이기구 탑승이 가능합니다.");
			}else {
				System.out.println("놀이기구 탑승불가");
			}
		}else {
			System.out.println("놀이기구 탑승불가합니다.");
		}
		
		
		//quiz05  
		// 정수 2개 입력 받아서 큰 수를 출력, 같으면 같다고 출력
		System.out.println("정수 두개를 입력하세요");
		System.out.print(">");
		int num10 = scan.nextInt();
		System.out.print(">");
		int num20 = scan.nextInt();
		
		if (num10 == num20) {
			System.out.println("같은 수 입니다.");
		}else if(num10 > num20) {
			System.out.println(num10 +"이 큰 수 입니다.");
		}else {
			System.out.println(num20+"이 큰 수 입니다.");
		}
		
		//quiz06
		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int num30 = scan.nextInt();
		if(num30 > 0) {
			if(num30%2 ==0) {
				System.out.println(num30+"은(는) 짝수입니다.");
			}else {
				System.out.println(num30+"은(는) 홀수입니다.");
			}
		}else if(num30 == 0) {
			System.out.println("입력한 정수는 0입니다.");
		}else {
			System.out.println(num30+"은(는) 음의 정수입니다.");
		}
		
		//quiz07
		System.out.println("구매할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤]");
		System.out.print("> ");
		String fruit = scan.next();
		
		switch (fruit) {
		case "수박":
			System.out.println(fruit + "의 가격은 2만원입니다.");
			break;
		case "사과":
			System.out.println(fruit + "의 가격은 3만원입니다.");
			break;
		case "멜론":
			System.out.println(fruit + "의 가격은 4만원입니다.");
			break;
		case "포도":
			System.out.println(fruit + "의 가격은 5만원입니다.");
			break;
		case "귤":
			System.out.println(fruit + "의 가격은 6만원입니다.");
			break;
		default:
			System.out.println(fruit + "은 메뉴에 없습니다.");
			System.out.println("다시 입력해주세요.");
			break;
		}
		
		// scan 객체 close
		scan.close();
	}

}

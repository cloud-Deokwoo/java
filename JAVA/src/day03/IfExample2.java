package day03;

import java.util.Random;

public class IfExample2 {

	public static void main(String[] args) {
		// 난수 생성 : 임의 값(random)
		// 1. Math.random() : 0 ~ 1미만의 임의 값을 출력
		// 2. Random 을 임포트 : import 명령어는 라이브러 클래스를 로드
		//   각 타입별로 난수를 발생시키는 메서드가 Random에 존재함. 
		//   난수를 생성하기 위한 Seed를 지정할 수 있음. Seed가 동일하면
		//   동일한 난수가 발생함. 
		//   Random 메서드
		//   - nextFloat() = 0.0이상 1.0미만의 float형 난수 발생
		//   - nextBoolean() = true or false 중 임의 값을 발생
		//   - nextInt() = int형 타입 이내의 모든 값에서 난수 발생
		//   - nextInt(int) = 0부터 생성자에 들어간 숫자 -1까지 int형 난수 발생
//		
//		Random rand = new Random();
//		float a = rand.nextFloat();
//		boolean b = rand.nextBoolean();
//		int c = rand.nextInt();
//		int d = rand.nextInt(10);
//		System.out.printf("%f, %b, %d, %d", a,b,c,d);
		
		//if ~ else 구문 : if조건식 true면 if의 실행문,그렇지 않으면 else의 실행문을 구동
		
		//정수 난수 발생(0 ~ 99)
		int jumsu = (int)(Math.random() * 100);
		
		System.out.println("점수 : "+ jumsu);
		/*
		 *  print() : 전달된 값을 출력
		 *  printf() : 문자열의 포맷문자를 이용하여 결과를 출력
		 *  println() : 문자열 값에 마지막에 \n 추가됨. 즉, 줄바꿈 처리함.
		 */
		
		if (jumsu >= 60) {
			System.out.println("60이상인 점수입니다.");
			System.out.println("합격 하셨습니다.");
		}else {
			System.out.println("60보다 작은 점수입니다.");
			System.out.println("불합격 하셨습니다.");
		}

	}

}

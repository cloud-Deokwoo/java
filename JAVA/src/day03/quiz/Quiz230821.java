package day03.quiz;

public class Quiz230821 {

	public static void main(String[] args) {
		//  1. 100부터 1까지 순서대로 출력해보세요
		for (int i = 100; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		//  2. 1 ~ 200 사이의 수 중에서 (2 또는 3의 배수)가 아닌 수들의 총 합을 구해보세요
		int sum = 0;
		for (int i = 1; i <= 200; i++) {
			if(!(i%2==0 || i%3 == 0)) {
				sum += i;
			}
			// if (i%2 != 0 && i%3 !=0) sum += i;
		}
		System.out.println("\n"+sum);
		
		//  3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + .... + (1+2+3+...+10)의 결과를 구해보세요
		// 이중 반복문을 사용하거나, 규칙을 찾아서 풀기
		sum = 0;
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum = i;
			sum2 += sum;
		}
		System.out.println("반복문 하나로 푼 결과 : "+sum2);
		
		sum = 0;
		for (int i = 1; i <= 10; i++) {
	
			if(i!=1) System.out.print("+(");
			for (int j = 1; j <= i; j++) {
				// 소괄호 안에 더하기... 
				sum += j;
				System.out.print(j);
				if(j != i)	System.out.print("+");  // 끝
			}
			if(i!=1)System.out.print(")");
		}
		System.out.println("\n반복문 두개를 사용하여 푼 결과 : "+sum);
	}

}

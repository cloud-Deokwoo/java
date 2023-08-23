package day04.quiz;

public class LoopQuiz {

	public static void main(String[] args) {
		// 1. 소수(PrimeNumber) 구하기
		//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
		//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
		//   (for문 안에 for문)
		
		System.out.println("===== Prime Number =====");
		int cnt;
		for (int i = 2; i <= 100; i++) {
			cnt = 0;  // 배수여부 확인
			for(int j=1; j<=i;j++) { 
				if(i%j == 0) {
					cnt++;
				}
			}
			//소수인 경우
			if(cnt == 2) {
				System.out.print(i + " ");
			}
		}
				
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
		
		
		
		// 3. 로또 번호 추출하기
		//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
		//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
		//   (while문에 for)

	}

}

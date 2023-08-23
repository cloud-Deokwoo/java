package day02.cal;

public class RemainderExample {

	public static void main(String[] args) {
		// +, -, *, /, %
		
		//산술 연산
		byte a = 127;
		byte b = 20;
		byte c = (byte)(a+b); //128 -19 = -109
		System.out.println("계산 결과 : "+c);
		
		int a1 = 100000;
		int b1 = 100000;
		long c1 = (long)a1*b1;
		System.out.println("계산 결과1 :"+c1);
		
		int a2 = 3;
		int b2 = 2;
		double data = a2/b2;  // data값은 1.0  why? 정수 계산
		System.out.println("계산 결과 2 :"+data);
		// 값을 소수점 2자리까지 출력!! 
		float pi = 3.141592f;
		float shortPi = (int)(pi*100)/100f;
		System.out.println("파이 2자리까지 출력 : "+shortPi);
		
		// 나머지... : 1) 배수 관계 2) 특정 범위 값을 출력
		for(int i=1; i<=10;i++) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(3.5 % 0.3);  //권장 안함
	}

}

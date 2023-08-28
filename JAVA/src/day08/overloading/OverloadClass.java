package day08.overloading;

public class OverloadClass {
	
	//OverLoad의 조건
	// 1. 이름이 같아야 합니다. 
	// 2. 접근제한자나 반환유형은 영향을 미치지 않습니다.
	// 3. 매개변수의 유형이 달라야 합니다. 
	// 4. 매개변수의 개수가 달라야 합니다. 
	// 5. 매개변수의 순서가 달라야 합니다. 
	
	public void abc(int i, String str) {
		System.out.println("정수와 문자열이 입력됨");
	}
	public double abc(double a, double b) {
		System.out.println("부동 소수점이 입력됨");
		return 0.0;
	}
	public void abc(String str) {
		System.out.println("문자열이 입력됨");
	}
	

}

package day06;

public class VariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable var = new Variable();
		var.printNum(2);
	}

}

/*
 * 	멤버변수(Member Variable)
 *   - 클래스 안에서 선언 된 변수
 *   - 객체를 생성할 때 각 데이터 타입의 기본값으로 자동 초기화
 *   - 기본값 : 정수형 0 , 부동소수점형 0.0, 논리형 false, 객체 null
 *   
 *   지역변수(Local Variable)
 *   - Automatic variable
 *   - 메서드 안에서 선언된 변수
 *   - 사용하기 전에 반드시 초기화 해야 함
 */


//변수 클래스
class Variable {
	int a;     	//멤버 변수 a
	
	public void printNum(int c) {  //매개변수 c
		int b = 1;    //지역변수 ** 지역변수는 반드시 초기화 해야 함.
		System.out.println("멤버변수 : "+ a);
		System.out.println("지역변수 : "+ b);
		System.out.println("매개변수 : "+ c);
	}
}



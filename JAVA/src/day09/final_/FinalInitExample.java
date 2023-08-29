package day09.final_;

public class FinalInitExample {

	// final 멤버변수는 선언시(a), 초기화자(b), 또는 기본 생성자(c) 중에 하나에서 반드시 초기화 해야 함
	// 기본 생성자가 아닌 생성자에서는 파라미터를 통한 초기화 안됨.!!!
	
	public static void main(String[] args) {
		FinalInit f = new FinalInit(30);
		System.out.println(f.a);
	}

}

class FinalInit {
	final int a;
//	final int a= 10; 	//a
//	{
//		a = 10;			//b
//	}
	FinalInit() {		//c
		a = 10;
	}
//	
	FinalInit(int a){
		this.a = a; // 이것은 final 필드의 초기화가 아님.
	}
}

/*
 * 	Final
 *  - 클래스, 변수, 메서드에서 사용
 *  - 클래스
 *   > 상속 불가능, 인스턴스를 생성 사용
 *   > String
 *  - 변수
 *   > 상수 정의
 *   > 상수 정의 시에 static 따라다님
 *   > 로컬 클래스의 메서드에서 지역변수를 참조야 하는 경우, 지역변수에 final을 붙여야 함.
 *  - 메서드
 *   > 재정의 불가능하게 함(overiding X)
 * 
 * 
 */











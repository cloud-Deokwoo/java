
public class MemberVariableExample {
	
	//멤버 변수란? 클래스 내에서 사용하는 변수를 의미함(인스턴스 변수)
	int a;    		//멤버 변수(인스턴스 변수, 속성, 필드)
	static int b; 	//멤버 변수(클래스 변수)

	public static void main(String[] args) {
		//멤버 변수는 사용하기 전에 초기화 하지 않아도 기본값으로 초기화 됨
		System.out.println("b의 초기값 : "+b);
		new MemberVariableExample().test();
	}
	
	public void test() {
		System.out.println("a의 초기값 : "+a);
	}
	
	

}

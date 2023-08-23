package day02.cal;

public class UnaryExample {

	public static void main(String[] args) {
		// ++, -- 은 1씩 증/감 처리
		int i = 1;
		int j = i++;  // 후위 연산자
		
		System.out.println("후위 연산자");
		System.out.println("i의 값은 "+i);
		System.out.println("j의 값은 "+j);		
		
		int x = 1;
		int y = ++x;
		System.out.println("\n전위 연산자");
		System.out.println("x의 값은 "+x);
		System.out.println("y의 값은 "+y);
		

	}

}


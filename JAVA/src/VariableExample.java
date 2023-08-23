
public class VariableExample {

	public static void main(String[] args) {
		// 변수의 값 대입 : 변수 = 값;
		// "=" 대입 연산자 : 일반적으로 = 동의 의미지만, 프로그램에서는
		// 좌변에 우변에 있는 값을 대입한다는 의미... 
		
		int a = 1;
		int b = 2;
		a = a + b;
		System.out.println(a);
		System.out.println(b);

	}
	
	/*
	 * 메서드 형식 
	 *  <return type> <method-name> ( parameter_list ) {
	 *  ....
	 *  }
	 *  
	 *  return_type : 메서드 블록 내에 실행한 결과를 반환하는 형태지정
	 *    반환 값은 "return" 명령어를 사용함. 반환값이 없는 경우"void"
	 *  
	 */
	public void test() {
		int a = 0;
		System.out.println("a의 초기값 : "+a);
	}

}

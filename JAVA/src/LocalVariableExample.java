
public class LocalVariableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 변수 선언 방법 
		 *  <type> <variableName>;
		 *  <type> <variableName> = <초기값>;
		 *  
		 *  -type : 저장할 데이터가 어떤 유형의 데이터인지 알려주기 위해서 
		 *      이미 정의되어 있는 자료형 키워드
		 *    기본 자료형 정수형(byte, short, int, long)
		 *    부동소수점형 (float, double)
		 *    논리형 (boolean), 문자형(char)
		 *  -variableName : 변수이 이름(식별자)
		 *  
		 * 변수 초기화 방법
		 *   <variableName> = <literal>;
		 *  - 초기화 : 변수를 선언하면 메모리에 그 변수를 위한 공간을 할당함. 
		 *        이 할당된 공간에 처음으로 값을 입력하는 것을 초기화라고 합니다.
		 *  - 리터럴(literal) : JAVA 내에서 데이터값을 그대로 쓴 상수를 의미함
		 */
		
		int a = 0;   // 지역변수 - 블럭 내에서 선언된 변수를 의미하고, 사용할 때에 초기화 필요
		System.out.println(a);  

	}

}

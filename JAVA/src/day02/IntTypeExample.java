package day02;

public class IntTypeExample {

	public static void main(String[] args) {
		byte a = (byte)128;  // byte a = (byte)128;   
		short b = (short)32768; // short b = (short)32768;
		int c = 2147483647; // int c = 2147483647
		long d = 2147483648L; // long d = 2147483648L;
		
		/*
		 *  형변환(type casting)
		 *  - 데이터의 크기
		 *   byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 *  - 크기가 작은 테이터 타입을 크기가 큰 데이터 타입으로 변환할 때에 
		 *   캐스트 연산자를 사용하지 않아도 컴파일러는 자동으로 형 변환이 일어남
		 *   (자동 형 변환 : Promotion)
		 *  - 크기가 큰 데이터 타입을 크기가 작은 데이터 타입으로 변환할 때는 반드시
		 *   캐스트 연산자를 사용하여 변환할 데이터 타입을 명시해야 합니다. 
		 *   (강제 형 변환 : Type Casting) 그렇게 하지 않으면 컴파일시 오류 발생
		 *  - 서로 다른 타입의 데이터의 연산을 진행하는 경우 두 데이터 중 큰 데이터 타입
		 *   을 가진 쪽에 맞추어 자동 형변환 된 후 연산을 진행합니다. 
		 *  - int형보다 작은 데이터 타입의 연산을 진행하는 경우 자동으로 int형으로 
		 *   형 변환이 일어남
		 */
		
		
		System.out.printf("%d, %d, %d, %d\n", a, b, c, d);
		
	}

}

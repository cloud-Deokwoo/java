package day19.lamda;

public class LambdaFunctionEx {

	public static void main(String[] args) {
		//람다식 표현
		InterfaceEx ie = (int x, int y) -> x + y;
		
		//기본 자바 표현
		InterfaceEx ie2 = new InterfaceEx() {
			
			@Override
			public int sum(int x, int y) {
				return x + y;
			}
		};
		
		
		System.out.println(ie.sum(1, 2));
		System.out.println(ie2.sum(1, 2));
	}

}

//함수적 인터페이스  : 추상메서드 한개를 가지고 있는 인터페이스
interface InterfaceEx{
	public int sum(int x, int y);
}


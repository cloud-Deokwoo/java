package day05;

public class VaribleLifetime {
	
//	static int c;
	int b = 8;  //멤버 변수(instance 변수)

	public static void main(String[] args) {
		// 변수의 수명
		
		// {}블럭 내부에서 선언된 변수 지역변수로 {}을 벗어나면 사라진다. 
		// 변수가 살아있는 범위를 변수의 영역(scope)이라고 부른다. 
		// 변수의 영역만 겹치지 않는다면 같은 이름의 변수를 사용할 수 있어요!!!
		int b = 5;  
		System.out.println("main method의 b : "+ b);
//		c = 10;
		VaribleLifetime obj = new VaribleLifetime();
		System.out.println("class의 b : "+obj.b);
		VaribleLifetime obj2 = new VaribleLifetime();
		System.out.println("Class의 b : "+obj2.b);
		
		if(true) {
			int a = 10; //지역 변수
			System.out.println(a);
			a = 7; 
		}
//		a = 7;
		for (int i=0;i<10;i++) {
			//내부의 i는 for문을 벗어나지 못해요
		}
		int i = 10;
		
	}

}

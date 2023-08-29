package day09.static_;

public class StaticInit {
	
	static {  // 생성자가 실행되기 전,static 변수 초기화. 객체를 여러번 생성해도 한번만 실행(생성자와 다름)
		System.out.println("static initializer가 수행됨");
	}
	
	public StaticInit() {
		System.out.println("Constructor 호출됨");
	}

}

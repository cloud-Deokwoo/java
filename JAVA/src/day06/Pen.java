package day06;

public class Pen {
	// 클래스 안에 코드 작성
	// attribute(속성-멤버변수), constructors(생성자),methods(메서드)
	
	// 멤버변수
	public String color;  	//패키지 상관없이 불러올 수 있음 - public
	int price;				//같은 패키지 내에서 불러올 수 있음 - default
	
	// 메서드
	public void write() {
		System.out.println("Hello World!!!");
	}
}

package day11.innerclass;

public class University {
	
	int num;
	static String name;
	// static 내부 클래스 사용(정적 내부클래스). static이 붙은 멤버와 동일하게 사용이 가능함.
	// 내부클래스는 외부 클래스의 모든 멤버에 접근이 가능하나 static 붙으면 static 멤버만 접근 가능함.
	// 접근 방식에 의해서 객체 생성 방법에서 차이 생기게 됩니다. 
	// static 없는 멤버 이너 클래스는 외부 객체를 생성한 후에 내부 클래스에 접근이 가능함.
	// static이 있는 경우에는  외부 클래스 객체 생성 없이 바로 호출이 가능하게 됨. 
	static class Student{
		
	}

}

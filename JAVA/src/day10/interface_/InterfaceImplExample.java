package day10.interface_;

/*
 * 	인터페이스 정리!!!
 *   - 단일 상속 문제점을 해결할 수 있음
 *   - 인터페이스 메서드는 추상메서드이여야 함
 *   - 인터페이스의 변수는 자동으로 상수가 됨
 *   - 인터페이스 구현할 때는 implements
 *   - 인터페이스를 여러개 implements 할 수 있다.(구현)
 *   - 인터페이스는 다른 인터페이스 여러개를 extends 할 수 있다.(상속)
 *   *** 기능의 명세를 위해서 사용합니다. *** 
 * 
 * 
 */

public class InterfaceImplExample {

	public static void main(String[] args) {
		ToDo todo = new ToDo();
		IToDo3 itodo3 = todo;  //다형성이 적용됨.
		itodo3.m1();
		itodo3.m2();
		itodo3.m3();
//		itodo3.m4();  // Error - IToDo3는 m4()가 없음
		IToDo4 itodo4 = todo;
		itodo4.m4();
		

	}

}

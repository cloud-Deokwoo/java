package day09.static_;

public class Count {
	public int a = 0;
	public static int b=0;
	
	public static int doIt() {
//		return ++a;  //Cannot make a static reference to the non-static field a
		// static 메서드는 인스턴스 변수(a)를 객체 생성 없이 참조 불가능
		++new Count().a;  //++((new Count()).a)
		return ++b;
	}
}

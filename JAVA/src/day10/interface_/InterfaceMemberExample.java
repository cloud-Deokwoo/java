package day10.interface_;

public class InterfaceMemberExample implements ISomething {

	@Override
	public void run() {   // 재정의 해주어야 함... 
//		My_INT = 33;   // ISomething인터페이스의 final 변수임...
		System.out.println("run() : "+ISomething.A);

	}
	
	public static void main(String[] args) {
		System.out.println(ISomething.My_INT);
		System.out.println(InterfaceMemberExample.My_INT);
		ISomething is = new InterfaceMemberExample();
		is.run();
		InterfaceMemberExample im = new InterfaceMemberExample();
		im.run();
	}

}

package day09.final_;

public class FinalLocalVarExample {
	
	public int data = 100;

	public static void main(String[] args) {
		new FinalLocalVarExample().doIt("홍길동");
	}
	
	public void doIt(final String name) {
		final int age = 38;
		class InnerLocal {
			public void innerDoIt() {
				System.out.println("외부 클래스의 멤버변수 data : "+data);
				System.out.println("외부 클래스의 파라미터 변수 name : "+name);
				System.out.println("외부 클래스의 지역변수 age : "+ age);
			}
		}
		new InnerLocal().innerDoIt();
		
	}

}

package day19.lamda;

import java.util.function.Consumer;

public class LambdaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o = new Outer();
		o.method();
		
	}

}

@FunctionalInterface
interface LambdaInterface5 {
	int iv = 20;
	void method();
}

class Outer {
	public int iv = 10;
	void method() {
		final int iv = 40;  
		LambdaInterface5 f5 = () -> {
			System.out.println("Outer.this.iv : "+Outer.this.iv);
			System.out.println("this.iv : "+this.iv);
			System.out.println("iv : "+iv);
		};
		f5.method();
	}
}

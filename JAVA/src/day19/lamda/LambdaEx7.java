package day19.lamda;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaEx7 {
	
	public static void main(String[] args) {
		// Supplier<T> : 매개변수 X, 반환 타입O
		Supplier<String> s1 = () -> {
			return "홍길동";
		};
		System.out.println(s1.get());
		
		s1 = () -> "이순신";
		System.out.println(s1.get());
	
		IntSupplier s2 = () -> {
			int num = (int)(Math.random() * 6) + 1;
			return num;
		};
		System.out.println("주사위 : "+ s2.getAsInt());
		
		DoubleSupplier s3 = () -> Math.PI;
		System.out.println("파이 값 : "+ s3.getAsDouble());
		
		
	}

}

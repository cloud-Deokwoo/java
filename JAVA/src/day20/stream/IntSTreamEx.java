package day20.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntSTreamEx {
	
	int sum;

	public static void main(String[] args) {
		// IntStream의 range(), rangeClosed() 메서드 사용
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Arrays.stream() IntStream 생성하기");
		IntStream intstream1 = Arrays.stream(arr);
		intstream1.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		System.out.println("IntStream.of() IntStream 생성하기");
		IntStream intstream2 = IntStream.of(arr);
		intstream2.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		// 두번재 매개변수 인덱스 포함 안함... 
		System.out.println("IntStream.range(1,6) IntStream 생성하기");
		IntStream intstream3 = IntStream.range(10, 16);
		intstream3.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
		// 두번째 매개변수 인덱스 값 포함
		System.out.println("IntStream.rangeClosed(1,5) IntStream 생성하기");
		IntStream intstream4 = IntStream.rangeClosed(10, 15);
		intstream4.forEach(s -> System.out.print(s + "\t"));
		System.out.println();
		
	}

}

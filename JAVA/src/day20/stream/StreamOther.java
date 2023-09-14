package day20.stream;

import java.util.Arrays;

public class StreamOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArr[] = {10,20,30,40,50,60};
		
		//double타입의 요소를 갖는 DoubleStream으로 형변환
		Arrays.stream(intArr).asDoubleStream()
			.forEach(d -> System.out.println(d));
		System.out.println();
		
		// int타입의 요소를 갖는intStream -> Stream<Integer>로 형변환
		// int -> Integer, long -> Long , double -> Double
		Arrays.stream(intArr).boxed()
			.forEach(i -> System.out.println(i.getClass()));
	}

}

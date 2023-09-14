package day20.stream;

import java.util.Arrays;
import java.util.List;

public class StreamPeek {

	public static void main(String[] args) {
		// 요소 전체에 대해 반복하는 메서드는 forEach() 메서드를 사용. peek() 메서드
		// forEach() 메서드는 최종 단계 반복... peek() 메서드는 중간 처리 반복자

		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		list.parallelStream().mapToDouble(a -> a.area())
//					.peek(a -> System.out.println(a));  // 출력 X. 왜?중간 반복자!
					.peek(a -> System.out.println(a)).sum(); 
		// peek()는 중간 반복자 이기 때문에 반드시 최정 처리 메서드가 호출되어야 동작함!!
		// sum()은 DoubleStream 타입에 있는 메서드
		
	}

}

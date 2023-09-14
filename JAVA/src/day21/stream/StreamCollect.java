package day21.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import day20.stream.Circle;
import day20.stream.Rectangle;
import day20.stream.Shape;

public class StreamCollect {

	public static void main(String[] args) {
		// collect() 메서드
		// 요소들을 필터링을 하거나 매핑한 후 새로운 객체를 생성
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		// 요소가  Rectangle 객체 인경우 collect 메서드로 List로 변환
		List<Shape> rectList = list.stream()
				.filter(s -> s instanceof Rectangle).collect(Collectors.toList());
		rectList.stream().forEach(f -> System.out.println(f));
		System.out.println();

		// 요소가 Rectangle 객체인 경우 collect 메서드를 이용 Set으로 변환
		Set<Shape> rectSet = list.stream()
				.filter(s -> s instanceof Rectangle).collect(Collectors.toSet());
		rectSet.stream().forEach(f -> System.out.println(f));
		
		
		
	}

}

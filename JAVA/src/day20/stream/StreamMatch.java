package day20.stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatch {

	public static void main(String[] args) {
		// 요소 조건 검사 : 스트림 내주의 요소들의 특징의 조건을 만족하는지 검사할 수 있는 메서드... 
		//   allMatch(Predicate p)  : 요소들이 모두  p조건를 만족하면 true, 그렇지 않으면 false
		//   anyMatch(Predicate p)  : 요소들 중 하나라도 p조건을 만족하면 true, 그렇지 않으면 false
		//   noneMatch(Predicate p) : 요소들 모두 p조건을 만족하지 않으면 true, 그렇지 않으면 false
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		// 모든 요소들이 Shape의 인스턴스(객체)인지 조건 비교
		boolean result = list.stream().allMatch(a -> (a instanceof Shape));
		System.out.println("모든 요소는 Shape의 객체입니다. -> " + result);
		
		// 요소들 중에 하나 이상이 Rectangle 객체인지 조건 비교
		boolean result2 = list.stream().anyMatch(a -> (a instanceof Rectangle));
		System.out.println("요소 중 Rectangle의 객체가 존재합니다. -> "+result2);
		
		// 모든 요소가 Circle의 객체인지 조건에 해당하지 않은지 비교
		boolean result3 = list.stream().noneMatch(a -> (a instanceof Circle));
		System.out.println("모든 요소 중 Circle의 객체가 존재하지 않는다 -> "+result3);
		
		

	}

}

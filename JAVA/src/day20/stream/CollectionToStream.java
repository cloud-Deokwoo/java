package day20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionToStream {

	public static void main(String[] args) {
		// 컬렉션 프레임워크 (Collection, List, Set)
		String[] arr = new String[] {"a","b","c","d","e","f"};
		
		// 문자열 배열을 컬렉션프레임워크 List로 변환
		List<String> list = Arrays.asList(arr);
		// List객체를 stream()메서드 이용해서 Stream객체로 생성
		Stream<String> stream = list.stream();
		
		// 내부반복자를 이용해 출력
		stream.forEach(s -> System.out.print(s+" "));

	}

}

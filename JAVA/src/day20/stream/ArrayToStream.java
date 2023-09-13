package day20.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		// 배열을 이용한 스트림 생성하기
		
		// 문자열 배열객체 생성
		String[] arr = new String[] {"a","b","c","d","e","f"};
		
		// 배열 전에 Stream 객체 변환
		Stream<String> stream1 = Arrays.stream(arr);  // 배열을 스트림으로
		stream1.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// 인덱스 지정해서 변환 (2부터 5전까지)
		// 두번째 사용된 인덱스는 포함 X
		Stream<String> stream2 = Arrays.stream(arr, 2, 5);
		stream2.forEach(s -> System.out.print(s+" "));
		
	}
}

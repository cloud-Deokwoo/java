package day20.stream;

import java.util.stream.Stream;

public class StreamByIterator {

	public static void main(String[] args) {
		// iterate() 메서드를 이용한 Stream 객체 생성
		Stream<Integer> stream = Stream.iterate(1, n -> n+1).limit(10);
		// 내부 반복자를 이용 출력
		stream.forEach(s -> System.out.print(s + " "));
 		

	}

}

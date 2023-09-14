package day21.stream;

import java.util.stream.Stream;

public class StreamConcat {

	public static void main(String[] args) {
		// 두개의 스트림 객체를 연결해서 새로운 스트림 객체로 사용하는 concat()
		
		//문자열 스트림 객체
		Stream<String> stream1 = Stream.of("홍길동","김유신","이순신","유관순");
		
		//정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		//concat() 메서드를 사용 두 스트림 객체를 합치기
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.print(a + " "));
		

	}

}

package day20.stream;

import java.util.stream.Stream;

public class StreamByGenerate {

	public static void main(String[] args) {
		// generate() 메서드를 이용한 Stream객체 생성
		
		// 리미트 설정 10개... 리미트 설정하지 않으면 무한 반복(왜? Stream 크기 제한이 없음)
		Stream<String> stream = Stream.generate(() -> "애국가").limit(10);
		
		// 내부 반복자로 출력
		stream.forEach(s -> System.out.print(s+" "));

	}

}

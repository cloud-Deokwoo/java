package day20.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamFlatMap {

	public static void main(String[] args) {
		// Map 중에 flatMapXXX() 메서드의 사용
		
		//문자열을 공백으로 분리해서 매핑
		List<String> list1 = Arrays.asList("동해물과","백두산이","마르고 닳도록");
		
		list1.stream().flatMap(data -> Arrays.stream(data.split(" ")))
					.forEach(word -> System.out.println(word));
		System.out.println();
		
		//문자열을 , 로 분리해서 double 자료형으로 변환해서 매핑
		List<String> list2 = Arrays.asList("1.1, 2.2, 3.3","4.4, 5.5, 6.6");
		DoubleStream dsr = list2.stream().flatMapToDouble(data -> {
			String[] strArr = data.split(",");
			double[] dArr = new double[strArr.length];
			for(int i=0 ; i<dArr.length ;i++) {
				dArr[i] = Double.parseDouble(strArr[i].trim());
			}
			return Arrays.stream(dArr);
		});
		dsr.forEach(n -> System.out.print(n+"\t"));
		System.out.println();
		// 문자열을 ","로 분리해서 int자료형으로 변환해여 매핑
		List<String> list3 = Arrays.asList("1, 2, 3","4, 5, 6");
		IntStream isr = list3.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] iArr = new int[strArr.length];
			for(int i=0; i<strArr.length; i++) {
				iArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(iArr);
		});
		isr.forEach(n -> System.out.print(n+"\t"));
		
	}

}

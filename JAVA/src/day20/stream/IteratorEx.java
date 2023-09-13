package day20.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

	public static void main(String[] args) {
		// 내/외부 반복자 

		List<String> list = Arrays.asList(new String[] {
				"홍길동","김유신","이순신","유관순"
		});
		
		System.out.println("for문 이용");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("외부 반복자 이용");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("내부 반복자 이용");
		list.stream().forEach(s -> System.out.println(s));
		
	}

}

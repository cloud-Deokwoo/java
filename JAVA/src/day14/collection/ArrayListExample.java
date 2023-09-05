package day14.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//추가
		list.add("one");
		boolean a = list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0f));
		boolean b = list.add("second");   //list는 중복 저장 가능!!
		list.add(new Integer(4));
		list.add("SECOND");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(list);
		
		// set 수정
		list.set(6, 8);
		System.out.println(list);
		
		// 제거
		list.remove(0);         //지정된 인덱스 값을 삭제
		list.remove("SECOND");  //지정된 값을 제거, 순서대로 제거... 
		System.out.println(list);
		
		// 값 얻어오기 : get()
		Object o = list.get(5);   // 왜? Object?
		System.out.println(o);
		
		// 사이즈
		int size = list.size();
		int idx = list.indexOf("second");
		System.out.println("list 크기는 : "+size);
		System.out.println("첫번째, second = "+idx);
		
//		String o = list.get(5);  //제너릭 설정X 타입이 지정되지 않음. 기본 Object 타입...
		String s = (String)list.get(4);
		System.out.println("문자열의 길이 : "+s.length());
		
		
		// 정리
		list.clear();
		if(list.isEmpty()) {
			System.out.println("list is Empty!!");
		}
		
		
		

	}

}

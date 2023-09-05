package day14.collection;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map maps = new HashMap();
		
		// 추가
		String s1 = new String("홍길동");
		maps.put("name",s1);
		maps.put("hiredate", new Date());
		maps.put("salary", 20000);
		
		System.out.println(maps);
		
		// 불러오기 (하나씩 불러올 때)
		System.out.println();
		System.out.println(maps.get("hiredate"));
		System.out.println(maps.get("salary"));
		System.out.println(maps.get("name"));
		
		System.out.println();
		//map안에 엘리먼트를 entrySet() 메서드를 이용하여 조회
		Set<Map.Entry<String, Object>> s = maps.entrySet();
//		System.out.println(s);
		for(Map.Entry<String, Object> me : s) {
			System.out.println(me.getKey() + " : "+me.getValue());
		}
		
		System.out.println();
		//keySet() 메서드로 map 키를 리턴받고, get(key) 메서드를 사용하여 조회
		Set<String> ss = maps.keySet();
		for (String key: ss) {
			System.out.println(key + "::"+maps.get(key));
		}
		
		// Iteration : 콜렉션에서 저장되어 있는 엘리먼트를 검색하는 절차
		// Iterator 인터페이스 : 컬렉션에 저장된 엘리먼트를 순차적으로 하나씩 접근하고자 할 때 사용.
		// - Set 계열 : Collection 인터페이스에 정의된 iterator() 메서드를 통해서 Iterator객체를 
		//           반환받아 사용!
		// - List 계열 : listIterator() 메서드를 통해서 ListIterator객체를 반환 받아 사용!!
		// - Iterator 인터페이스의 주요 메서드
		//   > boolean hasNext()
		//   > E next()
		//   > void remove()
		System.out.println("** values를 이용한 value 출력");
		Collection valueList = maps.values();
		Iterator iter = valueList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}

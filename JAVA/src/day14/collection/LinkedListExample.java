package day14.collection;

import java.util.LinkedList;

public class LinkedListExample {

	// - ArrayList는 내부 배열에 객체를 저장하여 인덱스로 관리하지만, LinkedList는 인접 참조를 링크하여
	//   체인처럼 관리합니다. 
	// - LinkedList는 특정 인덱스의 객체를 제거하면 앞 뒤 링크만 변경되고, 나머지 링크는 변경되지 않아
	//   빈번한 객체의 삭제와 삽은 ArrayList보다 좋은 성능을 발휘합니다. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		
		list.add("hello");
		list.add("java");
		list.add("banana");
		list.addFirst("apple");  //head에 값을 추가
		list.addLast("zoo");     //끝에 값을 추가
		
		System.out.println("list data : "+list);
		
		list.remove();   // head 엘리먼트 삭제
		System.out.println("list adata after remove() :" +list);
		
		list.remove(2);	// 2번 인덱스 엘리먼트 삭제
		System.out.println("list data after remove(2) :" +list);
		
		list.set(1, "new elemnet");  //1번 엘리번트 변경
		System.out.println("list data after set() : "+list);
		
		String str1 = list.peek();  //엘리먼트 조회
		String str2 = list.peekLast(); //마지막 엘리먼트 조회
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("list data after peek() : "+list);
		
		String str3 = list.poll(); //엘리먼트 조회 후 삭제
		System.out.println("str3 : "+str3);
		System.out.println("list data after poll() : "+list);
		
		String str4 = list.pop(); //엘리먼트 조회 후 삭제
		System.out.println("str4 : "+str4);
		System.out.println("list data after pop() : "+list);
		
		list.push("push element");  // push시 추가 위치 주의!!
		System.out.println("list data after push() : "+list);
		
		
		
		
		
		

	}

}

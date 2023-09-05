package day14.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		set.add("three");
		set.add("two");
		set.add("four");
		set.add("five");
		set.add(new Integer(4));
		
		Iterator it = set.iterator();  //Set에서 Iterator 객체 생성 메서드.. 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		List list = new ArrayList();
		list.add(1);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(3);
		
		Iterator it2 = list.listIterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		

	}

}

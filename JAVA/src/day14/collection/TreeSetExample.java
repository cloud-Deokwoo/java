package day14.collection;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		
		ts.add("computer");
		ts.add("monitor");
		ts.add("hello");
		ts.add("java");
		ts.add("aaa");
		ts.add("get");
		
		for (String str : ts) {
			System.out.print(str +"\t");
		}
		

	}

}

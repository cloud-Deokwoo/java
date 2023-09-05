package day14.collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(1);
		st.push(2);
		st.add(3);
		st.push(4);
		
		System.out.println(st.toString());
		System.out.println(st.get(0));   	// 1
		System.out.println(st.search(1));   // 4
		System.out.println();
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		

	}

}

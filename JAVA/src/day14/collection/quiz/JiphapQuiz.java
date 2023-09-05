package day14.collection.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JiphapQuiz {
	
	// ArrayList1 : [1,2,3,4,5,6]
	// ArrayList2 : [4,5,6,7,8,9]
	
	// 두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요. 
	// 합집합 : [1,2,3,4,5,6,7,8,9]
	// 교집합 : [4,5,6]
	// 차집합 : [1,2,3],[7,8,9]
	

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i< arr1.length ; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		
		System.out.println("ArrayList1 : "+list1);
		System.out.println("ArrayList2 : "+list2);
		
		ArrayList union = new ArrayList(list1);
//		System.out.println(union);
		for (Object o : list2) {
			if(!union.contains(o))
				union.add(o);
		}
		System.out.println("합집합 : "+union);
		
		ArrayList intersection = new ArrayList();
		for(Object o : list2)
			if(list1.contains(o))
				intersection.add(o);
		System.out.println("교집합 : "+intersection);
		
		ArrayList diff1 = new ArrayList(list1);
		for(Object o : list2)
			if(diff1.contains(o))
				diff1.remove(o);
		System.out.println("차집합 1 : "+ diff1);
		
		ArrayList diff2 = new ArrayList(list2);
		for(Object o : list1)
			if(diff2.contains(o))
				diff2.remove(o);
		System.out.println("차집합 2 : "+ diff2);
		
		ArrayList diff = new ArrayList();
		diff.add(diff1);
		diff.add(diff2);
		System.out.println("차집합 모음 : "+diff);
		
		// addAll : 다른 컬렉션의 모든 요소를 추가함.... 
		ArrayList test = new ArrayList();
		test.addAll(list1);
		test.addAll(list2);
		System.out.println("addAll : "+test);
		test.removeAll(intersection);
		System.out.println("test : "+test);
		
		// removeAll : 다른 컬렉션의 값과 일치하는 모든 요소를 제거함
		ArrayList cha1 = new ArrayList(list1);
		cha1.removeAll(list2);
		System.out.println("차집합1(쉽게) : "+cha1);
		
		ArrayList cha2 = new ArrayList(list2);
		cha2.removeAll(list1);
		System.out.println("차집합2(쉽게) : "+cha2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

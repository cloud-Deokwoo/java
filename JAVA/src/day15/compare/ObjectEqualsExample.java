package day15.compare;

import java.util.HashSet;
import java.util.TreeSet;

public class ObjectEqualsExample {

	public static void main(String[] args) {
		// 객체간 동등 비교... 
		Dog d1 = new Dog("진돗개", "뽀삐", 15);
		Dog d2 = new Dog("말티즈", "삐삐", 5);
		Dog d3 = new Dog("진돗개", "뽀삐", 15);
		
		// Dog d3 = d1;
		System.out.println(d1 == d3);
		System.out.println(d1.equals(d3));
		System.out.println(d1);
		System.out.println(d3);
		
		// HashSet은 동등비교를 통해서 같은 객체인지 아닌지 비교!
		HashSet<Dog> set = new HashSet<>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d3));
		
		// TreeSet 
		TreeSet<Dog> tset = new TreeSet<>();
		System.out.println(tset.add(d1));
		System.out.println(tset.add(d2));
		for(Dog dog : tset) {
			System.out.println(dog);
		}

		
		
	}

}

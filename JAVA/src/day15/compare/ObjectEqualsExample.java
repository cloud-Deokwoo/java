package day15.compare;

import java.util.HashSet;

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
		
		HashSet<Dog> set = new HashSet<Dog>();
		System.out.println(set.add(d1));
		System.out.println(set.add(d3));

	}

}

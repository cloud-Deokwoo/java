package day15.compare;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", 20000);
		Employee e2 = new Employee("김찬중", 30000);
		Employee e3 = new Employee("허길자", 70000);
		Employee e4 = new Employee("이순신", 40000);
		
		// 자동정렬하는 TreeSet, TreeMap에서 정렬할 수 있는 기준을 필요함.
		// => Comparater를 이용한 정렬 => Comparator 클래스 생성!! 이후 적용!!-생성자에 추가
		TreeSet<Employee> list = new TreeSet<>(new EmployeeComparator());
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee s : list) {
			System.out.println(s);
		}

	}

}

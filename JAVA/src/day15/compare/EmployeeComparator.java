package day15.compare;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		// 이름을 비교!!
		return o1.name.compareTo(o2.name);
	}

}

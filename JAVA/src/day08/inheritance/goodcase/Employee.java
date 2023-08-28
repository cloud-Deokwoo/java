package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Employee extends Person {
	
	public String companyId;
	public String department;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "+department;
	}

}

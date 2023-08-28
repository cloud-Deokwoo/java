package day08.inheritance.badcase;

public class Employee {
	
	// 이름, 나이, 사번, 부서
	String name;
	int age;
	String companyId;
	String department;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "+department;
	}
	
}

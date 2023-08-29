package day09.polymorphism;



public class Employee extends Person {
	
	public String companyId;
	public String department;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "+department;
	}

}

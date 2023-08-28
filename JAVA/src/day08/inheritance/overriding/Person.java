package day08.inheritance.overriding;

public class Person {
	//이름과 나이
	protected String name;  //protected는 상속관계에서 접근 O
	protected int age;
		
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
}

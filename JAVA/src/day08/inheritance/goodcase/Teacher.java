package day08.inheritance.goodcase;

import day08.inheritance.Person;

public class Teacher extends Person {

	public String teacherId;
	public String subject;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age+"\t교번: "+teacherId+"\t과목: "+subject;
	}
}

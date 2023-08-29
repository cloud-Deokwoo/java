package day09.polymorphism;



public class Student extends Person {
	
	public String studentId;
	public String major;
	
	public Student() {
		//기본 생성자 , super();
	}
	
	public Student(String name, int age) {
		super(name, age);
	}
	
	public Student(String name, int age, String studentId, String major) {
		this(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	
	@Override
	public String getDetails() {
		return "이름: "+name+"\t나이:"+age+"\t학번: "+studentId+"\t전공: "+major;
	}
	
	public void study() {
		System.out.println(name+"은 공부합니다.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [name="+name+", age="+age+", 학번="+studentId+", 전공="+major+"]";
	}
}

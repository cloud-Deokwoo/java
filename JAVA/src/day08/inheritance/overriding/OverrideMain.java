package day08.inheritance.overriding;

public class OverrideMain {

	public static void main(String[] args) {

		// Person 객체 
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 18;
		System.out.println(p1);
		System.out.println(p1.getDetails());
		
		Student st1 = new Student();
		st1.name = "홍제자";
		st1.age = 14;
		st1.studentId = "first";
		st1.major = "도술";
		System.out.println(st1);
		System.out.println(st1.getDetails());

	}

}

package day09.polymorphism;

public class InstanceofExample {

	public static void main(String[] args) {
		
		Student s = new Student("홍학생",17,"20230001","JAVA");
		printPersonInfo(s);
		
		Teacher t = new Teacher("홍선생",22,"Java Programming");
		printPersonInfo(t);
		
		Employee e = new Employee("홍직원", 23, "교무처");
		printPersonInfo(e);
		
	}
	
	//다형적 인자 별로 출력하는 메서드
	public static void printPersonInfo(Person p) {
		if(p instanceof Student) {
			System.out.println("*************** Student Info *************");
		}else if(p instanceof Teacher) {
			System.out.println("*************** Teacher Info *************");
		}else if(p instanceof Employee) {
			System.out.println("*************** Employee Info ************");
		}else {
			System.out.println("*************** Person Info **************");
		}
		System.out.println(p);
		System.out.println(p.getDetails());
		System.out.println("*******************************************");
	}
	

}

package day09.polymorphism;

public class HeteroCollectionExample {

	public static void main(String[] args) {
		
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍씨", 20);
		pArr[1] = new Student("홍학생", 17, "20230001", "도술");
		pArr[2] = new Teacher("홍선생", 22, "Java Programming");
		pArr[3] = new Employee("홍사원",23,"교무처");
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		
		for(Person p : pArr) {
			System.out.println(p.getDetails());
		}

	}

}

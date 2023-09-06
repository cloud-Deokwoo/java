package day15.generic;

public class PersonExample {

	public static void main(String[] args) {
		Person<Character> p1 = new Person<>('딸', 8);
		System.out.println(p1.getName());

		Person<String> p2 = new Person<>("아빠", 46);
		System.out.println(p2.getName());
	
		
		System.out.println(p1.test(4.8)); 	// 4.8  double
		System.out.println(p1.test("4.8")); //String
		System.out.println(p1.test(5));  	//int
		System.out.println(p1.test('5'));	//char
		
	}

}

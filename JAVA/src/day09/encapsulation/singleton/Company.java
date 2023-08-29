package day09.encapsulation.singleton;

public class Company {
	
	private String str;
	private static Company c = new Company(); 	//1. Company객체 멤버 생성
	
	private Company() {							//2. 생성자를 private으로 설정
		str = "company";
		System.out.println(str);
	}
	
	public static Company getCompany() {		//3. public static을 통해서 객체 전달
		return c;
	}

}

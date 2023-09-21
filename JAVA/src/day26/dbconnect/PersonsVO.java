package day26.dbconnect;

public class PersonsVO {
	// VO클래스 or DTO 클래스
	// VO클래스(Value Object Class) - 객체에 값을 저장하는 형태. DB나 데이터를 저장하는 용도. 
	//                            변수들의 모음 역할!
	// DTO클래스(Data Transfer Object Class) - 데이터 전송 처리를 위한 값을 저장하는 형태의 객체
	
	// 멤버 변수 - 필드, 속성
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String city;
	
	// 기본 생성자
	public PersonsVO() {}

	// 필드 생성자
	public PersonsVO(int id, String firstName, String lastName, int age, String city) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
	}

	// getter, setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "[id : "+id+", lastName : "+lastName+", firstName : "+firstName+
				", age : "+age+", city : "+city+"]";
	}
	
}

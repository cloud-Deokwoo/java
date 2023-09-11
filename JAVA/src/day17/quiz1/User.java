package day17.quiz1;

public class User {
	
	// 멤버변수, 멤버 메서드, 생성자
	private String name;
	private int age;
	
	// 생성자
	public User() {}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[ 이름 : "+name+", 나이 : "+age+"]";
	}
	
	

}

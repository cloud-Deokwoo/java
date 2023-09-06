package day15.generic;

public class Person<E> {    // 제너릭을 이용한 클래스 정의... 
	private E name;
	private int age;
	
	public Person(E name, int age) {
		this.name = name;
		this.age = age;
	}

	// 제너릭 메서드 사용!!!
	
	// 제너릭을 이용한 반환타입 지정 1)
	// 클래스 선언부에서 정의된 유형 매개변수를 사용하는 방법
	public E getName() {   
		return name;
	}

	// 클래스 선언부에서 정의되지 않은 유형 매개변수를 사용하는 방법
	public <T extends Object> T test(T t) { // 제너릭을 이용한 반환타입 지정  2)
		return t;
	}
	
	
	public void setName(E name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	

}

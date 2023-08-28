package day08.quiz;

public class Airplane {
	
	//멤버 변수
	String name;
	
	//생성자
	public Airplane(String name) {
		this.name = name;
	}
	
	//메서드
	void takeOff() {
		System.out.println("비행기가 이륙합니다.");
	}
	
	void fly() {
		System.out.println("일반 모드로 비행합니다.");
	}
	
	void land() {
		System.out.println("비행기가 착륙합니다.");
	}

}

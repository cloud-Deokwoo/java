package day07;

public class ConstructorExample {
	
	// 생성자 (Constructor)
	
	// 객체를 생성하는 new를 통해서 인스턴스를 생성할 때 호출되는 것을 말함. 
	// 클래스 이름과 같은 이름을 지닌 함수
	
	// 생성자 역할은 객체를 생성하여 동작할 때 필요한 모든 작업이 가능
	// 주로, 멤버변수에 대한 초기화 작업을 진행함. 
	// 클래스에 생성자를 정의하지 않은 경우에는 기본 생성자가 호출
	// (기본 생성자란? 호출시 매개변수가 정의되어 있지 않은 생성자)
	// 다른 생성자가 정의되어 있다면 정의된 생성자를 반드시 사용해야 한다. 
	
	

	public static void main(String[] args) {
		// 생성자 테스트
		Car c = new Car();   // 클래스 기본 생성자
		System.out.println(c.wheel);
		c.wheel = "미쉐린";
		System.out.println(c.wheel);
		
		Car c2 = new Car("미쉐린", 6, "BMW", "티코");
		System.out.println(c2.wheel);

	}

}

// JAVA 클래스 규칙
// - public class는 파일 이름과 같아야 한다.
// - public class는 한 파일 내에 한개만 존재할 수 있다.
// - 같은 패키지 내에서는 같은 이름의 클래스를 사용할 수 없다.
// - 다른 패키지에서는 import할 때에 public class에만 접근 할 수 있다. 
// - public class는 파일 이름기기 때문에 그 소스 파일 전체의 주제를 알 수 있는
//   이름을 짓는 것이 좋다. 
// - 클래스 이름은 대문자로 시작하는 것이 좋다. 
class Car{
	// 멤버(속성, 필드)선언
	String wheel;
	int numOfWheel;
	String brand;
	String name;
	
	// 생략되어 있는 기본 생성자
	Car(){
		wheel = "금호";
		numOfWheel = 4;
		brand = "KIA";
		name = "K5";
	}
	
	// 생성자는 새로운 인스턴스를 생성할 때 가장 먼저 호출되기 때문에 값을 초기화하는 용도로 많이 사용된다. 
	Car(String wheel, int numOfWheel, String brand, String name){  //생성자
		//this : 현재 인스턴스를 의미함.
		
		//클래스 변스와 매개변수를 같은 이름으로 사용할 때, 
		//클래스 변수를 지칭하기 위해서 "this" 붙여야 한다. 
		this.wheel = wheel;
		this.numOfWheel = numOfWheel;
		this.brand = brand;
		this.name = name;
	}

}




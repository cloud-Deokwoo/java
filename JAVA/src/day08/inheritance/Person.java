package day08.inheritance;

// 상속(Inheritance)
// - 상속은 기존의 클래스를 확장하여 새로운 클래스를 이끌어 내는 것을 의미함.
// - 기존의 코드를 재사용함으로써 불필요한 코드 재작성을 줄여줌. 
// - 단일 상속만 가능(상속은 하나의 부모 클래스만 가질 수 있음)-> 인터페이스 다중 상속이 가능함.
// - 키워드 extends를 사용하여 상속을 표현
// - 부모(super)클래스의 멤버(변수, 메서드)를 자식(sub)클래스에서 사용이 가능함. 
// - 생성자는 상속이 안됨.
// - Sub Class "is a" Super Class
//   ex) 말 extends 포유류  -> 말 is a 포유류
//    ** has a 관계? 
//        - 객체가 멤버를 가지고 있다. 
//        - class NameCard{
//              String name,
//              int size;
//          } 일 경우, NameCard has a name
// - Object 클래스를 최상위 클래스
// - final 클래스는 상속 불가... 
// - abstract 클래스는 반드시 상속해서 사용해야 함. 

// 상속:  Bad Case와 Good Case
//   bad case
//  - 개별 클래스들이 중복된 속성/기능을 포함하는 경우

//   good case
//  - 중복된 기능을 빼내 새로운 클래스로 작성한 후 구체화 시킴
//  - 일반화 된 클래스는 부모 클래스
//  - 구체화 된 클래스는 자식 클래스 
//  - extends 키워드를 사용!!!

public class Person {
	
	//이름과 나이
	public String name;
	public int age;
	protected float height;
	float weight;
	
	public String getDetails() {
		return "이름: "+name+"\t나이: "+age;
	}
	
	/*
	 * 	this와 super
	 *  - this 
	 *   > this는 현재 객체(자기 자신)
	 *   > this.
	 *     - 변수 또는 메서드를 참조
	 *     - this.name  => 자기 자신의 name 멤버 참조
	 *     - this.go()  => 자기 자신의 go() 메서드 참조
	 *   > this()
	 *     - 자기 자신 클래스 내의 다른 생성자를 참조
	 *     - this();    => 기본 생성자를 불러옴
	 *     - this("hello");  	=> 생성자 호출, 인자 값을 처리하는 생성자
	 *     
	 *  - super
	 *    > super는 현재 객체의 부모 객체, 한단계 위 부모를 의미함.
	 *    > super.
	 *     - 부모의 변수 또는 메서드를 참조
	 *     - super.name
	 *     - super.go()
	 *    > super()
	 *     - 부모의 생성자를 참조
	 *     - super();
	 *     - super(10,20);
	 *     - super("hello"); 
	 */
	
	// 부모인 Person에 생성자 만들기... 
	// 반환값, 이름, 매개변수의 타입(숫서)과 갯수... 
	public Person(int age, String name) {  	// Person(int, String)
		this.name = name;
		this.age = age;
	}
	
	// 매개변수의 타입 다른 순서로 되어 있어도 다른 생성자로 구분!
	public Person(String name, int age) {	// Person(String, int)
		this.name = name;
		this.age = age;
	}

	// 생성자의 첫라인은 반드시 super()또는 this()가 와야 합니다. 
	public Person() {
		this("이름 없음", 1);
	}
	
	public Person(String name) {
		this(name, 1);
	}
	
	public Person(String name, int age, float height) {
		this(name,age);
		this.height = height;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null)? 0:name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {   //동일한 객체
			return true;
		}
		if (obj == null) return false;   // null값 확인
		if (getClass() != obj.getClass()) return false;  //객체 생성 클래스확인
		Person other = (Person)obj;
		if (age != other.age) return false; //객체 내에 age멤버 비교 확인
		if (name == null) {
			if (other.name != null) {
				return false; //객체 내에 이름 확인!
			}
		}else if(!name.equals(other.name)) return false;
		
		return true;
	}
	
	@Override
	public String toString() {
		return "Person [name="+name+", age="+age+"]";
	}
	
}

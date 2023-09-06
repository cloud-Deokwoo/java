package day15.variable_args;

public class VariableLengthExample {

	// JDK 1.5 버전 부터 가능해진 기능
	// 가변인자는 메서드에 들어갈 인자의 수를 미리 정해놓지 않고, 여러개의 인자를 받을 수 있도록 만드는 것!
	// 대표적인 메서드 System.out.printf()가 있습니다. 
	// 가변인자로 받을 수 있는 변수들은 배열을 통해서 전달 됩니다. 
	public static void main(String[] args) {
		log("Hello");
		log("VariableLenthExample","Hello");
		log("a","b","c");
		log();
	}
	
	public static void log(String... msg) {
		System.out.print("로그 : ");
		for (String message: msg) {
			System.out.print(message + ", ");
		}
		System.out.println();
	}
	
	
	
	

}

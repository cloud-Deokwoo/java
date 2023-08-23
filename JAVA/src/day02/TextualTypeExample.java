package day02;

public class TextualTypeExample {

	public static void main(String[] args) {
		char one = 'A';
		char two = '\t';  //탭 간격을 나타내는 문자
		
		/*
		 *  '\n' : 줄바꿈 (New Line(\u000A))
		 *  '\t' : Tab(8자리)(\u0009)
		 *  '\b' : Backspace(\u0008)
		 *  '\r' : Return(\u000D)
		 *  '\f' : Form Feed(\u000C)
		 *  '\\' : Backslash(\u005C)
		 *  '\'' : Single Quote(\u0027)
		 *  '\"' : Double Quote(\u0022)
		 */
		
		
		char three = '\uAC00';  //16진수 4자리 입력 한글 '가'
		String four = "\uD603\uC219";
		String five = "dream";
		System.out.printf("%c, %c, %c,%s,%s",
				one,two,three,four,five);
		
		
		/*
		 * String 클래스를 이용한 변수 선언
		 *  String s1 = "Hello"; //변수 선언 및 할당
		 *  String s2 = new String("Hello"); //객체 생성
		 *  String s3;  // default값은 null
		 *  String s4 = "";  //null String, 길이 0
		 *  String s5 = " "; //blank String, 길이 1
		 *  
		 * 문자열과 다른 타입을 "+"연산하게 되면 무조건 문자열로 변환
		 *  예) 100+200 -> 300, 100+"200" -> 100200
		 *  예2) 10+20+"Hello" -> 30Hello
		 *  예3) "Hello"+10+20 -> Hello1020
		 * 
		 * 
		 */
		
		// char 문자형은 정수 0 ~ 65535의 범위 값을 가짐!!!
//		char t1 = 'A';
		int t2 = 'A'+'A';
		System.out.printf("\nt1에 A의 값 : %d",t2);
		
		
		
	}

}

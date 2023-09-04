package day13.api.java_lang;

public class StringBuilderExample {

	public static void main(String[] args) {
		// StringBuilder
		
		String str = "Hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("StringBuilder에 있는 문자열 : "+sb);
		
		// 1. append
		sb.append(10);
		System.out.println("append(10)의 결과 : "+sb);
		sb.append(true);
		System.out.println("append(true)의 결과 : "+sb);
		
		// 2. insert(idx, 추가할 문자)
		sb.insert(7, "insert합니다.");
		System.out.println("insert 결과 : "+sb);
		
		// 3. delete(시작인덱스, 끝인덱스)
		sb.delete(sb.indexOf("insert"), sb.indexOf("insert")+"insert합니다.".length());
		System.out.println("delete 결과 : "+ sb);
		
		// 4. deleteCharAt() 
		sb.deleteCharAt(12);
		System.out.println("deleteCharAt(12) 결과 : "+sb);
		
		// 5. setCharAt()
		sb.setCharAt(12, '!');
		System.out.println("setCharAt(12, '!') 결과 : "+sb);
		
		// 6. replace()
		sb.replace(12, 14, "! 1");
		System.out.println("replace() 결과 : "+sb);
		
		// 7. reverse()
		sb.reverse();
		System.out.println("reverse() 결과 : "+sb);

	}

}

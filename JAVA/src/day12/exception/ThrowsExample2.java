package day12.exception;

public class ThrowsExample2 {

private static String[] greetings = {"안녕","Hi", "니하오"};
	
	public static void doIt(int index)  {
		try {
			System.out.println(greetings[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스입니다.");
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		
		int i = (int) (Math.random()*4);
		doIt(i);
	}

}

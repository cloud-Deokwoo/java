package day06;

public class PenInstanceExample {

	public static void main(String[] args) {
		// 생성된 Pen클래스의 객체 생성 예
		
		//객체 생성 명령
		// ClassName instanceName = new Constructor();
		Pen redPen = new Pen();
		redPen.color = "red";
		System.out.println(redPen);
		System.out.println(redPen.color);
		//쓰기
		redPen.write();

	}

}

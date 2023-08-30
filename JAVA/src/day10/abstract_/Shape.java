package day10.abstract_;

public abstract class Shape {  //추상 클래스... 
	
	private int x;
	private int y;
	
	public Shape() {}  //기본 생성자
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract double getArea(); // 추상 메서드 - 구현되어 있지 않음.
	
	public String position() {
		return "[x="+x+", y="+y+"]";
	}
	

}

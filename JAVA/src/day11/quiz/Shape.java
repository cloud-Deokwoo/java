package day11.quiz;

public abstract class Shape {
	
	protected int x;
	protected int y;
	
		
	public void showPosition() {
		System.out.println("X 좌표 : "+x+" Y 좌표 : "+y);
	}
	
	public abstract double getArea();
}

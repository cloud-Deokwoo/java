package day11.quiz;

public class Triangle extends Shape {

	private int z;
	
	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
		z = 0;  //기본값은 원점!
	}
	
	@Override
	public double getArea() {
		return (x - z)*(y - z)/2;
	}
}

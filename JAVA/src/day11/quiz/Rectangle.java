package day11.quiz;

public class Rectangle extends Shape {
	
	private int w;
	private int z;
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
		w = 0;
		z = 0;
	}

	@Override
	public double getArea() {
		double result = (x - w)*(y - z); 
		return result;
	}

}

package day10.abstract_;

public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int r) {
		this(0, 0, r);    
	}
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.radius = r;
	}

	@Override
	public double getArea() {
		return (Math.PI * radius * radius);
	}

}

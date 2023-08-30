package day10.interface_;

public class Ractangle implements Shape {
	
	int width;
	int height;
	
	public Ractangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// width * height
		return width * height;
	}

}

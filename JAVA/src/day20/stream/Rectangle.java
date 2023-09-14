package day20.stream;

public class Rectangle extends Shape {
	
	//필드
	int w,h;
	
	//생성자 
	public Rectangle() {
		this(1, 1);
	}
	
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}

	@Override
	public double area() {
		return (w * h);
	}

	@Override
	public double length() {
		return (w + h)* 2;
	}
	
	@Override
	public String toString() {
		return "넓이 : "+this.area()+", 둘레 : "+this.length();
	}

}

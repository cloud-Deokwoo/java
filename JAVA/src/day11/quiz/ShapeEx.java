package day11.quiz;

public class ShapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle(10, 5);
		Rectangle rect = new Rectangle(10, 10);
		System.out.println(tri.getArea());
		System.out.println(rect.getArea());
		tri.showPosition();
		rect.showPosition();
	}

}

package day10.interface_;

public class InterfaceExample {

	public static void main(String[] args) {
		Ractangle rect = new Ractangle(20, 34);
		Triangle tri = new Triangle(20, 34);
		
		Shape s1 = new Ractangle(30, 48);  //다형성
		
		System.out.println("ract's Area = "+rect.getArea());
		System.out.println("tri's Area = "+tri.getArea());
		System.out.println("s1's Area = "+s1.getArea());

	}

}

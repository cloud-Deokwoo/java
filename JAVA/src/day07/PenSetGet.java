package day07;

public class PenSetGet {

	public static void main(String[] args) {
		// Pen 인스턴스 생성
		Pen p1 = new Pen("Black", 20, 2000);
		
		//get
		System.out.printf("%s, %d, %d", p1.getColor(),p1.getLength(),p1.getPrice());
		System.out.printf("%s, %d, %d", p1.color,p1.length,p1.price);
		System.out.println();
		
		//set
		p1.setColor("red");
		p1.setLength(40);
		p1.setPrice(4000);

		System.out.printf("%s, %d, %d", p1.getColor(),p1.getLength(),p1.getPrice());
		System.out.println();


	}

}

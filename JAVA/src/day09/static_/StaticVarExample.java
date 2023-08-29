package day09.static_;

public class StaticVarExample {

	public static void main(String[] args) {
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("Non-static a : "+ c1.a);
		System.out.println("static b : "+c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("Non-static a : "+ c2.a);
		System.out.println("static b : "+c2.b);
		
		Count.b++;
		System.out.println("c1.b : "+c1.b);
		System.out.println("c2.b : "+c2.b);
		System.out.println("Count.b : "+Count.b);

	}

}

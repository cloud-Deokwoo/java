package day02.cal;

public class ToInt {

	public static void main(String[] args) {
		// 반올림(Math.round()), 올림(Math.ceil()),
		// 내림(Math.floor(), 버림(int)
		double a = -3.6;
		double b = -3.4;
		double c = 3.4;
		double d = 3.6;
		System.out.printf("%d %d %d %d",Math.round(a),
				Math.round(b),Math.round(c),Math.round(d));
		System.out.println();
		System.out.printf("%.1f %.1f %.1f %.1f",Math.ceil(a),
				Math.ceil(b),Math.ceil(c),Math.ceil(d));
		System.out.println();
		System.out.printf("%.1f %.1f %.1f %.1f",Math.floor(a),
				Math.floor(b),Math.floor(c),Math.floor(d));
		System.out.println();
		System.out.printf("%d %d %d %d",(int)(a),
				(int)(b),(int)(c),(int)(d));
	}

}

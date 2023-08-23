package day02.cal;

public class BitShiftExample {

	public static void main(String[] args) {
		// 비트 이동 연산자 : <<, >>, >>>
		int a = 192; // 0b ... 1100_0000
		System.out.println("a(192)\t"+toBinaryString(a)+"\t"+a);

		//쉬프트 연산
		int a1 = a << 3;
		System.out.println("a<<3\t"+toBinaryString(a1)+"\t"+a1);
		
		int a2 = a >> 3;
		System.out.println("a>>3\t"+toBinaryString(a2)+"\t"+a2);
		
		a = -192;
		System.out.println("a(-192)\t"+toBinaryString(a)+"\t"+a);
		
		int a3 = a << 3;
		System.out.println("a<<3\t"+toBinaryString(a3)+"\t"+a3);
		
		int a4 = a >> 3;
		System.out.println("a>>3\t"+toBinaryString(a4)+"\t"+a4);
		
		int a5 = a >>> 3;
		int a6 = a >>> 35;
		System.out.println("a>>>3\t"+toBinaryString(a5)+"\t"+a5);
		System.out.println("a>>>35\t"+toBinaryString(a6)+"\t"+a6);
		
	}
	
	private static String toBinaryString(int num) {
		String a = Long.toBinaryString(num | 0xFFFFFFFF00000000L);
		return a.substring(32);
	}

}

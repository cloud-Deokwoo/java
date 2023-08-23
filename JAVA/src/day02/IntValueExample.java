package day02;

public class IntValueExample {

	public static void main(String[] args) {
		
		int decimalValue = 7;			//7
		int binValue = 0b1000_0101;		//133
		int octalValue = 077;			//63
		int hexaValue = 0xFEFE;			//65278
		
		System.out.println("10진수 7은 : "+decimalValue);
		System.out.println("2진수 10000101은 : "+binValue);
		System.out.println("8진수 77은 : "+octalValue);
		System.out.println("16진수 FEFE은 : "+hexaValue);

	}

}

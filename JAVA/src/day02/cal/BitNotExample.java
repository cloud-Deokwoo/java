package day02.cal;

public class BitNotExample {

	public static void main(String[] args) {
		// ~ : 2진수 각 비의 0,1을 반전. 0->1, 1->0
		byte binData = 0b0000_1000;  //10진수 8
		System.out.println(binData);	// 8
		System.out.println(~binData);	// 0b1111_0111;
		System.out.println((byte)0b1111_0111);
		// ! : 논리값 (true, false)을 반전. true->false, false->true
		boolean isTrue = false;
		System.out.println(!isTrue);
		

	}

}

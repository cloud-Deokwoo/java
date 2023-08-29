package day09.encapsulation.goodcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
//		myBirth.day = 32;  // 접근제한자 : private
		myBirth.setDay(32);
		System.out.println("My birth day is "+myBirth.getDay());

	}

}

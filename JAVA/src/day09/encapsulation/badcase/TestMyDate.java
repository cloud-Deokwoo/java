package day09.encapsulation.badcase;

public class TestMyDate {

	public static void main(String[] args) {
		MyDate myBirth = new MyDate();
		myBirth.day = 32;
		System.out.println("My birth day is "+myBirth.day);

	}

}

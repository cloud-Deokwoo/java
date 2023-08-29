package day09.final_;

public class FinalRefVarExample {

	static final MyDate date = new MyDate();
	
	public static void main(String[] args) {
//		date = new MyDate(); //새로운 객체로 변경X
		date.year = 2024;
		System.out.println(date.toString());

	}

}

class MyDate {
	int year = 2023;
	int month = 1;
	int day = 1;
	
	public String toString() {
		return "["+year+"-"+month+"-"+day+"]";
	}
	
	public void doIt(final int a) {
//		a++; // Error
	}
}



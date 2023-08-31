package day11.innerclass;

public class StaticInnerClassExample {

	public static void main(String[] args) {
		// static이 있는 것과 없는 것 접근 방식
		
		// static이 있는 경우... 
		University.Student us = new University.Student();
		
		// static이 없는 경우... 
//		HighSchool.Student high = new HighSchool.Student();
		HighSchool high = new HighSchool();  //외부 객체 생성
		HighSchool.Student hs = high.new Student(); // 내부 객체 생성.

	}

}

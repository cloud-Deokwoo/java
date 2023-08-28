package day08.quiz;

public class QuizMain {

	public static void main(String[] args) {
		// 비행기 SuperSonicAp
		SuperSonicAp s1 = new SuperSonicAp("콩코드");
		s1.takeOff();
		s1.fly();
		s1.flyMode=1;
		s1.fly();
		s1.flyMode=0;
		s1.fly();
		
		s1.land();

	}

}

package day11.quiz;

public class GoldFish extends MarinAnimal implements Animal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("금붕어는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("금붕어는 플랑크톤을 먹습니다.");
	}

}

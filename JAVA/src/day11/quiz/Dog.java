package day11.quiz;

public class Dog extends LandAnimal implements Animal {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("개는 잠을 잡니다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개는 사료를 먹습니다.");
	}

}

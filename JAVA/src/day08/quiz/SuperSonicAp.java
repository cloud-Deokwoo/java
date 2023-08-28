package day08.quiz;

public class SuperSonicAp extends Airplane {

	/*
	 *  1. Airplane을 상속 받습니다. 생성자는 이름을 받아서 초기화
	 *  2. flyMode는 int형 변수로 선언합니다.
	 *  3. fly() 메서드를 오버라이딩 합니다.
	 *     fly() 메서드 안에서는 flyMode가 1이면 "고속 모드로 비행합니다." 출력
	 *     	flyMode가 0이라면, super를 통해 부모님의 메서드를 호출
	 */

	
	int flyMode;
	
	
	public SuperSonicAp(String name) {
		super(name);
	}
	
	@Override
	void fly() {
		if(flyMode == 0) {
			super.fly();
		}else if(flyMode == 1) {
			System.out.println("고속 모드로 비행합니다.");
		}
	}
	
	
	

}

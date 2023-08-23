package day03;

public class SwitchExample {

	public static void main(String[] args) {
		// switch(수식) ~ case 구문
		int jumsu = (int)(Math.random() * 100);
		System.out.println("점수 : "+jumsu);
		
		//switch
		switch (jumsu / 10) {
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break; //switch case 구문에 나가야 함. 
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자 입니다.");
			break;
		}
		
		

	}

}

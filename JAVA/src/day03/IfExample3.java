package day03;

public class IfExample3 {

	public static void main(String[] args) {
		// 다중 if문 : if(조건식) ~ else if(조건식) ~ else
		int jumsu = (int)(Math.random() * 100);
		
		System.out.println("점수 : "+jumsu);
		
		if(jumsu >= 90) {
			System.out.println("당신의 학점은 A입니다.");
		}else if(jumsu >= 80) {
			System.out.println("당신의 학점은 B입니다.");
		}else if(jumsu >= 70) {
			System.out.println("당신의 학점은 C입니다.");
		}else if(jumsu >= 60) {
			System.out.println("당신의 학점은 D입니다.");
		}else {
			System.out.println("당신의 학점은 F입니다.");
			System.out.println("당신은 재수강 대상자입니다.");
		}
		 

	}

}

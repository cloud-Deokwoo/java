package day02.cal;

public class ConditionalExample {

	public static void main(String[] args) {
		// 3항 연산자 : (조건식 ? 연산식1 : 연산식2)
		//  조건식이 참이면 연산식1을 실행, 거짓이면 연산식 2를 실행
		
		int a = 5 - (int)(Math.random()*10);
		// 메인 메서드 값을 넘겼는지 확인 후 a에 대입하는 구간
		if(args.length > 0) {
			a = Integer.parseInt(args[0]);
		}
		
		int abs = (a >= 0) ? a : -a;  //3항 연산... 
		System.out.println(a +"의 절대값은 : "+abs);

	}

}

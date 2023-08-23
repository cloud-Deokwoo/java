package day04.quiz;

public class whileQuiz {

	// while 문을 이용하여 
	// 구구단을 다음과 같이 세로로 출력합니다. 
			
	// 2단 		3단		4단 		...
	// 2x1=2	3x1=3	4x1=4	...
	// 2x2=4	3x2=6	4x2=8	...
	// 2x3=6	3x3=9	4x3=12	...
	// ...		...		...
	
	public static void main(String[] args) {
		
		int gop = 0;
		while(gop <= 9) {
			
			int dan = 2;  // 다음 반복시에 원래 2로 돌아와야 합니다.!!! 
			
			while(dan <= 9) {
				if(gop == 0) {
					System.out.print(dan + "단\t");
				}else {
					System.out.printf("%dx%d=%d\t", dan,gop, dan*gop);
				}
				dan ++;	
			}
			System.out.println();
			gop++;		
		}
	}
}

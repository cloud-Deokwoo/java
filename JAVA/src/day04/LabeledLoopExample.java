package day04;

public class LabeledLoopExample {

	public static void main(String[] args) {
		// labeled Loop
		outer : for (int i=0; i< 3; i++) {		//0 1 2
			for (int j=0; j<3;j++) {  	//0 1 2
				if(j==2) {
					break outer;  // 레이블이 outer인 반복문 종료
//					continue outer; // 레이블이 outer인 반복문의 다음회차로 진행
				}
				System.out.println(i + "\t"+ j);
			}
		}

	}

}

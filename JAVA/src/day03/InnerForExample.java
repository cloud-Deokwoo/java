package day03;

public class InnerForExample {

	public static void main(String[] args) {
		// 이중(다중) For구문
		for (int i = 0; i < 10; i++) {
			System.out.println("=================바깥쪽 반복문 " + i);
			
			for (int j = 0; j < 10; j++) {
				System.out.println("-------------안쪽 반복문 "+ i+"-"+ j);
				
				for (int k = 0; k < 2; k++) {
					System.out.println("+++ 제일 안쪽 반복문"+i+"-"+j+"-"+k);
				}
			}
		}
		
		// 예제1) 구구단 출력하기 
		// 2단 - 9단까지, 각 단마다 x1 - x9까지 
		for (int x=2; x < 10;x++) {
			System.out.println(x +"단 출력");
			for(int y=1; y < 10;y++) {
				System.out.println(x+"x"+y+"="+(x*y));
			}
			System.out.println(); //줄바꿈
		}
		
		
		
		

	}

}

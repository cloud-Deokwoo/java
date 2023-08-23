package day04.quiz;

public class ForStartExample {

	public static void main(String[] args) {
		/*
		 	* 		*****	    *	*****	
		 	**		****	   ** 	 ****
		 	***		***	  	  ***  	  ***
		 	****	**	 	 ****	   **
		 	*****	*		*****	    *
		 */
		int dan = 5;
		
		//4번
		for (int i=0;i<dan;i++) {     // 0 1 2 3 4
			for (int j = 0; j < i ; j++) {  //  i= 0
				System.out.print(" ");
			}
			for (int j = 0; j <dan-i ;j++) {  	// 5 4 3 2 1   dan - i
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3번
//		for (int i=0; i < dan; i++) {
//			// 공백 찍기
//			for (int j = 0; j < dan-i-1;j++) {  // dan -i -1 => 4,3,2,1
//				System.out.print(" ");
//			}
//			for (int j = 0; j < i + 1; j++) {  //  i+1 => 1,2,3,4,5
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//2번
//		for (int i = 0; i < dan ; i++) {  		// 0 1 2 3 4   i
//			for (int j = 0; j <dan-i ;j++) {  	// 5 4 3 2 1   dan - i
//				System.out.print("*");
//			}
//			// for (int j = dan; j > 0; j --)   // 5 4 3 2 1
//			System.out.println();
//		}
		
		//1번
//		for (int i = 0; i < dan;i++) {
//			for (int j=0; j <i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();  //줄바꿈
//		}
		
		

	}

}

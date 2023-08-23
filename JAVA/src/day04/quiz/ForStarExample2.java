package day04.quiz;

public class ForStarExample2 {

	public static void main(String[] args) {
		// 피라미드 찍기
		/*
		 	     *			*********
		        ***			 *******
		       *****		  *****
		      *******		   ***
		     *********		    *
		 */
		
		int dan = 5;
		
		//2번
		for(int i=0;i<dan;i++) {
			//공백
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//별
			for(int j=0;j<2*dan-(2*i)-1;j++) { // 9 7 5 3 1
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		//1번
//		for (int i=0;i<dan;i++) {
//			for(int j=0;j<dan-i-1;j++) {
//				System.out.print(" ");
//			}
//			for(int j=0;j <i*2+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		

	}

}

package day05;

import java.util.Arrays;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 다차원 배원
		// 1차원 배열 : int를 요소로 가지고 있는 배열
		int[] number = { 1, 2, 3, 4, 5 };
		
		// 배열의 요소는 length - 1 번 방(저장공간)까지 있음.
		System.out.println(number[number.length -1]);
		
		// 2차원 배열 : int[]을 요소로 가지고 있는 배열
		int[][] arr2 = {
				{3,3,3},
				{4,4,4},
				{5,5,5}, 
				number   //1 차원 배열
		};
		
		System.out.println("1 : "+ arr2[1][2]);
		System.out.println("2 : "+ arr2[2][1]);
		System.out.println("3 : "+ arr2[3][arr2[3].length -1]);
		System.out.println("int[]의 갯수 : "+arr2.length);

		//3차원 배열 : int[][]을 요소로 가지고 있는 배열
		//int[][][] arr3 = {arr2, arr2, arr2, arr2}
		int[][][] arr3 = new int[4][][];
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2;
		
		//4차원 배열 : int[][][]을 요소로 가지고 있는 배열
		int[][][][] arr4 = {arr3, arr3, arr3, arr3};
		
		//n차원 배열 : 배열의 요소로 (n-1)차원 배열을 가지고 있는 배열
		
		//n차원 배열의 모든 요소를 n중반복문을 사용하여 탐색할 수 있음.
		//arr2의 요소들의 값을 알아오는 반복문 작성... 
		for (int i = 0;i <arr2.length; i++) {
			for(int j=0;j <arr2[i].length;j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		//arr3의 요소 값을 알아와서 출력하는 반복문 작성
		for (int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.print("[");
				for(int k=0;k<arr3[i][j].length;k++) {
					System.out.print(arr3[i][j][k]);
				}
				System.out.print("], ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}

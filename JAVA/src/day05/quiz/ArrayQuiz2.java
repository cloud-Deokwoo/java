package day05.quiz;

public class ArrayQuiz2 {

	public static void main(String[] args) {
		// numArr의 값들의 총합과 평균을 구해서 출력하세요.
		int[][] numArr = {
				{5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20},
				{30,30,30}
		};
		
		int sum = 0;
		int items = 0;  //전체 요소의 갯수
		for (int i=0;i<numArr.length;i++) {
			items += numArr[i].length;
			for(int j=0;j<numArr[i].length;j++) {
				sum += numArr[i][j];
			}
		}
		
		System.out.println("총 합 : " + sum);
		System.out.println("평 균 : " + sum/(double)items);

	}

}

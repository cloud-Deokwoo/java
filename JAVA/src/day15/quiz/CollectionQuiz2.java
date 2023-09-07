package day15.quiz;

import java.util.PriorityQueue;

public class CollectionQuiz2 {

	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12 };
		int K = 7;
		System.out.println("음식을 최소 몇번 섞었을 원하는 맵기가 될까?" + solution(scoville, K));

	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;   //시도 횟수
		
		//scoville 값을 저장 : 음식 
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i : scoville) {
			que.add(i);
		}
		
		while(true) {
			answer++;
			int result = que.poll() + (que.poll() * 2);
			que.add(result);
			// 정해진 맵기 K값을 넘어서는 섞은 음식인 경우. 그 회차를 반환
			if(que.peek() >= K)
				return answer;
			// K 이상으로 만들 수 없는 경우 반환 값은 -1
			if(que.size()==1)
				return -1;
		}
	}

}

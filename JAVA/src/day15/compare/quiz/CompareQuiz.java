package day15.compare.quiz;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareQuiz {

	public static void main(String[] args) {
		// memNum을 기준으로 출력
		TreeSet<GymMember> gym = new TreeSet<>();
		gym.add(new GymMember("박지성", 1000));
		gym.add(new GymMember("김연아", 1001));
		gym.add(new GymMember("싸이", 1002));
		gym.add(new GymMember("봉준호", 1003));
		gym.add(new GymMember("조현우", 1004));
		gym.add(new GymMember("BTS", 1005));
		gym.add(new GymMember("박찬호", 1006));
		
		System.out.println(gym);
		System.out.println("=======================================================");
		TreeSet<GymMember> gym2 = new TreeSet<GymMember>(new Comparator<GymMember>() {
			@Override
			public int compare(GymMember o1, GymMember o2) {
				// ## compare 메서드 사용법
				// - o1과 o2의 자리를 바꾸고 싶은 경우 1을 리턴
				// - o1과 o2의 자리를 그대로 유지하고 싶은 경우 -1을 리턴
				// - o1과 o2의 값이 같은 경우 0을 리턴
				if(o1.name.charAt(0) < o2.name.charAt(0)) {
					return -1;
				}else if(o1.name.charAt(0) > o2.name.charAt(0)) {
					return 1;
				}else {
					return 0;
				}
				
			}
		});
		
		gym2.add(new GymMember("박지성", 1000));
		gym2.add(new GymMember("김연아", 1001));
		gym2.add(new GymMember("싸이", 1002));
		gym2.add(new GymMember("봉준호", 1003));
		gym2.add(new GymMember("조현우", 1004));
		gym2.add(new GymMember("BTS", 1005));
		gym2.add(new GymMember("박찬호", 1006));
		System.out.println(gym2);

	}

}

class GymMember implements Comparable<GymMember> {
	
	//멤버 변수
	String name;
	double height;
	double weight;
	int age;
	int memNum;
	
	
	public GymMember(String name, int memNum) {
		super();
		this.name = name;
		this.memNum = memNum;
	}

	@Override
	public int compareTo(GymMember o) {
		// CompareTo() 메서드 사용법 (매개변수로 비교 대상은 전달)
		// - 현재 인스턴스와 o의 자리를 바꾸고 싶은 경우 1
		// - 현재 인스턴스와 o의 자리를 그대로 유지하고 싶다면 -1
		// - 현재 인스턴스와 o의 값이 같은 경우 0
		int next = o.memNum;
		System.out.println(memNum + " vs "+next);
		if(memNum < next) {
			return -1;
		}else if (memNum > next) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return String.format("%s [%d]", name, memNum);
	}
	
	
	
}

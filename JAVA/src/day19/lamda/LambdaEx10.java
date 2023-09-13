package day19.lamda;

import java.util.function.Predicate;

public class LambdaEx10 {
	
	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "컴공")
	};

	public static void main(String[] args) {
		//Predictcate : 매개변수 O, 반환 타입이 boolean 인 경우
		
		//과가 컴공인 학생의 영어 점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어점수 : "+avg);
		
		double avg2 = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 수학점수 : "+avg2);

	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			//equals 비교
			if(predicate.test(student)) {
				count ++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count =0;
		int sum = 0;
		for (Student s:list) {
			if(predicate.test(s)) {
				count++;
				sum += s.getMath();
			}
		}
		return (double)sum/count;
	}

}

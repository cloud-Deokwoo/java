package day19.lamda;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

public class LambdaEx9 {

	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "빅데이터")
	};
	
	public static void main(String[] args) {
		// Operator 인터페이스는 Function하위 인터페이스
		System.out.print("최대 수학 점수 : ");
		int max = maxOrMinMath((a, b) -> {
			if (a >= b) return a;
			else return b;
		});
		System.out.println(max);
		System.out.print("최소 수학 점수 : ");
		int min = maxOrMinMath((a, b) -> (a<=b?a:b));
		System.out.println(min);
		
		System.out.println("최대 평균 점수 : ");
		System.out.println(maxOrMinAvg((a,b) -> (a>=b?a:b)));

		System.out.println("최소 평균 점수 : ");
		System.out.println(maxOrMinAvg((a,b) -> (a<=b?a:b)));
	}
	static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getMath() + list[0].getEng()) / 2.0;
		for (Student s : list) {
			result = op.applyAsDouble(result, (s.getMath()+s.getEng())/2.0);
		}
		return result;
	}
	
	static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result;
	}

}

package day13.api.java_util;

import java.util.Arrays;

public class ArraysExample1 {

	public static void main(String[] args) {
		// 배열의 복사
		double[] argOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println("원본 배열");
		for(double d : argOrg) {
			System.out.print(d + "\t");
		}
		System.out.println();
		// 배열의 전체 복사
		double[] argCpy1 = Arrays.copyOf(argOrg, argOrg.length);
		System.out.println("전체 배열 복사");
		for(double d : argCpy1) {
			System.out.print(d + "\t");
		}
		System.out.println();
		// 처음부터 세번째 요소까지 복사
		double[] arrCpy2 = Arrays.copyOf(argOrg, 3);
		System.out.println("처음부터 세번째 요소까지 배열 복사");
		for(double d : arrCpy2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		// 1번 인덱스에서 3인덱스까지 복사(특정 범위 내 부분복사)
		double[] arrCpy3 = Arrays.copyOfRange(argOrg, 1, 4);
		System.out.println("1번 인덱스에서 3번인덱스(포함)까지 배열 복사");
		for(double d : arrCpy3) {
			System.out.print(d + "\t");
		}
		System.out.println();
	}

}

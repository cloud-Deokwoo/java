package day09.encapsulation;

import day09.encapsulation.singleton.Company;

/*
 * 	Singleton Design Pattern
 *  
 *  private 제한자와 static 제한자를 사용하여 클래스의 인스턴스 갯수를 제한하는 프로그래밍 방법
 *  
 */

public class SingletonExample {

	public static void main(String[] args) {
		//싱글톤은  new를 사용하지 않아요!! 메서드를 이용해서 객체 생성
		Company c1 = Company.getCompany();
		Company c2 = Company.getCompany();
		
		System.out.println(c1);
		System.out.println(c1 == c2);
		System.out.println(c2);

	}

}

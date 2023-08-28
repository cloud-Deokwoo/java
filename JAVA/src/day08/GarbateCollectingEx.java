package day08;

import day07.Pen;

public class GarbateCollectingEx {
	
	// Garbage Collecting
	// - 객체를 생성하는 사용되는 키워드 new이지만, 생성된 객체를 메모리에서 해제시키는 키워드는
	//  존재하지 않습니다. 
	// - 없는 이유는 자바에서 자바 가상머신(JVM)이 알아서 메모리를 관리해주며, 이것을 가비지 컬렉팅이라고 함.
	// - 객체가 더 이상 프로그램에서 사용되지 않으면 가비지 컬렉터가 스스로 판단해서 메모리를 해제하여 수거
	
	public static void main(String[] args) {
		
		Pen p;
		for (int i = 0; i<= 100000000;i++) {			
			p = new Pen();
		}

	}

}

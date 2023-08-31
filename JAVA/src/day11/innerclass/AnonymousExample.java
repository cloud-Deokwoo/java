package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonymousExample {
	
	private Frame f;
	
	public AnonymousExample() {
		f = new Frame("Anonymous Class");
	}

	public void launchFrame() { 
		//익명 클래스 사용!!! - 익명 클래스는 이름이 없기 때문에 생성자도 가지 않고, 호출 및 상속을 할 수 없음
		// 생성자를 가지않고 인스턴스를 만들어야 하기 때문에 이미 만들어진 인터페이스나 클래스를 상속 또는 구현
		// 해서 만들어야 합니다. 내부 클래스와 달리 호출도 필요없는, 여러번이 아닌 한 번만 사용할 클래스에 
		// 주로 사용됩니다. 또는 클래스 내에 메서드를 재정의 하기 용이해 함수형 프로그램과 비슷하게 활용할 수 
		// 있습니다. 인터페이스와 익명 클래스를 같이 사용한다면 여러 상황에서 쓰일 수 있는 유틸리티 클래스를
		// 만들 수 있음. 
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("종료 버튼을 눌렀어요!");
				System.exit(0);
			}
		});
		f.setSize(300, 200);
		f.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		AnonymousExample ae = new AnonymousExample();
		ae.launchFrame();

	}

}

package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerLocalExample {
	
	private Frame f;
	
	public InnerLocalExample() {
		f = new Frame("Inner Local Class");
	}
	
	public void launchFrame() {
		// Inner Local Class  : 완전한 클래스 형태이기 때문에 클래스와 같은 기능을 함. 
		//  로컬 이너 클래스는 외부에 있는 클래스의 모든 멤버에 대해서 참조 가능함. 
		//  다만, 지역변수를 참조할 때는 지역변수가 Final로 선언되어야 함. 
		final String btn = "X버튼";
		class MyWindowAdapter extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println(btn +" 클릭했습니다.!!!!");
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 200);
		f.setVisible(true);
	}
	

	public static void main(String[] args) {
		InnerLocalExample le = new InnerLocalExample();
		le.launchFrame();

	}

}

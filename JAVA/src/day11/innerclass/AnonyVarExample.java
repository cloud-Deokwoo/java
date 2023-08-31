package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.logging.Handler;

public class AnonyVarExample {
	
	private Frame f;
	
	public AnonyVarExample() {
		this.f = new Frame("AnonymousVar Class");
	}

	WindowAdapter handler = new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료!!!");
			System.exit(0);
		}
	};
	
	public void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(300, 200);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnonyVarExample ave = new AnonyVarExample();
		ave.launchFrame();
	}

}

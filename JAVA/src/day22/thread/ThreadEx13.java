package day22.thread;

public class ThreadEx13 {

	public static void main(String[] args) {
		
		// 그룹 객체 생성(Thread 그룹 객체)
		ThreadGroup group = new ThreadGroup("Group1");
		MyThread t1 = new MyThread(group, "First");
		MyThread t2 = new MyThread(group, "Second");
		MyThread t3 = new MyThread(group, "Third");
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {}
		
		// 모든 스레드 중지
		group.interrupt();

	}

}

class MyThread extends Thread {
	public MyThread(ThreadGroup group, String name) {
		super(group, name);
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println(getName());
			try {
				sleep(500);
			} catch (InterruptedException e) {
				System.out.println(getName() + " interrupted 발생");	
				break;
			}
		}
		System.out.println(getName()+" 종료");
	
	}
}




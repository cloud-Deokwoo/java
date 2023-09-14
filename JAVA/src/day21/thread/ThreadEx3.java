package day21.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(() -> {
			System.out.println("t1 스레드 시작");
			for(int i=0; i<50 ;i++) {
				System.out.println("t1 : "+i);
			}
		});
		
		Thread t2 = new Thread(() -> {
			System.out.println("t2 스레드 시작");
			for(int i=0; i<50 ;i++) {
				System.out.println("t2 : "+i);
			}
		});
		t1.start();
		t2.start();

	}

}

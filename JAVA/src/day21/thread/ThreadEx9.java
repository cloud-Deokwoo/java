package day21.thread;

public class ThreadEx9 {

	public static void main(String[] args) {
		// yield() 메서드 : 동일한 우선순위를 가진 다른 스레드에게 실행 양보.
		YieldThread t1 = new YieldThread();
		YieldThread t2 = new YieldThread();
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		t1.isContinue = false; // t1 양보
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		t1.isContinue = true; // t1 다시 실행
		
		// 스레드 종료
		t1.isBreak = true;
		t2.isBreak = true;
	}

}

class YieldThread extends Thread {
	boolean isBreak = false;
	boolean isContinue = true;
	
	@Override
	public void run() {
		while(!isBreak) {
			if(isContinue) {
				try {
					Thread.sleep(100);
					System.out.println(getName()+" 실행 중");
				} catch (Exception e) {}
				
			}else {
				Thread.yield();
			}
		}
		System.out.println(getName()+" 종료");
	}
	
}

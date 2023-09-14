package day21.thread;

public class ThreadEx6 {

	public static void main(String[] args) {
		// interrupt() 메서드 : 
		//    스레드가 일시 정지 상태에 있을 때, InterruptException 예외발생시켜 정상 종료
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int i=1;
					while(true) {
						System.out.println("t1 : "+i);
						Thread.sleep(1000);
						i++;
					}
				}catch (InterruptedException e) {
					System.out.println("스레드 내에서.. 일시정지.."+e.getMessage());
				}
				System.out.println("스레드 실행 종료");
			}
		});
		
		t1.start();
		try {
			Thread.sleep(10000);  // 10s
		} catch (InterruptedException e) {
			System.out.println("메인에서 일시정지 : "+e.getMessage());
		}
		t1.interrupt();  //일시정지 상태 일때 interruptedException 정상 종료
		
	}

}

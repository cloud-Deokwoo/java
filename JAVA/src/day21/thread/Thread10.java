package day21.thread;

public class Thread10 {

	public static void main(String[] args) {
		// Synchronized : 동기화 -> 여러 스레드가 동일한 자원에 접근하여 사용하는 경우에 
		//            서로 영향을 줄 수 있는 상황이 된다. 때문에 동기화를 통해서 사용하는 자원에 접근을
		//            제한하여 작업이 종료되기 전에 접근할 수 없게 하는 것!
		
		
		// 게임 객체 생성
		SmartPhoneGame game = new SmartPhoneGame();
		
		//플레이어1 객체 생성 후 스레드 실행
		Player1 p1 = new Player1();
		p1.setSmartPhoneGame(game);
		p1.start();
		
		//플레이어2 객체 생성 후 스레드 실행
		Player2 p2 = new Player2();
		p2.setSmartPhoneGame(game);
		p2.start();
		
	}

}


//스마트 폰 게임 클래스
class SmartPhoneGame {
	
	private int level; //레벨
	
	public int getLevel() {
		return this.level;
	}
	
//	public synchronized void increaseLevel() {  // 메서드에 동기화 설정!
	public void increaseLevel() {
		synchronized (this) {					// synchronized 블럭설정!! 시작
			while(true) {
				this.level ++;  //레벨 1씩 증가
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				
				//현재 스레드의 이름과 레벨 출력
				System.out.println(Thread.currentThread().getName()+" Level : "+this.level);
				
				// 레벨이 10의 배수가 되면 종료
				if(this.level == 5) {
					notifyAll();  // 현재 대기 상태인 모든 스레드를 실행 중 상태로 전환
					//notify() : 현재 대기 상태인 스레드들 중 하나만 실행 중으로 상태 전환(직접 지정 불가)
					try {
						wait();   // 현재 실행 중인 스레드를 대기 상태로 전환
					}catch (InterruptedException e) {}
					break;
				}
				
				// 레벨이 10의 배수가 되면 종료
				if(this.level % 10 == 0) break;
			}
		}										// 동기화 블럭 끝
		
	}
}

//플레이어1 스레드
class Player1 extends Thread {
	private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player1");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}

//플레이어2 스레드
class Player2 extends Thread {
private SmartPhoneGame game;
	
	public void setSmartPhoneGame(SmartPhoneGame game) {
		this.setName("Player2");
		this.game = game;
	}
	
	@Override
	public void run() {
		game.increaseLevel();
	}
}







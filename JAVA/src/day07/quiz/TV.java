package day07.quiz;

public class TV {
	//TV 클래스의 멤버변수 (각 TV의 상태를 나타내는 변수)
	// - 채널(channel)
	// - 이전채널(prevChannel)
	// - 볼륨(volumn)
	// - 전원(isPowerOn)
	//  각 인스턴스(각 개체)마다 다를 수 있는 값을 클래스의 변수(멤버변수)로 사용한다.
	int channel;
	int prevChannel;
	int volume;
	boolean isPowerOn;
	
	// TV 클래스의 상수(final)
	//   - 최대 볼륨(MAX_VOLUME)
	//   - 최소 볼륨(MIN_VOLUME)
	//   - 최대 채널(MAX_CHANNEL)
	//   - 최소 채널(MIN_CHANNEL)
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;

	// 기본생성자 : 채널 7, 볼륨 20을 생성
	public TV() {
		channel = 7;
		volume = 20;
	}
	
	//TV기능 
	// -isPowerOn 값이 true면 false, false면 true 변경
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	// # 다음의 모든 기능은 isPowerOn이 true일 때만 올바르게 동작함.
	//	- volume의 값을 1증가시킴, 최대볼륨 100	(volumeUp) 
	//	- volume의 값을 1감소시킴, 최소볼륨 0		(volumeDown)
	//	- channel의 값을 1증가시킴, 최대채널 300	(channelUp)	
	//	- channel의 값을 1감소시킴, 최소채널 1 	(channelDown)
	//	- 채널 번호를 매개변수로 전달받으면 채널을 이동함 (moveChannel)
	//	- 이전 채널로 돌아감 (prevChannel)
	void volumeUp() {
		//if문에 boolean 타입 변수를 활용하여 코드 간결하게 사용!
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;    //리턴을 만나면 그 메서드를 종료!!
		}else if(volume == MAX_VOLUME) {
			System.out.println("현재 볼륨이 최대입니다.");
			return;
		}
		
		volume++;
		System.out.println("현재 볼륨은  "+ volume + "입니다.");
	}
	
	void volumeDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;    //리턴을 만나면 그 메서드를 종료!!
		}else if(volume == MIN_VOLUME) {
			System.out.println("현재 볼륨이 0입니다.");
			return;
		}
		
		volume--;
		System.out.println("현재 볼륨은  "+ volume + "입니다.");
		
	}
	
	void  channelUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;    //리턴을 만나면 그 메서드를 종료!!
		}
		
		//이전 채널
		prevChannel = channel;
		
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel++;
		}
		
		System.out.println(channel + "CH");
	}
	
	void channelDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;    //리턴을 만나면 그 메서드를 종료!!
		}
		
		//이전 채널
		prevChannel = channel;
		
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel--;
		}
		
		System.out.println(channel + "CH");
	}
	
	boolean moveChannel(int ch) {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		
		if(ch >= MIN_CHANNEL && ch <= MAX_CHANNEL) {
			prevChannel = channel;
			channel = ch;
			System.out.println(ch + "CH");
			return true;
		}else {
			System.out.println("이상한 채털을 입려하셨습니다");
			return false;
		}
		
	}
	
	void prevChannel() {
		// channel = prevChannel;
		// prevChannel = channel;
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}else if(prevChannel == 0) {
			System.out.println("이전채널 없음");
			return;
		}
		
		int temp = channel;
		channel = prevChannel;
		prevChannel= temp;
		
		getTvInfo();
		
	}
	
	void getTvInfo() {
		System.out.println("전원 : "+isPowerOn);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volume);
		System.out.println("저장된 이전채널 : "+prevChannel);
	}
	
}

package day07.quiz;

public class TVTest {

	public static void main(String[] args) {
		// TV 테스트 
		TV tv1 = new TV();
		
		tv1.getTvInfo();
		tv1.powerOnOff();
//		tv1.getTvInfo();
		tv1.channelUp();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
		tv1.channelDown();
		
		tv1.prevChannel();
		tv1.prevChannel();
		
		tv1.getTvInfo();

	}

}

package day07.quiz;

/*
 *   다음에 설명하는 객체에 클래스를 생성하여 확인하세요.
 *   
 *   모니터 클래스를 생성!!!
 *   - 모니터는 해상도, 크기, 밝기, 상태(on/off) 속성을 가짐
 *   - 모니터는 기본적으로 해당도, 크기, 밝기 값을 100. 상태는 off를 
 *    가리킴
 *   - 모니터에는 버튼을 누르는 메서드. 즉, 전원 on/off기능이 존재함.
 *    해당 메서드 실행시 전원이 켜져 있다면 꺼지고, 꺼져있다면 켜져야 함.
 *   
 */

class Monitor {
	
	//멤버 변수 - 속성
	int resolution;
	int size;
	int brightness;
	boolean status;
	
	//constructor 생성자
	public Monitor() {
		this.resolution = 100;
		this.size = 100;
		this.brightness = 100;
		this.status = false;
	}
	
	//전원 메서드
	public void pressPowerButton() {
		status = !status;
	}

	//getter, setter
	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}

public class InstanceQuiz {
	
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		System.out.println("모니터 기본 값 : 해상도-"+monitor.resolution+", "
				+ "사이즈-"+monitor.size+", 밝기-"+monitor.brightness+", 전원-"+monitor.status);
		//전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.status);
		
		//전원 버튼 클릭
		monitor.pressPowerButton();
		System.out.println(monitor.status);
	}

}

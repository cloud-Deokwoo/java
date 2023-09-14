package day21.thread;

public class ProcessEx {

	public static void main(String[] args) {
		// 자바에서 다른 프로그램의 프로제스를 실행할 수 있는 방법
		
		try {
			// 메모장 실행
			Process p1 = Runtime.getRuntime().exec("notepad.exe");
//			System.out.println(p1.pid());
			
			// 그림판 실행
			Process p2 = Runtime.getRuntime().exec("mspaint.exe");
			
			p1.waitFor(); //p1 프로세스가 종료될 때까지 대기
			p2.destroy(); //p1 프로세스가 종료되면 실행... destroy() 프로세스 종료!
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

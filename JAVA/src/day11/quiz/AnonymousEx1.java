package day11.quiz;

public class AnonymousEx1 {

	public static void main(String[] args) {
		
		Machine tv = new TV("TV");
		Machine computer = new Machine();
		
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(tv.getName()+"를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println("컴퓨터를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println("컴퓨터를 끕니다.");
			}
		}, computer);

	}

}

package day11.quiz;

public class TV extends Machine {
	
	public TV(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}
	
	public void show() {
		System.out.println("방송중입니다.");
	}

}

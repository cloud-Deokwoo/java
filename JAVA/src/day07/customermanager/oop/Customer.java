package day07.customermanager.oop;

// DATA처리를 위한 객체

public class Customer {
	
	//멤버 변수
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	

	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public String toString() {
		// 이름, 성별, 이메일, 출생년도 출력으로 변경
		return "[이름= "+name+", 성별= "+gender+
				", 이메일= "+email+", 출생년도="+birthYear+"]";
	}

}

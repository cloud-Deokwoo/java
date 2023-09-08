package day17.filterstream.serializable;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -6369635331617747030L;
	
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	
	public Customer() {}
	
	public Customer(String name, char gender, String email, int birthYear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
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
		return "Customer [name="+name+", gender="+gender+", email="+email+","
				+ " birthYear="+birthYear+"]";
	}
	
	

}

package ödev3OopWithNLayeredApp.entities;

public class Instructor {
	private String firstName;
	private String lastName;
	private byte age;

	public Instructor() {}
	
	public Instructor(String firstName, String lastName, byte age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}
	
	
}

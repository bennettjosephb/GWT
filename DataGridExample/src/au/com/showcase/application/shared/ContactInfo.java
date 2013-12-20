package au.com.showcase.application.shared;

public class ContactInfo {

	private String firstName;
	private String lastName;
	private Float age;
	private Float height;
	private Address address;
	private String flagLocation;

	public String getFlagLocation() {
		return flagLocation;
	}

	public void setFlagLocation(String flagLocation) {
		this.flagLocation = flagLocation;
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

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}

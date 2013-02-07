package com.gwt.sample.client.login.createaccount;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwt.sample.client.login.createaccount.CreateAccountActionResult;
import java.lang.String;

public class CreateAccountAction extends ActionImpl<CreateAccountActionResult> {

	private String username;
	private String password;
	private String confirmPassword;
	private String dateOfBirth;
	private String gender;
	private String location;
	private String phoneNumber;
	private String firstName;
	private String lastName;

	@SuppressWarnings("unused")
	private CreateAccountAction() {
		// For serialization only
	}
	
	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return false;
	}

	public CreateAccountAction(String username, String password,
			String confirmPassword, String dateOfBirth, String gender,
			String location, String phoneNumber, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.location = location;
		this.phoneNumber = phoneNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public String getLocation() {
		return location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}

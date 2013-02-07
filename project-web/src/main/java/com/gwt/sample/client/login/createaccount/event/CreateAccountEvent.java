package com.gwt.sample.client.login.createaccount.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;

public class CreateAccountEvent extends GwtEvent<CreateAccountHandler> {

	public static Type<CreateAccountHandler> TYPE = new Type<CreateAccountHandler>();
	private String username;
	private String password;
	private String confirmPassword;
	private String dateOfBirth;
	private String gender;
	private String location;
	private String phoneNumber;
	private String firstName;
	private String lastName;

	public CreateAccountEvent(String username, String password,
			String confirmPassword, String dateOfBirth, String gender,
			String location, String phoneNumber, String firstName,
			String lastName) {
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

	@Override
	protected void dispatch(CreateAccountHandler handler) {
		handler.onCreateAccount(this);
	}

	@Override
	public Type<CreateAccountHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<CreateAccountHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String username,
			String password, String confirmPassword, String dateOfBirth,
			String gender, String location, String phoneNumber,
			String firstName, String lastName) {
		source.fireEvent(new CreateAccountEvent(username, password,
				confirmPassword, dateOfBirth, gender, location, phoneNumber,
				firstName, lastName));
	}
}

package com.gwt.sample.client.login.createaccount;

import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gwtplatform.mvp.client.View;

public interface CreateAccountDetailViewInterface extends View {
	public TextBox getFirstName();

	public void setFirstName(TextBox firstName);

	public TextBox getLastName();

	public void setLastName(TextBox lastName);

	public TextBox getUsername();

	public void setUsername(TextBox username);

	public PasswordTextBox getPassword();

	public void setPassword(PasswordTextBox password);

	public PasswordTextBox getConfirmPassword();

	public void setConfirmPassword(PasswordTextBox confirmPassword);

	public ListBox getMonthBD();

	public void setMonthBD(ListBox monthBD);

	public IntegerBox getDateBD();

	public void setDateBD(IntegerBox dateBD);

	public IntegerBox getYearBD();

	public void setYearBD(IntegerBox yearBD);

	public ListBox  getGender();

	public void setGender(ListBox  gender);

	public SuggestBox getLocation();

	public void setLocation(SuggestBox location);

	public TextBox getPhoneNumber();

	public void setPhoneNumber(TextBox phoneNumber);

	public SubmitButton getSubmit();

	public void setSubmit(SubmitButton submit);

	public Label getNameErrorLabel();

	public void setNameErrorLabel(Label nameErrorLabel);

	public Label getUsernameErrorLabel();

	public void setUsernameErrorLabel(Label usernameErrorLabel);

	public Label getPasswordErrorLabel();

	public void setPasswordErrorLabel(Label passwordErrorLabel);

	public Label getConfirmPasswordErrorLabel();

	public void setConfirmPasswordErrorLabel(Label confirmPasswordErrorLabel);

	public Label getDateOfBirthErrorLabel();

	public void setDateOfBirthErrorLabel(Label dateOfBirthErrorLabel);

	public Label getGenderErrorLabel();

	public void setGenderErrorLabel(Label genderErrorLabel);

	public Label getLocationErrorLabel();

	public void setLocationErrorLabel(Label locationErrorLabel);

	public Label getPhoneNumberErrorLabel();

	public void setPhoneNumberErrorLabel(Label phoneNumberErrorLabel);

}

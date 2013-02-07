package com.gwt.sample.client.login.createaccount;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CreateAccountDetailView extends ViewImpl implements
		CreateAccountDetailViewInterface {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CreateAccountDetailView> {
	}

	@Inject
	public CreateAccountDetailView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	// @UiField Label nameLabel;
	// @UiField TextBox firstName;
	// @UiField TextBox lastName;
	// @UiField Label userNameErrorLabel;
	@UiField
	TextBox firstName;
	@UiField
	TextBox lastName;
	@UiField
	TextBox username;
	@UiField
	PasswordTextBox password;
	@UiField
	PasswordTextBox confirmPassword;
	@UiField
	ListBox monthBD;
	@UiField
	IntegerBox dateBD;
	@UiField
	IntegerBox yearBD;
	@UiField
	ListBox gender;
	@UiField
	SuggestBox location;
	@UiField
	TextBox phoneNumber;
	@UiField
	SubmitButton submit;
	@UiField
	Label nameErrorLabel;
	@UiField
	Label usernameErrorLabel;
	@UiField
	Label passwordErrorLabel;
	@UiField
	Label confirmPasswordErrorLabel;
	@UiField
	Label dateOfBirthErrorLabel;
	@UiField
	Label genderErrorLabel;
	@UiField
	Label locationErrorLabel;
	@UiField
	Label phoneNumberErrorLabel;

	public SubmitButton getSubmit() {
		return submit;
	}

	public void setSubmit(SubmitButton submit) {
		this.submit = submit;
	}

	public TextBox getFirstName() {
		return firstName;
	}

	public void setFirstName(TextBox firstName) {
		this.firstName = firstName;
	}

	public TextBox getLastName() {
		return lastName;
	}

	public void setLastName(TextBox lastName) {
		this.lastName = lastName;
	}

	public TextBox getUsername() {
		return username;
	}

	public void setUsername(TextBox username) {
		this.username = username;
	}

	public PasswordTextBox getPassword() {
		return password;
	}

	public void setPassword(PasswordTextBox password) {
		this.password = password;
	}

	public PasswordTextBox getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(PasswordTextBox confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public ListBox getMonthBD() {
		return monthBD;
	}

	public void setMonthBD(ListBox monthBD) {
		this.monthBD = monthBD;
	}

	public IntegerBox getDateBD() {
		return dateBD;
	}

	public void setDateBD(IntegerBox dateBD) {
		this.dateBD = dateBD;
	}

	public IntegerBox getYearBD() {
		return yearBD;
	}

	public void setYearBD(IntegerBox yearBD) {
		this.yearBD = yearBD;
	}

	public ListBox getGender() {
		return gender;
	}

	public void setGender(ListBox gender) {
		this.gender = gender;
	}

	public SuggestBox getLocation() {
		return location;
	}

	public void setLocation(SuggestBox location) {
		this.location = location;
	}

	public TextBox getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(TextBox phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Label getNameErrorLabel() {
		return nameErrorLabel;
	}

	public void setNameErrorLabel(Label nameErrorLabel) {
		this.nameErrorLabel = nameErrorLabel;
	}

	public Label getUsernameErrorLabel() {
		return usernameErrorLabel;
	}

	public void setUsernameErrorLabel(Label usernameErrorLabel) {
		this.usernameErrorLabel = usernameErrorLabel;
	}

	public Label getPasswordErrorLabel() {
		return passwordErrorLabel;
	}

	public void setPasswordErrorLabel(Label passwordErrorLabel) {
		this.passwordErrorLabel = passwordErrorLabel;
	}

	public Label getConfirmPasswordErrorLabel() {
		return confirmPasswordErrorLabel;
	}

	public void setConfirmPasswordErrorLabel(Label confirmPasswordErrorLabel) {
		this.confirmPasswordErrorLabel = confirmPasswordErrorLabel;
	}

	public Label getDateOfBirthErrorLabel() {
		return dateOfBirthErrorLabel;
	}

	public void setDateOfBirthErrorLabel(Label dateOfBirthErrorLabel) {
		this.dateOfBirthErrorLabel = dateOfBirthErrorLabel;
	}

	public Label getGenderErrorLabel() {
		return genderErrorLabel;
	}

	public void setGenderErrorLabel(Label genderErrorLabel) {
		this.genderErrorLabel = genderErrorLabel;
	}

	public Label getLocationErrorLabel() {
		return locationErrorLabel;
	}

	public void setLocationErrorLabel(Label locationErrorLabel) {
		this.locationErrorLabel = locationErrorLabel;
	}

	public Label getPhoneNumberErrorLabel() {
		return phoneNumberErrorLabel;
	}

	public void setPhoneNumberErrorLabel(Label phoneNumberErrorLabel) {
		this.phoneNumberErrorLabel = phoneNumberErrorLabel;
	}
}

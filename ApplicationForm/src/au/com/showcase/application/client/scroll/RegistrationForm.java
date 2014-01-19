package au.com.showcase.application.client.scroll;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class RegistrationForm extends Composite {

	private static RegistrationFormUiBinder uiBinder = GWT
			.create(RegistrationFormUiBinder.class);

	interface RegistrationFormUiBinder extends
			UiBinder<Widget, RegistrationForm> {
	}

	public RegistrationForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

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
	TextBox dobDate;

	@UiField
	TextBox dobYear;

	@UiField
	TextBox mobileNumber;

	@UiField
	TextBox emailAddress;

	@UiField
	TextBox captchaText;

	@UiField
	ListBox dobMonth;

	@UiField
	ListBox gender;

	@UiField
	ListBox location;

	@UiField
	CheckBox agreement;

	@UiField
	SubmitButton submit;

	@Override
	protected void onLoad() {
		super.onLoad();
		// Window.alert("Before Wrap" +
		// Document.get().getElementById("firstName"));
		// TextBox.wrap(Document.get().getElementById("firstName"));
		// Window.alert("After Wrap");
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

	public TextBox getDobDate() {
		return dobDate;
	}

	public void setDobDate(TextBox dobDate) {
		this.dobDate = dobDate;
	}

	public TextBox getDobYear() {
		return dobYear;
	}

	public void setDobYear(TextBox dobYear) {
		this.dobYear = dobYear;
	}

	public TextBox getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(TextBox mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public TextBox getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(TextBox emailAddress) {
		this.emailAddress = emailAddress;
	}

	public TextBox getCaptchaText() {
		return captchaText;
	}

	public void setCaptchaText(TextBox captchaText) {
		this.captchaText = captchaText;
	}

	public ListBox getDobMonth() {
		return dobMonth;
	}

	public void setDobMonth(ListBox dobMonth) {
		this.dobMonth = dobMonth;
	}

	public ListBox getGender() {
		return gender;
	}

	public void setGender(ListBox gender) {
		this.gender = gender;
	}

	public ListBox getLocation() {
		return location;
	}

	public void setLocation(ListBox location) {
		this.location = location;
	}

	public CheckBox getAgreement() {
		return agreement;
	}

	public void setAgreement(CheckBox agreement) {
		this.agreement = agreement;
	}

	public SubmitButton getSubmit() {
		return submit;
	}

	public void setSubmit(SubmitButton submit) {
		this.submit = submit;
	}

}
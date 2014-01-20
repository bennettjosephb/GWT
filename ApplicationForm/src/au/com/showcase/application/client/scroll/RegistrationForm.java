package au.com.showcase.application.client.scroll;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;
import au.com.showcase.application.client.ui.event.ListBoxBlurHandler;
import au.com.showcase.application.client.ui.event.ListBoxFocusHandler;
import au.com.showcase.application.client.ui.event.TextBoxBlurHandler;
import au.com.showcase.application.client.ui.event.TextBoxFocusHandler;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
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
		ApplicationResources.INSTANCE.customWidget().ensureInjected();
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

	@UiField
	Label nameError;

	@UiField
	Label usernameError;

	@UiField
	Label passwordError;

	@UiField
	Label confirmPasswordError;

	@UiField
	Label dobError;

	@UiField
	Label genderError;

	@UiField
	Label mobileNumberError;

	@UiField
	Label emailAddressError;

	@UiField
	Label locationError;

	@UiField
	Label captchaTextError;

	TextBoxBlurHandler firstNameBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler firstNameFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler lastNameBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler lastNameFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler usernameBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler usernameFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler passwordBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler passwordFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler confirmPasswordBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler confirmPasswordFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler dobDateBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler dobDateFocusHandler = new TextBoxFocusHandler();
	TextBoxBlurHandler dobYearBlurHandler = new TextBoxBlurHandler();
	TextBoxFocusHandler dobYearFocusHandler = new TextBoxFocusHandler();
	ListBoxBlurHandler dobMonthBlurHandler = new ListBoxBlurHandler();
	ListBoxFocusHandler dobMonthFocusHandler = new ListBoxFocusHandler();

	DecoratedPopupPanel firstNamePopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel lastNamePopupPanel = new DecoratedPopupPanel(
			(short) 462, (short) 5);

	DecoratedPopupPanel usernamePopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel passwordPopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel confirmPasswordPopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel dobMonthPopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel dobDatePopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel dobYearPopupPanel = new DecoratedPopupPanel(
			(short) 285, (short) 5);

	DecoratedPopupPanel thirdPopupPanel = new DecoratedPopupPanel((short) 452,
			(short) 5);

	@Override
	protected void onLoad() {
		super.onLoad();

		firstName.getElement().setAttribute("placeholder", "First");
		lastName.getElement().setAttribute("placeholder", "Last");
		dobDate.getElement().setAttribute("placeholder", "Date");
		dobYear.getElement().setAttribute("placeholder", "Year");

		firstName.addFocusHandler(firstNameFocusHandler);
		firstName.addBlurHandler(firstNameBlurHandler);
		lastName.addFocusHandler(lastNameFocusHandler);
		lastName.addBlurHandler(lastNameBlurHandler);
		username.addFocusHandler(usernameFocusHandler);
		username.addBlurHandler(usernameBlurHandler);
		password.addFocusHandler(passwordFocusHandler);
		password.addBlurHandler(passwordBlurHandler);
		confirmPassword.addFocusHandler(confirmPasswordFocusHandler);
		confirmPassword.addBlurHandler(confirmPasswordBlurHandler);
		dobMonth.addFocusHandler(dobMonthFocusHandler);
		dobMonth.addBlurHandler(dobMonthBlurHandler);
		dobDate.addFocusHandler(dobDateFocusHandler);
		dobDate.addBlurHandler(dobDateBlurHandler);
		dobYear.addFocusHandler(dobYearFocusHandler);
		dobYear.addBlurHandler(dobYearBlurHandler);

		firstNameFocusHandler.setDecoratedPopupPanel(firstNamePopupPanel);
		firstNameBlurHandler.setDecoratedPopupPanel(firstNamePopupPanel);
		lastNameFocusHandler.setDecoratedPopupPanel(lastNamePopupPanel);
		lastNameBlurHandler.setDecoratedPopupPanel(lastNamePopupPanel);
		usernameFocusHandler.setDecoratedPopupPanel(usernamePopupPanel);
		usernameBlurHandler.setDecoratedPopupPanel(usernamePopupPanel);
		passwordFocusHandler.setDecoratedPopupPanel(passwordPopupPanel);
		passwordBlurHandler.setDecoratedPopupPanel(passwordPopupPanel);
		confirmPasswordFocusHandler
				.setDecoratedPopupPanel(confirmPasswordPopupPanel);
		confirmPasswordBlurHandler
				.setDecoratedPopupPanel(confirmPasswordPopupPanel);
		dobDateFocusHandler.setDecoratedPopupPanel(dobDatePopupPanel);
		dobDateBlurHandler.setDecoratedPopupPanel(dobDatePopupPanel);
		dobYearFocusHandler.setDecoratedPopupPanel(dobYearPopupPanel);
		dobYearBlurHandler.setDecoratedPopupPanel(dobYearPopupPanel);

		firstNameFocusHandler.setErrorLabel(nameError);
		firstNameBlurHandler.setErrorLabel(nameError);
		lastNameFocusHandler.setErrorLabel(nameError);
		lastNameBlurHandler.setErrorLabel(nameError);
		usernameFocusHandler.setErrorLabel(usernameError);
		usernameBlurHandler.setErrorLabel(usernameError);
		passwordFocusHandler.setErrorLabel(passwordError);
		passwordBlurHandler.setErrorLabel(passwordError);
		confirmPasswordFocusHandler.setErrorLabel(confirmPasswordError);
		confirmPasswordBlurHandler.setErrorLabel(confirmPasswordError);
		dobMonthFocusHandler.setErrorLabel(dobError);
		dobMonthBlurHandler.setErrorLabel(dobError);
		dobDateFocusHandler.setErrorLabel(dobError);
		dobDateBlurHandler.setErrorLabel(dobError);
		dobYearFocusHandler.setErrorLabel(dobError);
		dobYearBlurHandler.setErrorLabel(dobError);

		usernameFocusHandler.setDecoratedPopupPanel(usernamePopupPanel);
		usernameBlurHandler.setDecoratedPopupPanel(usernamePopupPanel);
		passwordFocusHandler.setDecoratedPopupPanel(passwordPopupPanel);
		passwordBlurHandler.setDecoratedPopupPanel(passwordPopupPanel);
		confirmPasswordFocusHandler
				.setDecoratedPopupPanel(confirmPasswordPopupPanel);
		confirmPasswordBlurHandler
				.setDecoratedPopupPanel(confirmPasswordPopupPanel);
		dobMonthFocusHandler.setDecoratedPopupPanel(dobMonthPopupPanel);
		dobMonthBlurHandler.setDecoratedPopupPanel(dobMonthPopupPanel);
		dobDateFocusHandler.setDecoratedPopupPanel(dobDatePopupPanel);
		dobDateBlurHandler.setDecoratedPopupPanel(dobDatePopupPanel);
		dobYearFocusHandler.setDecoratedPopupPanel(dobYearPopupPanel);
		dobYearBlurHandler.setDecoratedPopupPanel(dobYearPopupPanel);

		firstNamePopupPanel.setMessage("Enter First Name");
		lastNamePopupPanel.setMessage("Enter Last Name");
		usernamePopupPanel.setMessage("Choose User Name");
		passwordPopupPanel.setMessage("Choose Strong Password");
		confirmPasswordPopupPanel.setMessage("Confirm the Password");
		dobMonthPopupPanel.setMessage("Date Of Birth");
		dobDatePopupPanel.setMessage("Date Of Birth");
		dobYearPopupPanel.setMessage("Date Of Birth");

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

	public Label getNameError() {
		return nameError;
	}

	public void setNameError(Label nameError) {
		this.nameError = nameError;
	}

}
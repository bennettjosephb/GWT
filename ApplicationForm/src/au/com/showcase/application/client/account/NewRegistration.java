package au.com.showcase.application.client.account;

import com.gwtplatform.dispatch.shared.ActionImpl;
import au.com.showcase.application.client.account.NewRegistrationResult;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class NewRegistration extends ActionImpl<NewRegistrationResult> {

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String confirmPassword;
	private String dobMonth;
	private Integer dobYear;
	private Integer dobDate;
	private String gender;
	private String mobileNumber;
	private String emailAddress;
	private String location;
	private String captchaText;
	private Boolean agreement;

	@SuppressWarnings("unused")
	private NewRegistration() {
		// For serialization only
	}

	public NewRegistration(String firstName, String lastName, String username,
			String password, String confirmPassword, String dobMonth,
			Integer dobYear, Integer dobDate, String gender, String mobileNumber,
			String emailAddress, String location, String captchaText,
			Boolean agreement) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.dobMonth = dobMonth;
		this.dobYear = dobYear;
		this.dobDate = dobDate;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.emailAddress = emailAddress;
		this.location = location;
		this.captchaText = captchaText;
		this.agreement = agreement;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
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

	public String getDobMonth() {
		return dobMonth;
	}

	public Integer getDobYear() {
		return dobYear;
	}

	public Integer getDobDate() {
		return dobDate;
	}

	public String getGender() {
		return gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getLocation() {
		return location;
	}

	public String getCaptchaText() {
		return captchaText;
	}

	public Boolean getAgreement() {
		return agreement;
	}
}

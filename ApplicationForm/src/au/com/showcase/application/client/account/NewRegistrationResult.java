package au.com.showcase.application.client.account;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class NewRegistrationResult implements Result {

	private String statusCode;
	private String statusMessage;

	@SuppressWarnings("unused")
	private NewRegistrationResult() {
		// For serialization only
	}

	public NewRegistrationResult(String statusCode, String statusMessage) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}
}

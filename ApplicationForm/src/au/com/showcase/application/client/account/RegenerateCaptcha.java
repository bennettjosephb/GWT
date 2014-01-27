package au.com.showcase.application.client.account;

import com.gwtplatform.dispatch.shared.ActionImpl;
import au.com.showcase.application.client.account.RegenerateCaptchaResult;
import java.lang.String;

public class RegenerateCaptcha extends ActionImpl<RegenerateCaptchaResult> {

	private String userId;

	@Override
	public boolean isSecured() {
		return false;
	}

	@SuppressWarnings("unused")
	private RegenerateCaptcha() {
		// For serialization only
	}

	public RegenerateCaptcha(String userId) {
		this.userId = userId;
	}

	public String getUserId() {
		return userId;
	}
}

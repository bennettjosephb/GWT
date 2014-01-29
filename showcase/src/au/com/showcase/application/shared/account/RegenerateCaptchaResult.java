package au.com.showcase.application.shared.account;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class RegenerateCaptchaResult implements Result {

	private String imageSource;

	@SuppressWarnings("unused")
	private RegenerateCaptchaResult() {
		// For serialization only
	}

	public RegenerateCaptchaResult(String imageSource) {
		this.imageSource = imageSource;
	}

	public String getImageSource() {
		return imageSource;
	}
}

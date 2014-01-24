package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class ImageActionResult implements Result {

	private String image;

	@SuppressWarnings("unused")
	private ImageActionResult() {
		// For serialization only
	}

	public ImageActionResult(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}
}

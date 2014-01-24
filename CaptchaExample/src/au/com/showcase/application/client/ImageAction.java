package au.com.showcase.application.client;

import com.gwtplatform.dispatch.shared.ActionImpl;
import au.com.showcase.application.client.ImageActionResult;
import java.lang.String;

public class ImageAction extends ActionImpl<ImageActionResult> {

	private String image;
	
	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return false;
	}

	@SuppressWarnings("unused")
	private ImageAction() {
		// For serialization only
	}

	public ImageAction(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}
}

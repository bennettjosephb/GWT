package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Image;

public class RegenerateCaptchaClickHandler implements ClickHandler {

	Image imageSource;

	public Image getImageSource() {
		return imageSource;
	}

	public void setImageSource(Image imageSource) {
		this.imageSource = imageSource;
	}

	@Override
	public void onClick(ClickEvent event) {
		imageSource.setUrl("");
		imageSource.setUrl("/SimpleCaptcha.jpg");
	}

}
package au.com.showcase.application.client.ui;

import au.com.showcase.application.client.ui.event.TextBoxBlurHandler;
import au.com.showcase.application.client.ui.event.TextBoxClickHandler;
import au.com.showcase.application.client.ui.event.TextBoxFocusHandler;
import au.com.showcase.application.client.ui.event.TextBoxKeyDownHandler;
import au.com.showcase.application.client.ui.event.TextBoxKeyPressHandler;
import au.com.showcase.application.client.ui.event.TextBoxKeyUpHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseDownHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseMoveHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseOutHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseOverHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseUpHandler;
import au.com.showcase.application.client.ui.event.TextBoxMouseWheelHandler;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.TextBox;

public class ExtendedTextBoxBase extends TextBox {

	public ExtendedTextBoxBase() {

		addHandlers();

	}

	private void addHandlers() {

		addClickHandler();
		addBlurHandler();
		addMouseDownHandler();
		addFocusHandler();
		addKeyDownHandler();
		addKeyPressHandler();
		addKeyUpHandler();
		addMouseMoveHandler();
		addMouseOutHandler();
		addMouseOverHandler();
		addMouseUpHandler();
		addMouseWheelHandler();
		addMouseOverHandler();

	}

	TextBoxBlurHandler textBoxBlurHandler = new TextBoxBlurHandler();

	TextBoxFocusHandler textBoxFocusHandler = new TextBoxFocusHandler();

	TextBoxKeyDownHandler textBoxKeyDownHandler = new TextBoxKeyDownHandler();

	TextBoxKeyPressHandler textBoxKeyPressHandler = new TextBoxKeyPressHandler();

	TextBoxKeyUpHandler textBoxKeyUpHandler = new TextBoxKeyUpHandler();

	TextBoxMouseDownHandler textBoxMouseDownHandler = new TextBoxMouseDownHandler();

	TextBoxMouseMoveHandler textBoxMouseMoveHandler = new TextBoxMouseMoveHandler();

	TextBoxMouseOutHandler textBoxMouseOutHandler = new TextBoxMouseOutHandler();

	TextBoxMouseOverHandler textBoxMouseOverHandler = new TextBoxMouseOverHandler();

	TextBoxMouseUpHandler textBoxMouseUpHandler = new TextBoxMouseUpHandler();

	TextBoxMouseWheelHandler textBoxMouseWheelHandler = new TextBoxMouseWheelHandler();

	TextBoxClickHandler textBoxClickHandler = new TextBoxClickHandler();

	public HandlerRegistration addClickHandler() {
		return super.addClickHandler(textBoxClickHandler);
	}

	public HandlerRegistration addBlurHandler() {
		return super.addBlurHandler(textBoxBlurHandler);
	}

	public HandlerRegistration addMouseDownHandler() {
		return super.addMouseDownHandler(textBoxMouseDownHandler);
	}

	public HandlerRegistration addFocusHandler() {
		return super.addFocusHandler(textBoxFocusHandler);
	}

	public HandlerRegistration addKeyDownHandler() {
		return super.addKeyDownHandler(textBoxKeyDownHandler);
	}

	public HandlerRegistration addKeyPressHandler() {
		return super.addKeyPressHandler(textBoxKeyPressHandler);
	}

	public HandlerRegistration addKeyUpHandler() {
		return super.addKeyUpHandler(textBoxKeyUpHandler);
	}

	public HandlerRegistration addMouseMoveHandler() {
		return super.addMouseMoveHandler(textBoxMouseMoveHandler);
	}

	public HandlerRegistration addMouseOutHandler() {
		return super.addMouseOutHandler(textBoxMouseOutHandler);
	}

	public HandlerRegistration addMouseOverHandler() {
		return super.addMouseOverHandler(textBoxMouseOverHandler);
	}

	public HandlerRegistration addMouseUpHandler() {
		return super.addMouseUpHandler(textBoxMouseUpHandler);
	}

	public HandlerRegistration addMouseWheelHandler() {
		return super.addMouseWheelHandler(textBoxMouseWheelHandler);
	}

}

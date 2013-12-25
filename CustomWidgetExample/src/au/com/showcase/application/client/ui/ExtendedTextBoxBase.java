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
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class ExtendedTextBoxBase extends TextBox {

	private Boolean isContentValid;

	public Boolean isContentValid() {
		return isContentValid;
	}

	public void isContentValid(Boolean isContentValid) {
		this.isContentValid = isContentValid;
	}

	public ExtendedTextBoxBase() {

		textBoxBlurHandler = new TextBoxBlurHandler();

		textBoxFocusHandler = new TextBoxFocusHandler();

		textBoxKeyDownHandler = new TextBoxKeyDownHandler();

		textBoxKeyPressHandler = new TextBoxKeyPressHandler();

		textBoxKeyUpHandler = new TextBoxKeyUpHandler();

		textBoxMouseDownHandler = new TextBoxMouseDownHandler();

		textBoxMouseMoveHandler = new TextBoxMouseMoveHandler();

		textBoxMouseOutHandler = new TextBoxMouseOutHandler();

		textBoxMouseOverHandler = new TextBoxMouseOverHandler();

		textBoxMouseUpHandler = new TextBoxMouseUpHandler();

		textBoxMouseWheelHandler = new TextBoxMouseWheelHandler();

		textBoxClickHandler = new TextBoxClickHandler();

		super.addClickHandler(textBoxClickHandler);

		super.addBlurHandler(textBoxBlurHandler);

		super.addMouseDownHandler(textBoxMouseDownHandler);

		super.addFocusHandler(textBoxFocusHandler);

		super.addKeyDownHandler(textBoxKeyDownHandler);

		super.addKeyPressHandler(textBoxKeyPressHandler);

		super.addKeyUpHandler(textBoxKeyUpHandler);

		super.addMouseMoveHandler(textBoxMouseMoveHandler);

		super.addMouseOutHandler(textBoxMouseOutHandler);

		super.addMouseOverHandler(textBoxMouseOverHandler);

		super.addMouseUpHandler(textBoxMouseUpHandler);

		super.addMouseWheelHandler(textBoxMouseWheelHandler);

		super.addClickHandler(textBoxClickHandler);

		super.addBlurHandler(textBoxBlurHandler);

		super.addMouseDownHandler(textBoxMouseDownHandler);

		super.addFocusHandler(textBoxFocusHandler);

		super.addKeyDownHandler(textBoxKeyDownHandler);

		super.addKeyPressHandler(textBoxKeyPressHandler);

		super.addKeyUpHandler(textBoxKeyUpHandler);

		super.addMouseMoveHandler(textBoxMouseMoveHandler);

		super.addMouseOutHandler(textBoxMouseOutHandler);

		super.addMouseOverHandler(textBoxMouseOverHandler);

		super.addMouseUpHandler(textBoxMouseUpHandler);

		super.addMouseWheelHandler(textBoxMouseWheelHandler);

		decoratedPopupPanel = new DecoratedPopupPanel();
		
		decoratedPopupPanel.setStyleName("arrow_box");

		textBoxFocusHandler.setDecoratedPopupPanel(decoratedPopupPanel);

		textBoxBlurHandler.setDecoratedPopupPanel(decoratedPopupPanel);

	}

	public Boolean hasError() {
		return textBoxKeyUpHandler.getHasError()
				|| textBoxClickHandler.getHasError();
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

	DecoratedPopupPanel decoratedPopupPanel;

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

	public HandlerRegistration addClickHandler(
			TextBoxClickHandler textBoxClickHandler) {
		return super.addClickHandler(textBoxClickHandler);
	}

	public HandlerRegistration addBlurHandler(
			TextBoxBlurHandler textBoxBlurHandler) {
		return super.addBlurHandler(textBoxBlurHandler);
	}

	public HandlerRegistration addMouseDownHandler(
			TextBoxMouseDownHandler textBoxMouseDownHandler) {
		return super.addMouseDownHandler(textBoxMouseDownHandler);
	}

	public HandlerRegistration addFocusHandler(
			TextBoxFocusHandler textBoxFocusHandler) {
		return super.addFocusHandler(textBoxFocusHandler);
	}

	public HandlerRegistration addKeyDownHandler(
			TextBoxKeyDownHandler textBoxKeyDownHandler) {
		return super.addKeyDownHandler(textBoxKeyDownHandler);
	}

	public HandlerRegistration addKeyPressHandler(
			TextBoxKeyPressHandler textBoxKeyPressHandler) {
		return super.addKeyPressHandler(textBoxKeyPressHandler);
	}

	public HandlerRegistration addKeyUpHandler(
			TextBoxKeyUpHandler textBoxKeyUpHandler) {
		return super.addKeyUpHandler(textBoxKeyUpHandler);
	}

	public HandlerRegistration addMouseMoveHandler(
			TextBoxMouseMoveHandler textBoxMouseMoveHandler) {
		return super.addMouseMoveHandler(textBoxMouseMoveHandler);
	}

	public HandlerRegistration addMouseOutHandler(
			TextBoxMouseOutHandler textBoxMouseOutHandler) {
		return super.addMouseOutHandler(textBoxMouseOutHandler);
	}

	public HandlerRegistration addMouseOverHandler(
			TextBoxMouseOverHandler textBoxMouseOverHandler) {
		return super.addMouseOverHandler(textBoxMouseOverHandler);
	}

	public HandlerRegistration addMouseUpHandler(
			TextBoxMouseUpHandler textBoxMouseUpHandler) {
		return super.addMouseUpHandler(textBoxMouseUpHandler);
	}

	public HandlerRegistration addMouseWheelHandler(
			TextBoxMouseWheelHandler textBoxMouseWheelHandler) {
		return super.addMouseWheelHandler(textBoxMouseWheelHandler);
	}
}

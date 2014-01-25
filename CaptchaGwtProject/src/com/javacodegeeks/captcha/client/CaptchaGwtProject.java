package com.javacodegeeks.captcha.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class CaptchaGwtProject implements EntryPoint, ClickHandler {
	
	private final SignupServiceAsync signupService = GWT.create(SignupService.class);
	
	private final Button sendButton = new Button("Sign Up");
	private final Button reloadButton = new Button("Reload Image");
	
	private int counter = 0;
	
	private Image captchaImage;
	
	public void onModuleLoad() {
		
		final TextBox usernameField = new TextBox();
		usernameField.setText("Username here");
		
		final TextBox passwordField = new TextBox();
		passwordField.setText("Password here");

		final TextBox captchaField = new TextBox();
		captchaField.setText("CAPTCHA Word here");
		
		final Label responseLabel = new Label();		
		captchaImage = new Image("/SimpleCaptcha.jpg?counter="+counter);

		usernameField.setFocus(true);
		sendButton.addStyleName("sendButton");
		
		RootPanel.get("usernameFieldContainer").add(usernameField);
		RootPanel.get("passwordFieldContainer").add(passwordField);
		RootPanel.get("captchaFieldContainer").add(captchaField);
		RootPanel.get("sendButtonContainer").add(sendButton);
		RootPanel.get("reloadButtonContainer").add(reloadButton);
		RootPanel.get("captchaImageContainer").add(captchaImage);
		RootPanel.get("responseLabelContainer").add(responseLabel);
		
		reloadButton.addClickHandler(this);

		class MyHandler implements ClickHandler, KeyUpHandler {
			public void onClick(ClickEvent event) {
				sendDataToServer();
			}
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					sendDataToServer();
				}
			}
			private void sendDataToServer() {				
				String username = usernameField.getText();
				String password = passwordField.getText();
				String captcha = captchaField.getText();
				sendButton.setEnabled(false);	
				signupService.performSignup(username, password, captcha, signupCallback);				
			}
		}

		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		usernameField.addKeyUpHandler(handler);
		
	}
	
	private AsyncCallback<Boolean> signupCallback = new AsyncCallback<Boolean>() {		
		@Override
		public void onSuccess(Boolean result) {
			if (result) {
				Window.alert("CAPTCHA was valid");
			}
			else {
				Window.alert("CAPTCHA was invalid");
			}			
			sendButton.setEnabled(true);
		}		
		@Override
		public void onFailure(Throwable caught) {
			Window.alert("Error occurred while communicating with server");
			sendButton.setEnabled(true);
		}		
	};

	@Override
	public void onClick(ClickEvent event) {
		if (event.getSource()==reloadButton) {
			counter++;
			RootPanel.get("captchaImageContainer").remove(captchaImage);
			captchaImage = new Image("SimpleCaptcha.jpg?counter="+counter);
			RootPanel.get("captchaImageContainer").add(captchaImage);
		}
	}
	
}

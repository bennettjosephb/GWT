package com.gwt.sample.shared;

import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;
import com.gwt.sample.shared.SendTextToServerResult;

public class SendTextToServer extends
		UnsecuredActionImpl<SendTextToServerResult> {

	private String textToServer;

	@SuppressWarnings("unused")
	private SendTextToServer() {
		// For serialization only
	}

	public SendTextToServer(String textToServer) {
		this.textToServer = textToServer;
	}

	public String getTextToServer() {
		return textToServer;
	}
}

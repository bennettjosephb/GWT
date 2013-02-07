package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.Result;

public class ContactDetailsResult implements Result {

	private Boolean contentSaved;

	@SuppressWarnings("unused")
	private ContactDetailsResult() {
		// For serialization only
	}

	public ContactDetailsResult(Boolean contentSaved) {
		this.contentSaved= contentSaved;
	}

	public Boolean isContentSaved() {
		return contentSaved;
	}

	public void setContentSaved(Boolean contentSaved) {
		this.contentSaved = contentSaved;
	}
}

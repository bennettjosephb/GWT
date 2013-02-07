package com.gwt.sample.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.dispatch.shared.DispatchAsync;

public class EmployerDetailsDialog extends DialogBox {

	private static EmployerDetailsDialogUiBinder uiBinder = GWT
			.create(EmployerDetailsDialogUiBinder.class);

	interface EmployerDetailsDialogUiBinder extends
			UiBinder<Widget, EmployerDetailsDialog> {
	}

	public EmployerDetailsDialog() {
		super(false, true);
		center();
		hide();
		setWidget(uiBinder.createAndBindUi(this));
	}

	public EmployerDetailsDialog(DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstants) {
		super(false, true);
		center();
		hide();
		//setModal(true);
		setWidget(uiBinder.createAndBindUi(this));
		// setSize("400px", "400px");

	}

}
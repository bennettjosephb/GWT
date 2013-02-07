package com.gwt.sample.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;

public class EmployerDetails extends Composite{

	private static EmployerDetailsUiBinder uiBinder = GWT
			.create(EmployerDetailsUiBinder.class);

	interface EmployerDetailsUiBinder extends UiBinder<Widget, EmployerDetails> {
	}

	public EmployerDetails() {

	}

	@Inject
	public EmployerDetails(DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstants) {
		employerDetailsDialog = new EmployerDetailsDialog(dispatchAsync, dateTimeConstants);
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField(provided = true)
	EmployerDetailsDialog employerDetailsDialog;
	

}

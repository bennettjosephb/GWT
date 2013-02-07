package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class AddressView extends ViewImpl implements AddressPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, AddressView> {
	}

	@Inject
	public AddressView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	TextBox street1;
	@UiField
	TextBox street2;
	@UiField
	TextBox city;
	@UiField
	TextBox state;
	@UiField
	TextBox zipCode;
	@UiField
	TextBox country;
	@UiField
	Label street1Error;
	@UiField
	Label street2Error;
	@UiField
	Label cityError;
	@UiField
	Label stateError;
	@UiField
	Label zipCodeError;
	@UiField
	Label countryError;

}

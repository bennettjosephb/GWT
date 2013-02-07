package com.gwt.sample.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;

public class AddressDetailsOverview extends Composite {

	private static AddressDetailsOverviewUiBinder uiBinder = GWT
			.create(AddressDetailsOverviewUiBinder.class);
	@UiField
	Label street1;
	@UiField
	Label street2;
	@UiField
	Label city;
	@UiField
	Label state;
	@UiField
	Label zipCode;
	@UiField
	Label country;

	interface AddressDetailsOverviewUiBinder extends
			UiBinder<Widget, AddressDetailsOverview> {
	}

	public AddressDetailsOverview() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Label getStreet1() {
		return street1;
	}

	public void setStreet1(Label street1) {
		this.street1 = street1;
	}

	public Label getStreet2() {
		return street2;
	}

	public void setStreet2(Label street2) {
		this.street2 = street2;
	}

	public Label getCity() {
		return city;
	}

	public void setCity(Label city) {
		this.city = city;
	}

	public Label getState() {
		return state;
	}

	public void setState(Label state) {
		this.state = state;
	}

	public Label getZipCode() {
		return zipCode;
	}

	public void setZipCode(Label zipCode) {
		this.zipCode = zipCode;
	}

	public Label getCountry() {
		return country;
	}

	public void setCountry(Label country) {
		this.country = country;
	}

}

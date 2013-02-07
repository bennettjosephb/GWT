package com.gwt.sample.client.content;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddressDetails extends Composite {

	private static AddressDetailsUiBinder uiBinder = GWT
			.create(AddressDetailsUiBinder.class);

	interface AddressDetailsUiBinder extends UiBinder<Widget, AddressDetails> {
	}

	public AddressDetails() {
		initWidget(uiBinder.createAndBindUi(this));
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
	public TextBox getStreet1() {
		return street1;
	}
	public void setStreet1(TextBox street1) {
		this.street1 = street1;
	}
	public TextBox getStreet2() {
		return street2;
	}
	public void setStreet2(TextBox street2) {
		this.street2 = street2;
	}
	public TextBox getCity() {
		return city;
	}
	public void setCity(TextBox city) {
		this.city = city;
	}
	public TextBox getState() {
		return state;
	}
	public void setState(TextBox state) {
		this.state = state;
	}
	public TextBox getZipCode() {
		return zipCode;
	}
	public void setZipCode(TextBox zipCode) {
		this.zipCode = zipCode;
	}
	public TextBox getCountry() {
		return country;
	}
	public void setCountry(TextBox country) {
		this.country = country;
	}
	public Label getStreet1Error() {
		return street1Error;
	}
	public void setStreet1Error(Label street1Error) {
		this.street1Error = street1Error;
	}
	public Label getStreet2Error() {
		return street2Error;
	}
	public void setStreet2Error(Label street2Error) {
		this.street2Error = street2Error;
	}
	public Label getCityError() {
		return cityError;
	}
	public void setCityError(Label cityError) {
		this.cityError = cityError;
	}
	public Label getStateError() {
		return stateError;
	}
	public void setStateError(Label stateError) {
		this.stateError = stateError;
	}
	public Label getZipCodeError() {
		return zipCodeError;
	}
	public void setZipCodeError(Label zipCodeError) {
		this.zipCodeError = zipCodeError;
	}
	public Label getCountryError() {
		return countryError;
	}
	public void setCountryError(Label countryError) {
		this.countryError = countryError;
	}

}

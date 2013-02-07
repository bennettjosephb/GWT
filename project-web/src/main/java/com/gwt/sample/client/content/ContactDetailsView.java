package com.gwt.sample.client.content;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ContactDetailsView extends ViewImpl implements
		ContactDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContactDetailsView> {
	}

	@Inject
	public ContactDetailsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	TextBox mobileNumber;
	@UiField
	TextBox workNumber;
	@UiField
	TextBox homeNumber;
	@UiField
	TextBox faxNumber;
	@UiField
	Label mobileNumberError;
	@UiField
	Label workNumberError;
	@UiField
	Label homeNumberError;
	@UiField
	Label faxNumberError;
	@UiField
	CheckBox copyAddress;
	@UiField
	AddressDetails permanentAddress;
	@UiField
	AddressDetails temporaryAddress;
	@UiField
	SubmitButton save;
	@UiField
	TextBox eMailId;
	@UiField
	Label eMailIdError;

	public TextBox getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(TextBox mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public TextBox getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(TextBox workNumber) {
		this.workNumber = workNumber;
	}

	public TextBox getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(TextBox homeNumber) {
		this.homeNumber = homeNumber;
	}

	public TextBox getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(TextBox faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Label getMobileNumberError() {
		return mobileNumberError;
	}

	public void setMobileNumberError(Label mobileNumberError) {
		this.mobileNumberError = mobileNumberError;
	}

	public Label getWorkNumberError() {
		return workNumberError;
	}

	public void setWorkNumberError(Label workNumberError) {
		this.workNumberError = workNumberError;
	}

	public Label getHomeNumberError() {
		return homeNumberError;
	}

	public void setHomeNumberError(Label homeNumberError) {
		this.homeNumberError = homeNumberError;
	}

	public Label getFaxNumberError() {
		return faxNumberError;
	}

	public void setFaxNumberError(Label faxNumberError) {
		this.faxNumberError = faxNumberError;
	}

	public AddressDetails getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(AddressDetails permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public AddressDetails getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(AddressDetails temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public SubmitButton getSave() {
		return save;
	}

	public void setSave(SubmitButton save) {
		this.save = save;
	}

	public CheckBox getCopyAddress() {
		return copyAddress;
	}

	public void setCopyAddress(CheckBox copyAddress) {
		this.copyAddress = copyAddress;
	}

	public TextBox geteMailId() {
		return eMailId;
	}

	public void seteMailId(TextBox eMailId) {
		this.eMailId = eMailId;
	}

	public Label geteMailIdError() {
		return eMailIdError;
	}

	public void seteMailIdError(Label eMailIdError) {
		this.eMailIdError = eMailIdError;
	}

}

package com.gwt.sample.client.content.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gwt.sample.client.content.AddressDetails;

public class ContactDetailsEvent extends GwtEvent<ContactDetailsHandler> {

	public static Type<ContactDetailsHandler> TYPE = new Type<ContactDetailsHandler>();
	private AddressDetails temporaryAddress;
	private AddressDetails permanentAddress;
	private TextBox faxNumber;
	private TextBox homeNumber;
	private TextBox workNumber;
	private TextBox mobileNumber;
	private TextBox eMailId;
	private CheckBox copyAddress;

	public ContactDetailsEvent(AddressDetails permanentAddress,
			AddressDetails temporaryAddress, TextBox faxNumber,
			TextBox homeNumber, TextBox workNumber, TextBox mobileNumber,
			TextBox eMailId, CheckBox copyAddress) {
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
		this.faxNumber = faxNumber;
		this.homeNumber = homeNumber;
		this.workNumber = workNumber;
		this.mobileNumber = mobileNumber;
		this.eMailId = eMailId;
		this.copyAddress = copyAddress;
	}

	public TextBox getFaxNumber() {
		return faxNumber;
	}

	public TextBox getHomeNumber() {
		return homeNumber;
	}

	public TextBox getWorkNumber() {
		return workNumber;
	}

	public TextBox getMobileNumber() {
		return mobileNumber;
	}

	public CheckBox getCopyAddress() {
		return copyAddress;
	}

	public AddressDetails getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(AddressDetails temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public AddressDetails getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(AddressDetails permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	protected void dispatch(ContactDetailsHandler handler) {
		handler.onContactDetails(this);
	}

	@Override
	public Type<ContactDetailsHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<ContactDetailsHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source,
			AddressDetails permanentAddress, AddressDetails temporaryAddress,
			TextBox faxNumber, TextBox homeNumber, TextBox workNumber,
			TextBox mobileNumber, TextBox eMailId, CheckBox copyAddress) {
		source.fireEvent(new ContactDetailsEvent(permanentAddress,
				temporaryAddress, faxNumber, homeNumber, workNumber, eMailId,
				mobileNumber, copyAddress));
	}

	public void setFaxNumber(TextBox faxNumber) {
		this.faxNumber = faxNumber;
	}

	public void setHomeNumber(TextBox homeNumber) {
		this.homeNumber = homeNumber;
	}

	public void setWorkNumber(TextBox workNumber) {
		this.workNumber = workNumber;
	}

	public void setMobileNumber(TextBox mobileNumber) {
		this.mobileNumber = mobileNumber;
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

}

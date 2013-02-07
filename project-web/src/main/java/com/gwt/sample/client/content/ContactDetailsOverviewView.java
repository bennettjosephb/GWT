package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ContactDetailsOverviewView extends ViewImpl implements
		ContactDetailsOverviewPresenter.MyView {

	private final Widget widget;

	public interface Binder extends
			UiBinder<Widget, ContactDetailsOverviewView> {
	}

	@Inject
	public ContactDetailsOverviewView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	AddressDetailsOverview permanentAddress;
	@UiField
	AddressDetailsOverview temporaryAddress;
	@UiField
	Label mobileNumber;
	@UiField
	Label workNumber;
	@UiField
	Label homeNumber;
	@UiField
	Label faxNumber;
	@UiField
	Button edit;
	@UiField
	HTMLPanel contactDetailsOverview;
	@UiField
	Label eMailId;

	public Label getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Label mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Label getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(Label workNumber) {
		this.workNumber = workNumber;
	}

	public Label getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(Label homeNumber) {
		this.homeNumber = homeNumber;
	}

	public Label getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(Label faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Button getEdit() {
		return edit;
	}

	public void setEdit(Button edit) {
		this.edit = edit;
	}

	public AddressDetailsOverview getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(AddressDetailsOverview permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public AddressDetailsOverview getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(AddressDetailsOverview temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public HTMLPanel getContactDetailsOverview() {
		return contactDetailsOverview;
	}

	public void setContactDetailsOverview(HTMLPanel contactDetailsOverview) {
		this.contactDetailsOverview = contactDetailsOverview;
	}

	public Label geteMailId() {
		return eMailId;
	}

	public void seteMailId(Label eMailId) {
		this.eMailId = eMailId;
	}
}

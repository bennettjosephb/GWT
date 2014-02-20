package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class BeneficiaryDetailsView extends ViewImpl implements
		BeneficiaryDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, BeneficiaryDetailsView> {
	}

	@Inject
	public BeneficiaryDetailsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
	
	@UiField
	Button next;

	@UiField
	Button cancel;

	@UiField
	Button back;
	
	@UiField
	TextBox firstName;

	@UiField
	TextBox middleName;

	@UiField
	TextBox lastName;

	@UiField
	TextBox addressLine;

	@UiField
	TextBox location;

	@UiField
	TextBox district;

	@UiField
	TextBox state;

	@UiField
	TextBox postCode;

	@UiField
	TextBox country;

	@UiField
	TextBox contactNumber;

	@UiField
	TextBox emailId;

	public TextBox getFirstName() {
		return firstName;
	}

	public void setFirstName(TextBox firstName) {
		this.firstName = firstName;
	}

	public TextBox getMiddleName() {
		return middleName;
	}

	public void setMiddleName(TextBox middleName) {
		this.middleName = middleName;
	}

	public TextBox getLastName() {
		return lastName;
	}

	public void setLastName(TextBox lastName) {
		this.lastName = lastName;
	}

	public TextBox getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(TextBox addressLine) {
		this.addressLine = addressLine;
	}

	public TextBox getLocation() {
		return location;
	}

	public void setLocation(TextBox location) {
		this.location = location;
	}

	public TextBox getDistrict() {
		return district;
	}

	public void setDistrict(TextBox district) {
		this.district = district;
	}

	public TextBox getState() {
		return state;
	}

	public void setState(TextBox state) {
		this.state = state;
	}

	public TextBox getPostCode() {
		return postCode;
	}

	public void setPostCode(TextBox postCode) {
		this.postCode = postCode;
	}

	public TextBox getCountry() {
		return country;
	}

	public void setCountry(TextBox country) {
		this.country = country;
	}

	public TextBox getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(TextBox contactNumber) {
		this.contactNumber = contactNumber;
	}

	public TextBox getEmailId() {
		return emailId;
	}

	public void setEmailId(TextBox emailId) {
		this.emailId = emailId;
	}

	public Button getNext() {
		return next;
	}

	public void setNext(Button next) {
		this.next = next;
	}

	public Button getCancel() {
		return cancel;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}

	public Button getBack() {
		return back;
	}

	public void setBack(Button back) {
		this.back = back;
	}

}

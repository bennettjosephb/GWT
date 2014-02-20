package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CustomerDetailView extends ViewImpl implements
		CustomerDetailPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomerDetailView> {
	}

	@Inject
	public CustomerDetailView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	TextBox firstName;

	@UiField
	TextBox middleName;

	@UiField
	TextBox lastName;

	@UiField
	TextBox addressLine1;

	@UiField
	TextBox addressLine2;

	@UiField
	TextBox postCode;

	@UiField
	TextBox suburb;

	@UiField
	TextBox state;

	@UiField
	TextBox telephoneNumber;

	@UiField
	TextBox mobileNumber;

	@UiField
	TextBox emailId;

	@UiField
	DateBox dateOfBirth;

	@UiField
	TextBox nationality;

	@UiField
	TextBox occupation;

	@UiField
	ListBox purpose;

	@UiField
	Button next;
	
	@UiField
	Button cancel;

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

	public TextBox getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(TextBox addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public TextBox getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(TextBox addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public TextBox getPostCode() {
		return postCode;
	}

	public void setPostCode(TextBox postCode) {
		this.postCode = postCode;
	}

	public TextBox getSuburb() {
		return suburb;
	}

	public void setSuburb(TextBox suburb) {
		this.suburb = suburb;
	}

	public TextBox getState() {
		return state;
	}

	public void setState(TextBox state) {
		this.state = state;
	}

	public TextBox getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(TextBox telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public TextBox getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(TextBox mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public TextBox getEmailId() {
		return emailId;
	}

	public void setEmailId(TextBox emailId) {
		this.emailId = emailId;
	}

	public DateBox getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(DateBox dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public TextBox getNationality() {
		return nationality;
	}

	public void setNationality(TextBox nationality) {
		this.nationality = nationality;
	}

	public TextBox getOccupation() {
		return occupation;
	}

	public void setOccupation(TextBox occupation) {
		this.occupation = occupation;
	}

	public ListBox getPurpose() {
		return purpose;
	}

	public void setPurpose(ListBox purpose) {
		this.purpose = purpose;
	}

	public Widget getWidget() {
		return widget;
	}
}

package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class BeneficiaryBankDetailsView extends ViewImpl implements
		BeneficiaryBankDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends
			UiBinder<Widget, BeneficiaryBankDetailsView> {
	}

	@Inject
	public BeneficiaryBankDetailsView(final Binder binder) {
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
	TextBox bankName;

	@UiField
	TextBox addressLine;

	@UiField
	TextBox city;

	@UiField
	TextBox district;

	@UiField
	TextBox state;

	@UiField
	ListBox accountType;

	@UiField
	TextBox accountName;

	@UiField
	TextBox bsbCode;

	@UiField
	TextBox swiftCode;

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

	public TextBox getBankName() {
		return bankName;
	}

	public void setBankName(TextBox bankName) {
		this.bankName = bankName;
	}

	public TextBox getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(TextBox addressLine) {
		this.addressLine = addressLine;
	}

	public TextBox getCity() {
		return city;
	}

	public void setCity(TextBox city) {
		this.city = city;
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

	public ListBox getAccountType() {
		return accountType;
	}

	public void setAccountType(ListBox accountType) {
		this.accountType = accountType;
	}

	public TextBox getAccountName() {
		return accountName;
	}

	public void setAccountName(TextBox accountName) {
		this.accountName = accountName;
	}

	public TextBox getBsbCode() {
		return bsbCode;
	}

	public void setBsbCode(TextBox bsbCode) {
		this.bsbCode = bsbCode;
	}

	public TextBox getSwiftCode() {
		return swiftCode;
	}

	public void setSwiftCode(TextBox swiftCode) {
		this.swiftCode = swiftCode;
	}

}

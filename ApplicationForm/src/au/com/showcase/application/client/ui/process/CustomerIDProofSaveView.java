package au.com.showcase.application.client.ui.process;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CustomerIDProofSaveView extends ViewImpl implements
		CustomerIDProofSavePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomerIDProofSaveView> {
	}

	@Inject
	public CustomerIDProofSaveView(final Binder binder) {
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
	TextBox idType;

	@UiField
	TextBox idNo;

	@UiField
	TextBox issuedBy;

	@UiField
	TextBox issuedAt;

	@UiField
	DateBox issuedDate;

	@UiField
	DateBox expiryDate;

	@UiField
	TextBox verifiedBy;

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

	public TextBox getIdType() {
		return idType;
	}

	public void setIdType(TextBox idType) {
		this.idType = idType;
	}

	public TextBox getIdNo() {
		return idNo;
	}

	public void setIdNo(TextBox idNo) {
		this.idNo = idNo;
	}

	public TextBox getIssuedBy() {
		return issuedBy;
	}

	public void setIssuedBy(TextBox issuedBy) {
		this.issuedBy = issuedBy;
	}

	public TextBox getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(TextBox issuedAt) {
		this.issuedAt = issuedAt;
	}

	public DateBox getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(DateBox issuedDate) {
		this.issuedDate = issuedDate;
	}

	public DateBox getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(DateBox expiryDate) {
		this.expiryDate = expiryDate;
	}

	public TextBox getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(TextBox verifiedBy) {
		this.verifiedBy = verifiedBy;
	}
}

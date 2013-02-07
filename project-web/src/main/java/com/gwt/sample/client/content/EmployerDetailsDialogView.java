package com.gwt.sample.client.content;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwt.sample.client.common.widget.DatePicker;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.PopupViewImpl;

public class EmployerDetailsDialogView extends PopupViewImpl implements
		EmployerDetailsDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, EmployerDetailsDialogView> {
	}

	@Inject
	public EmployerDetailsDialogView(final EventBus eventBus,
			final Binder binder, DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstantsImpl) {
		super(eventBus);
		fromDate = new DatePicker(dispatchAsync, dateTimeConstantsImpl);
		toDate = new DatePicker(dispatchAsync, dateTimeConstantsImpl);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	DatePicker toDate;
	@UiField(provided = true)
	DatePicker fromDate;
	@UiField
	TextBox role;
	@UiField
	TextBox location;
	@UiField
	TextBox employerName;
	@UiField
	Button save;
	@UiField
	Button cancel;

	public TextBox getRole() {
		return role;
	}

	public void setRole(TextBox role) {
		this.role = role;
	}

	public TextBox getLocation() {
		return location;
	}

	public void setLocation(TextBox location) {
		this.location = location;
	}

	public TextBox getEmployerName() {
		return employerName;
	}

	public void setEmployerName(TextBox employerName) {
		this.employerName = employerName;
	}

	public DatePicker getToDate() {
		return toDate;
	}

	public void setToDate(DatePicker toDate) {
		this.toDate = toDate;
	}

	public DatePicker getFromDate() {
		return fromDate;
	}

	public void setFromDate(DatePicker fromDate) {
		this.fromDate = fromDate;
	}

	public Button getSave() {
		return save;
	}

	public void setSave(Button save) {
		this.save = save;
	}

	public Button getCancel() {
		return cancel;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}
}

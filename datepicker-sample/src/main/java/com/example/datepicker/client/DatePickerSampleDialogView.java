package com.example.datepicker.client;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.PopupViewImpl;

public class DatePickerSampleDialogView extends PopupViewImpl implements
		DatePickerSampleDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends
			UiBinder<Widget, DatePickerSampleDialogView> {
	}

	@Inject
	public DatePickerSampleDialogView(final EventBus eventBus,
			final Binder binder, DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstantsImpl) {
		super(eventBus);
		chooseDate = new com.example.datepicker.client.widget.DatePicker(
				dispatchAsync, dateTimeConstantsImpl);
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	com.example.datepicker.client.widget.DatePicker chooseDate;

	@UiField
	Button close;

	public Button getClose() {
		return close;
	}

	public void setClose(Button close) {
		this.close = close;
	}

	public com.example.datepicker.client.widget.DatePicker getChooseDate() {
		return chooseDate;
	}

	public void setChooseDate(
			com.example.datepicker.client.widget.DatePicker chooseDate) {
		this.chooseDate = chooseDate;
	}

}

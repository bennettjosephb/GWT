package com.example.datepicker.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class DatePickerSampleView extends ViewImpl implements
		DatePickerSamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, DatePickerSampleView> {
	}

	@Inject
	public DatePickerSampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button button;

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

}

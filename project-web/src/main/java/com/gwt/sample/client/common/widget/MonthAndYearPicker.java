package com.gwt.sample.client.common.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.gwt.sample.client.common.action.DatePickerResult;
import com.gwtplatform.dispatch.shared.DispatchAsync;

public class MonthAndYearPicker extends Composite {

	private static MonthAndYearPickerUiBinder uiBinder = GWT
			.create(MonthAndYearPickerUiBinder.class);

	interface MonthAndYearPickerUiBinder extends
			UiBinder<Widget, MonthAndYearPicker> {
	}

	@UiField
	ListBox month;
	@UiField
	ListBox year;

	DateTimeConstantsImpl dateTimeConstants;

	int maxYear = 0;
	private final AsyncCallback<DatePickerResult> datePickerResult = new AsyncCallback<DatePickerResult>() {
		@Override
		public void onSuccess(DatePickerResult result) {
			maxYear = result.getCurrentYear();
			getYear().addItem("Year", "-1");
			for (Integer i = maxYear; i >= maxYear - 120; i--) {
				getYear().addItem(i.toString(), i.toString());
			}
			String months[] = dateTimeConstants.shortMonths();
			getMonth().addItem("Month", "-1");
			for (Integer i = 0; i < months.length; i++) {
				getMonth().addItem(months[i], i.toString());
			}
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};

	public void reset() {
		getYear().addItem("Year", "-1");
		for (Integer i = maxYear; i >= maxYear - 120; i--) {
			getYear().addItem(i.toString(), i.toString());
		}
		String months[] = dateTimeConstants.shortMonths();
		getMonth().addItem("Month", "-1");
		for (Integer i = 0; i < months.length; i++) {
			getMonth().addItem(months[i], i.toString());
		}
	}

	public MonthAndYearPicker() {

	}

	public MonthAndYearPicker(DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstants) {
		initWidget(uiBinder.createAndBindUi(this));
		this.dateTimeConstants = dateTimeConstants;
		com.gwt.sample.client.common.action.DatePicker datePicker = new com.gwt.sample.client.common.action.DatePicker();
		dispatchAsync.execute(datePicker, datePickerResult);
	}

	public ListBox getMonth() {
		return month;
	}

	public void setMonth(ListBox month) {
		this.month = month;
	}

	public ListBox getYear() {
		return year;
	}

	public void setYear(ListBox year) {
		this.year = year;
	}

	public Integer getSelectedMonth(){
		return Integer.valueOf(getMonth().getValue(getMonth().getSelectedIndex()));
	}
	
	public Integer getSelectedYear(){
		return Integer.valueOf(getYear().getValue(getYear().getSelectedIndex()));
	}
	
}

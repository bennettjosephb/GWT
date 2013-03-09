/**
 * 
 */
package com.example.datepicker.client.widget;

import com.example.datepicker.client.widget.action.DatePickerResult;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;

/**
 * @author SONY
 * 
 */
public class DatePicker extends Composite {

	private static DatePickerUiBinder uiBinder = GWT
			.create(DatePickerUiBinder.class);
	// private static DateTimeConstantsImpl dateTimeConstants = GWT
	// .create(DateTimeConstantsImpl.class);

	@UiField
	ListBox month;
	@UiField
	ListBox date;
	@UiField
	ListBox year;

	// @Inject
	// DispatchAsync dispatchAsync;

	interface DatePickerUiBinder extends UiBinder<Widget, DatePicker> {
	}

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
			getDate().addItem("Date", "-1");
			for (Integer i = 1; i <= 31; i++) {
				getDate().addItem(i.toString(), i.toString());
			}
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};

	DateTimeConstantsImpl dateTimeConstants;

	public DatePicker() {
	}

	@Inject
	public DatePicker(DispatchAsync dispatchAsync,
			DateTimeConstantsImpl dateTimeConstants) {
		initWidget(uiBinder.createAndBindUi(this));
		this.dateTimeConstants = dateTimeConstants;
		com.example.datepicker.client.widget.action.DatePicker datePicker = new com.example.datepicker.client.widget.action.DatePicker();
		dispatchAsync.execute(datePicker, datePickerResult);
		Window.alert("Messa`");
		getMonth().addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				updateDateListBox();
			}
		});

		getYear().addChangeHandler(new ChangeHandler() {
			@Override
			public void onChange(ChangeEvent event) {
				updateDateListBox();
			}
		});
	}

	private void updateDateListBox(/* Integer monthIndex, Integer yearIndex */) {
		int dateIndex = Integer.parseInt(getDate().getValue(
				getDate().getSelectedIndex()));
		getDate().clear();
		getDate().addItem("Date", "-1");
		int noOfDays = 0;
		int monthIndex = Integer.parseInt(getMonth().getValue(
				getMonth().getSelectedIndex()));
		int yearIndex = Integer.parseInt(getYear().getValue(
				getYear().getSelectedIndex()));

		if (monthIndex == 0 || monthIndex == 2 || monthIndex == 4
				|| monthIndex == 6 || monthIndex == 7 || monthIndex == 9
				|| monthIndex == 11) {
			noOfDays = 31;
			for (Integer i = 1; i <= noOfDays; i++) {
				getDate().addItem(i.toString(), i.toString());
			}
		} else if (monthIndex == 3 || monthIndex == 5 || monthIndex == 8
				|| monthIndex == 10) {
			noOfDays = 30;
			for (Integer i = 1; i <= noOfDays; i++) {
				getDate().addItem(i.toString(), i.toString());
			}
		} else if (monthIndex == 1) {
			if ((yearIndex % 4 == 0) && (yearIndex % 100 != 0)
					|| (yearIndex % 400 == 0) || yearIndex == -1) {
				noOfDays = 29;
				for (Integer i = 1; i <= noOfDays; i++) {
					getDate().addItem(i.toString(), i.toString());
				}
			} else {
				noOfDays = 28;
				for (Integer i = 1; i <= noOfDays; i++) {
					getDate().addItem(i.toString(), i.toString());
				}
			}
		}
		if (dateIndex != -1 && dateIndex <= noOfDays) {
			getDate().setSelectedIndex(dateIndex);
		}
	}

	public void reset() {
		getYear().clear();
		getMonth().clear();
		getDate().clear();
		getYear().addItem("Year", "-1");
		for (Integer i = maxYear; i >= maxYear - 120; i--) {
			getYear().addItem(i.toString(), i.toString());
		}
		String months[] = dateTimeConstants.shortMonths();
		getMonth().addItem("Month", "-1");
		for (Integer i = 0; i < months.length; i++) {
			getMonth().addItem(months[i], i.toString());
		}
		getDate().addItem("Date", "-1");
		for (Integer i = 1; i <= 31; i++) {
			getDate().addItem(i.toString(), i.toString());
		}
	}

	public String selectedDate() {
		return getDate().getValue(getDate().getSelectedIndex()) + "/"
				+ getYear().getValue(getYear().getSelectedIndex()) + "/"
				+ getYear().getValue(getYear().getSelectedIndex());
	}

	public ListBox getMonth() {
		return month;
	}

	public void setMonth(ListBox month) {
		this.month = month;
	}

	public ListBox getDate() {
		return date;
	}

	public void setDate(ListBox date) {
		this.date = date;
	}

	public ListBox getYear() {
		return year;
	}

	public void setYear(ListBox year) {
		this.year = year;
	}
}

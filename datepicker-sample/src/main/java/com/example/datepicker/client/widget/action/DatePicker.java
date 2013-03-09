package com.example.datepicker.client.widget.action;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.example.datepicker.client.widget.action.DatePickerResult;

public class DatePicker extends ActionImpl<DatePickerResult> {

	public DatePicker() {
	}

	@Override
	public boolean isSecured() {
		return false;
	}
}

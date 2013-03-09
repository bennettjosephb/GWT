package com.example.datepicker.server;

import java.util.Calendar;

import com.example.datepicker.client.widget.action.DatePicker;
import com.example.datepicker.client.widget.action.DatePickerResult;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.server.ExecutionContext;
import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.shared.ActionException;

public class DatePickerActionHandler implements
		ActionHandler<DatePicker, DatePickerResult> {

	@Inject
	public DatePickerActionHandler() {
	}

	public DatePickerResult execute(DatePicker action, ExecutionContext context)
			throws ActionException {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		return new DatePickerResult(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE),
				calendar.get(Calendar.HOUR_OF_DAY),
				calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND),
				calendar.get(Calendar.MILLISECOND));
	}

	public void undo(DatePicker action, DatePickerResult result,
			ExecutionContext context) throws ActionException {
	}

	public Class<DatePicker> getActionType() {
		return DatePicker.class;
	}
}

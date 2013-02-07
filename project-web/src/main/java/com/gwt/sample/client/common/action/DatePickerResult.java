package com.gwt.sample.client.common.action;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.Integer;

public class DatePickerResult implements Result {

	private Integer currentYear;
	private Integer currentMonth;
	private Integer currentDate;
	private Integer currentTime;
	private Integer currentMinute;
	private Integer currentSecond;
	private Integer currentMilliSecond;

	@SuppressWarnings("unused")
	private DatePickerResult() {
		// For serialization only
	}

	public DatePickerResult(Integer currentYear, Integer currentMonth,
			Integer currentDate, Integer currentTime, Integer currentMinute,
			Integer currentSecond, Integer currentMilliSecond) {
		this.currentYear = currentYear;
		this.currentMonth = currentMonth;
		this.currentDate = currentDate;
		this.currentTime = currentTime;
		this.currentMinute = currentMinute;
		this.currentSecond = currentSecond;
		this.currentMilliSecond = currentMilliSecond;
	}

	public Integer getCurrentYear() {
		return currentYear;
	}

	public Integer getCurrentMonth() {
		return currentMonth;
	}

	public Integer getCurrentDate() {
		return currentDate;
	}

	public Integer getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(Integer currentTime) {
		this.currentTime = currentTime;
	}

	public Integer getCurrentMinute() {
		return currentMinute;
	}

	public void setCurrentMinute(Integer currentMinute) {
		this.currentMinute = currentMinute;
	}

	public Integer getCurrentSecond() {
		return currentSecond;
	}

	public void setCurrentSecond(Integer currentSecond) {
		this.currentSecond = currentSecond;
	}

	public Integer getCurrentMilliSecond() {
		return currentMilliSecond;
	}

	public void setCurrentMilliSecond(Integer currentMilliSecond) {
		this.currentMilliSecond = currentMilliSecond;
	}
}

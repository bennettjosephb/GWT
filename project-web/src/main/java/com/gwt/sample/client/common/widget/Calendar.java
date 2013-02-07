package com.gwt.sample.client.common.widget;

//import com.google.gwt.core.client.GWT;
//import com.google.gwt.uibinder.client.UiBinder;
//import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.CalendarModel;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.google.gwt.user.datepicker.client.DefaultCalendarView;

public class Calendar extends DatePicker {

//	private static CalendarUiBinder uiBinder = GWT
//			.create(CalendarUiBinder.class);
//
//	interface CalendarUiBinder extends UiBinder<Widget, Calendar> {
//	}

	public Calendar() {
        super(new MonthAndYearSelector(),new DefaultCalendarView(),new 
CalendarModel()) ; 
//		initWidget(uiBinder.createAndBindUi(this));
        MonthAndYearSelector monthSelector = (MonthAndYearSelector) 
this.getMonthSelector() ; 
        monthSelector.setPicker(this) ; 
        monthSelector.setModel(this.getModel()) ; 
	}

 public void refreshComponents() { 
         super.refreshAll() ; 
 } 

}

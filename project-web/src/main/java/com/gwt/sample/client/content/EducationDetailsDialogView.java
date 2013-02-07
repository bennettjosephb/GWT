package com.gwt.sample.client.content;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwt.sample.client.common.widget.DatePicker;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.PopupViewImpl;

public class EducationDetailsDialogView extends PopupViewImpl implements
		EducationDetailsDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends
			UiBinder<Widget, EducationDetailsDialogView> {
	}

	@Inject
	public EducationDetailsDialogView(final EventBus eventBus,
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
	ListBox type;
	@UiField
	TextBox specialization;
	@UiField
	TextBox institute;
	@UiField
	TextBox courseName;
	@UiField
	Button save;
	@UiField
	Button cancel;

	public ListBox getLocation() {
		return type;
	}

	public void setLocation(ListBox type) {
		this.type = type;
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

	public TextBox getSpecialization() {
		return specialization;
	}

	public void setSpecialization(TextBox specialization) {
		this.specialization = specialization;
	}

	public TextBox getInstitute() {
		return institute;
	}

	public void setInstitute(TextBox institute) {
		this.institute = institute;
	}

	public TextBox getCourseName() {
		return courseName;
	}

	public void setCourseName(TextBox courseName) {
		this.courseName = courseName;
	}
}

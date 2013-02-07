package com.gwt.sample.client.content;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwt.sample.client.common.widget.DatePicker;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

public class EducationDetailsDialogPresenter extends
		PresenterWidget<EducationDetailsDialogPresenter.MyView> {

	public interface MyView extends PopupView {
		public ListBox getLocation();

		public void setLocation(ListBox location);

		public DatePicker getToDate();

		public void setToDate(DatePicker toDate);

		public DatePicker getFromDate();

		public void setFromDate(DatePicker fromDate);

		public Button getSave();

		public void setSave(Button save);

		public Button getCancel();

		public void setCancel(Button cancel);

		public TextBox getSpecialization();

		public void setSpecialization(TextBox specialization);

		public TextBox getInstitute();

		public void setInstitute(TextBox institute);

		public TextBox getCourseName();

		public void setCourseName(TextBox courseName);
	}

	@Inject
	public EducationDetailsDialogPresenter(final EventBus eventBus,
			final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
		addClickHandlers();
	}

	private void addClickHandlers() {
		getView().getSave().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getView().hide();
			}
		});
		getView().getCancel().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				getView().hide();
			}
		});
	}

	@Override
	protected void onHide() {
		getView().getFromDate().reset();
		getView().getToDate().reset();
		super.onHide();
	}

	@Override
	protected void onReset() {
		getView().getFromDate().reset();
		getView().getToDate().reset();
		super.onReset();
	}

	@Override
	protected void onReveal() {
		getView().getFromDate().reset();
		getView().getToDate().reset();
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}

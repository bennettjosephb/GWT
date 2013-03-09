package com.example.datepicker.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;

public class DatePickerSampleDialogPresenter extends
		PresenterWidget<DatePickerSampleDialogPresenter.MyView> {

	public interface MyView extends PopupView {
		public Button getClose();

		public void setClose(Button close);

		public com.example.datepicker.client.widget.DatePicker getChooseDate();

		public void setChooseDate(
				com.example.datepicker.client.widget.DatePicker chooseDate);
	}

	@Inject
	public DatePickerSampleDialogPresenter(final EventBus eventBus,
			final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
		getView().getClose().addClickHandler(
		// new ClickHandler() {
		// @Override
		// public void onClick(ClickEvent event) {
		// getView().hide();
		// }
		// }
				new ClickHandler() {

					public void onClick(ClickEvent event) {
						getView().hide();
					}
				});
	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}

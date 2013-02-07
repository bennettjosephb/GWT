package com.gwt.sample.client.content;

import com.gwt.sample.client.common.widget.DatePicker;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public class EmployerDetailsDialogPresenter extends
		PresenterWidget<EmployerDetailsDialogPresenter.MyView> {

	public interface MyView extends PopupView {
		public TextBox getRole();

		public void setRole(TextBox role);

		public TextBox getLocation();

		public void setLocation(TextBox location);

		public TextBox getEmployerName();

		public void setEmployerName(TextBox employerName);

		public DatePicker getToDate();

		public void setToDate(DatePicker toDate);

		public DatePicker getFromDate();

		public void setFromDate(DatePicker fromDate);

		public Button getSave();

		public void setSave(Button save);

		public Button getCancel();

		public void setCancel(Button cancel);
	}

	@Inject
	public EmployerDetailsDialogPresenter(final EventBus eventBus,
			final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
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

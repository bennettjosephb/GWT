package com.example.datepicker.client;

import com.example.datepicker.client.place.NameTokens;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class DatePickerSamplePresenter
		extends
		Presenter<DatePickerSamplePresenter.MyView, DatePickerSamplePresenter.MyProxy> {

	public interface MyView extends View {
		public Button getButton();

		public void setButton(Button button);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.root)
	public interface MyProxy extends ProxyPlace<DatePickerSamplePresenter> {
	}

	@Inject
	DatePickerSampleDialogPresenter datePickerSampleDialogPresenter;

	@Inject
	public DatePickerSamplePresenter(final EventBus eventBus,
			final MyView view, final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		getView().getButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				addToPopupSlot(datePickerSampleDialogPresenter);
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

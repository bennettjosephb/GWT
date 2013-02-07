package com.gwt.sample.client.content;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwt.sample.client.content.ContentContainerPresenter;

public class EmployerPresenter extends
		Presenter<EmployerPresenter.MyView, EmployerPresenter.MyProxy> {

	public interface MyView extends View {

		public FlowPanel getEmployerDetailsList();

		public void setEmployerDetailsList(FlowPanel employerDetailsList);

		public Button getAddEmployer();

		public void setAddEmployer(Button addEmployer);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.employer)
	public interface MyProxy extends ProxyPlace<EmployerPresenter> {
	}

	@Inject
	EmployerDetailsDialogPresenter employerDetailsDialogPresenter;

	@Inject
	public EmployerPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this,
				ContentContainerPresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		// getView().getEmployerDetailsList().add(w)
		addClickHandlers();
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

	private void addClickHandlers() {
		getView().getAddEmployer().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				addToPopupSlot(employerDetailsDialogPresenter);
			}
		});
	}
}

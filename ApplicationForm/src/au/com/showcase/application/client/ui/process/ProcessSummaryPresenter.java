package au.com.showcase.application.client.ui.process;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;

import au.com.showcase.application.client.place.NameTokens;

import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.google.inject.Inject;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.BeneficiaryBankDetailsEvent;
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent;
import au.com.showcase.application.client.ui.process.event.BeneficiaryBankDetailsEvent.BeneficiaryBankDetailsHandler;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent;

public class ProcessSummaryPresenter
		extends
		Presenter<ProcessSummaryPresenter.MyView, ProcessSummaryPresenter.MyProxy>
		implements BeneficiaryBankDetailsHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public Button getBack();

		public void setBack(Button back);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.processsum)
	public interface MyProxy extends ProxyPlace<ProcessSummaryPresenter> {
	}

	@Inject
	public ProcessSummaryPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, PlaceManager placeManager) {
		super(eventBus, view, proxy);
		this.placeManager = placeManager;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ScrollTestPresenter.MAIN_CONTENT_SLOT,
				this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		addRegisteredHandler(BeneficiaryBankDetailsEvent.getType(), this);

		getView().getNext().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ProcessingSummaryEvent processingSummaryEvent = new ProcessingSummaryEvent();
				ProcessSummaryPresenter.this.fireEvent(processingSummaryEvent);
			}
		});
		getView().getBack().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				History.back();
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

	@ProxyEvent
	@Override
	public void onBeneficiaryBankDetails(BeneficiaryBankDetailsEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.processsum));
	}

	final private PlaceManager placeManager;
}

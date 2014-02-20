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
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent.ProcessingSummaryHandler;

public class DealReceiptPresenter extends
		Presenter<DealReceiptPresenter.MyView, DealReceiptPresenter.MyProxy>
		implements ProcessingSummaryHandler {

	public interface MyView extends View {
		public Button getFinish();

		public void setFinish(Button next);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.receipt)
	public interface MyProxy extends ProxyPlace<DealReceiptPresenter> {
	}

	@Inject
	public DealReceiptPresenter(final EventBus eventBus, final MyView view,
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
		addRegisteredHandler(ProcessingSummaryEvent.getType(), this);
		getView().getFinish().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				DealFinishEvent dealFinishEvent = new DealFinishEvent();
				DealReceiptPresenter.this.fireEvent(dealFinishEvent);
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
	public void onProcessingSummary(ProcessingSummaryEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.receipt));
	}

	final private PlaceManager placeManager;
}

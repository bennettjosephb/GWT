package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent;
import au.com.showcase.application.client.ui.process.event.CustomerIDProofEvent;
import au.com.showcase.application.client.ui.process.event.CustomerIDProofEvent.CustomerIDProofHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.annotations.ProxyEvent;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class BeneficiaryDetailsPresenter
		extends
		Presenter<BeneficiaryDetailsPresenter.MyView, BeneficiaryDetailsPresenter.MyProxy>
		implements CustomerIDProofHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public Button getBack();

		public void setBack(Button back);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.beneficiary)
	public interface MyProxy extends ProxyPlace<BeneficiaryDetailsPresenter> {
	}

	@Inject
	public BeneficiaryDetailsPresenter(final EventBus eventBus,
			final MyView view, final MyProxy proxy, PlaceManager placeManager) {
		super(eventBus, view, proxy);
		this.placeManager = placeManager;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ScrollTestPresenter.MAIN_CONTENT_SLOT,
				this);
		addRegisteredHandler(CustomerIDProofEvent.getType(), this);

	}

	@Override
	protected void onBind() {
		super.onBind();
		addRegisteredHandler(CustomerIDProofEvent.getType(), this);
		getView().getNext().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				BeneficiaryDetailsEvent beneficiaryDetailsEvent = new BeneficiaryDetailsEvent();
				BeneficiaryDetailsPresenter.this
						.fireEvent(beneficiaryDetailsEvent);
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
	public void onCustomerIDProof(CustomerIDProofEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.beneficiary));
	}

	final private PlaceManager placeManager;
}

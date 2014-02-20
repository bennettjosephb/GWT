package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.CustomerDetailsEvent;
import au.com.showcase.application.client.ui.process.event.CustomerDetailsEvent.CustomerDetailsHandler;
import au.com.showcase.application.client.ui.process.event.CustomerIDProofEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent.DealFinishHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.datepicker.client.DateBox;
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

public class CustomerIDProofSavePresenter
		extends
		Presenter<CustomerIDProofSavePresenter.MyView, CustomerIDProofSavePresenter.MyProxy>
		implements CustomerDetailsHandler, DealFinishHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public Button getBack();

		public void setBack(Button back);

		public TextBox getIdType();

		public void setIdType(TextBox idType);

		public TextBox getIdNo();

		public void setIdNo(TextBox idNo);

		public TextBox getIssuedBy();

		public void setIssuedBy(TextBox issuedBy);

		public TextBox getIssuedAt();

		public void setIssuedAt(TextBox issuedAt);

		public DateBox getIssuedDate();

		public void setIssuedDate(DateBox issuedDate);

		public DateBox getExpiryDate();

		public void setExpiryDate(DateBox expiryDate);

		public TextBox getVerifiedBy();

		public void setVerifiedBy(TextBox verifiedBy);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.idproof)
	public interface MyProxy extends ProxyPlace<CustomerIDProofSavePresenter> {
	}

	@Inject
	public CustomerIDProofSavePresenter(final EventBus eventBus,
			final MyView view, final MyProxy proxy, PlaceManager placeManager) {
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
		addRegisteredHandler(CustomerDetailsEvent.getType(), this);
		addRegisteredHandler(DealFinishEvent.getType(), this);
		getView().getNext().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				CustomerIDProofEvent customerIDProofEvent = new CustomerIDProofEvent();
				CustomerIDProofSavePresenter.this
						.fireEvent(customerIDProofEvent);
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
	public void onCustomerDetails(CustomerDetailsEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.idproof));
	}

	final private PlaceManager placeManager;

	@ProxyEvent
	@Override
	public void onDealFinish(DealFinishEvent event) {
		clearForm();
	}

	private void clearForm() {
		getView().getIdType().setText("");
		getView().getIdNo().setText("");
		getView().getIssuedBy().setText("");
		getView().getIssuedAt().setText("");
		getView().getIssuedDate().setValue(null);
		getView().getExpiryDate().setValue(null);
		getView().getVerifiedBy().setText("");
	}
}

package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent;
import au.com.showcase.application.client.ui.process.event.CustomerIDProofEvent;
import au.com.showcase.application.client.ui.process.event.CustomerIDProofEvent.CustomerIDProofHandler;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent.DealFinishHandler;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent.ProcessingSummaryHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
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
		implements CustomerIDProofHandler, DealFinishHandler,
		ProcessingSummaryHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public Button getBack();

		public void setBack(Button back);

		public TextBox getFirstName();

		public void setFirstName(TextBox firstName);

		public TextBox getMiddleName();

		public void setMiddleName(TextBox middleName);

		public TextBox getLastName();

		public void setLastName(TextBox lastName);

		public TextBox getAddressLine();

		public void setAddressLine(TextBox addressLine);

		public TextBox getLocation();

		public void setLocation(TextBox location);

		public TextBox getDistrict();

		public void setDistrict(TextBox district);

		public TextBox getState();

		public void setState(TextBox state);

		public TextBox getPostCode();

		public void setPostCode(TextBox postCode);

		public TextBox getCountry();

		public void setCountry(TextBox country);

		public TextBox getContactNumber();

		public void setContactNumber(TextBox contactNumber);

		public TextBox getEmailId();

		public void setEmailId(TextBox emailId);

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
		addRegisteredHandler(DealFinishEvent.getType(), this);
		addRegisteredHandler(ProcessingSummaryEvent.getType(), this);

		getView().getNext().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				BeneficiaryDetailsEvent beneficiaryDetailsEvent = new BeneficiaryDetailsEvent();
				BeneficiaryDetailsPresenter.this
						.fireEvent(beneficiaryDetailsEvent);
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
	public void onCustomerIDProof(CustomerIDProofEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.beneficiary));
	}

	final private PlaceManager placeManager;

	@ProxyEvent
	@Override
	public void onDealFinish(DealFinishEvent event) {
//		clearForm();
	}

	@ProxyEvent
	@Override
	public void onProcessingSummary(ProcessingSummaryEvent event) {
		clearForm();
	}

	private void clearForm() {
		getView().getFirstName().setText("");

		getView().getMiddleName().setText("");

		getView().getLastName().setText("");

		getView().getAddressLine().setText("");

		getView().getLocation().setText("");

		getView().getDistrict().setText("");

		getView().getState().setText("");

		getView().getPostCode().setText("");

		getView().getCountry().setText("");

		getView().getContactNumber().setText("");

		getView().getEmailId().setText("");

	}
}

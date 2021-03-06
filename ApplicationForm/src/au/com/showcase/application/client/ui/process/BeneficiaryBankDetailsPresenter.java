package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.BeneficiaryBankDetailsEvent;
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent;
import au.com.showcase.application.client.ui.process.event.BeneficiaryDetailsEvent.BeneficiaryDetailsHandler;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent.DealFinishHandler;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent.ProcessingSummaryHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
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

public class BeneficiaryBankDetailsPresenter
		extends
		Presenter<BeneficiaryBankDetailsPresenter.MyView, BeneficiaryBankDetailsPresenter.MyProxy>
		implements BeneficiaryDetailsHandler, DealFinishHandler,
		ProcessingSummaryHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public Button getBack();

		public void setBack(Button back);

		public TextBox getBankName();

		public void setBankName(TextBox bankName);

		public TextBox getAddressLine();

		public void setAddressLine(TextBox addressLine);

		public TextBox getCity();

		public void setCity(TextBox city);

		public TextBox getDistrict();

		public void setDistrict(TextBox district);

		public TextBox getState();

		public void setState(TextBox state);

		public ListBox getAccountType();

		public void setAccountType(ListBox accountType);

		public TextBox getAccountName();

		public void setAccountName(TextBox accountName);

		public TextBox getBsbCode();

		public void setBsbCode(TextBox bsbCode);

		public TextBox getSwiftCode();

		public void setSwiftCode(TextBox swiftCode);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.bankdetails)
	public interface MyProxy extends
			ProxyPlace<BeneficiaryBankDetailsPresenter> {
	}

	@Inject
	public BeneficiaryBankDetailsPresenter(final EventBus eventBus,
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
		addRegisteredHandler(BeneficiaryDetailsEvent.getType(), this);
		addRegisteredHandler(ProcessingSummaryEvent.getType(), this);
		getView().getNext().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				BeneficiaryBankDetailsEvent beneficiaryBankDetailsEvent = new BeneficiaryBankDetailsEvent();
				BeneficiaryBankDetailsPresenter.this
						.fireEvent(beneficiaryBankDetailsEvent);
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
	public void onBeneficiaryDetails(BeneficiaryDetailsEvent event) {
		placeManager.revealPlace(new PlaceRequest(NameTokens.bankdetails));
	}

	final private PlaceManager placeManager;

	@ProxyEvent
	@Override
	public void onDealFinish(DealFinishEvent event) {
		// clearForm();
	}

	private void clearForm() {
		getView().getBankName().setText("");

		getView().getAddressLine().setText("");

		getView().getCity().setText("");

		getView().getDistrict().setText("");

		getView().getState().setText("");

		getView().getAccountType();

		getView().getAccountName().setText("");

		getView().getBsbCode().setText("");

		getView().getSwiftCode().setText("");
	}

	@ProxyEvent
	@Override
	public void onProcessingSummary(ProcessingSummaryEvent event) {
		clearForm();
	}
}

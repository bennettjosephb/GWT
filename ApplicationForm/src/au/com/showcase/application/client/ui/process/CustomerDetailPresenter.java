package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.CustomerDetailsEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent;
import au.com.showcase.application.client.ui.process.event.ProcessingSummaryEvent;
import au.com.showcase.application.client.ui.process.event.DealFinishEvent.DealFinishHandler;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
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

public class CustomerDetailPresenter
		extends
		Presenter<CustomerDetailPresenter.MyView, CustomerDetailPresenter.MyProxy>
		implements DealFinishHandler {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);

		public TextBox getFirstName();

		public void setFirstName(TextBox firstName);

		public TextBox getMiddleName();

		public void setMiddleName(TextBox middleName);

		public TextBox getLastName();

		public void setLastName(TextBox lastName);

		public TextBox getAddressLine1();

		public void setAddressLine1(TextBox addressLine1);

		public TextBox getAddressLine2();

		public void setAddressLine2(TextBox addressLine2);

		public TextBox getPostCode();

		public void setPostCode(TextBox postCode);

		public TextBox getSuburb();

		public void setSuburb(TextBox suburb);

		public TextBox getState();

		public void setState(TextBox state);

		public TextBox getTelephoneNumber();

		public void setTelephoneNumber(TextBox telephoneNumber);

		public TextBox getMobileNumber();

		public void setMobileNumber(TextBox mobileNumber);

		public TextBox getEmailId();

		public void setEmailId(TextBox emailId);

		public DateBox getDateOfBirth();

		public void setDateOfBirth(DateBox dateOfBirth);

		public TextBox getNationality();

		public void setNationality(TextBox nationality);

		public TextBox getOccupation();

		public void setOccupation(TextBox occupation);

		public ListBox getPurpose();

		public void setPurpose(ListBox purpose);

		public Widget getWidget();
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.custdetail1)
	public interface MyProxy extends ProxyPlace<CustomerDetailPresenter> {
	}

	private EventBus eventBus;

	@Inject
	public CustomerDetailPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, PlaceManager placeManager) {
		super(eventBus, view, proxy);
		this.eventBus = eventBus;
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
		addRegisteredHandler(DealFinishEvent.getType(), this);
		getView().getNext().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				CustomerDetailsEvent customerDetailsEvent = new CustomerDetailsEvent();
				CustomerDetailPresenter.this.eventBus
						.fireEvent(customerDetailsEvent);
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
	public void onDealFinish(DealFinishEvent event) {
		clearForm();
		placeManager.revealPlace(new PlaceRequest(NameTokens.custdetail1));
	}

	final private PlaceManager placeManager;

	private void clearForm() {
		getView().getFirstName().setText("");
		getView().getMiddleName().setText("");
		getView().getLastName().setText("");
		getView().getAddressLine1().setText("");
		getView().getAddressLine2().setText("");
		getView().getPostCode().setText("");
		getView().getSuburb().setText("");
		getView().getState().setText("");
		getView().getTelephoneNumber().setText("");
		getView().getMobileNumber().setText("");
		getView().getEmailId().setText("");
		getView().getDateOfBirth().setValue(null);
		getView().getNationality().setText("");
		getView().getOccupation().setText("");
		// getView().getPurpose().setText("");
	}
}

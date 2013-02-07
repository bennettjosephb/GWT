package com.gwt.sample.client.content;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwt.sample.client.content.action.ContactDetails;
import com.gwt.sample.client.content.action.ContactDetailsResult;
import com.gwt.sample.client.content.event.ContactDetailsEvent;
import com.gwt.sample.client.content.event.ContactDetailsHandler;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class ContactDetailsPresenter
		extends
		Presenter<ContactDetailsPresenter.MyView, ContactDetailsPresenter.MyProxy> {

	private EventBus eventBus;

	@Inject
	PlaceManager placeManager;

	@Inject
	DispatchAsync dispatchAsync;

	private ContactDetailsHandler contactDetailsHandler = new ContactDetailsHandler() {

		@Override
		public void onContactDetails(ContactDetailsEvent event) {
			ContactDetails contactDetails = new ContactDetails(event
					.getTemporaryAddress().getStreet1().getText(), event
					.getTemporaryAddress().getStreet2().getText(), event
					.getTemporaryAddress().getCity().getText(), event
					.getTemporaryAddress().getState().getText(), event
					.getTemporaryAddress().getZipCode().getText(), event
					.getTemporaryAddress().getCountry().getText(), event
					.getPermanentAddress().getStreet1().getText(), event
					.getPermanentAddress().getStreet2().getText(), event
					.getPermanentAddress().getCity().getText(), event
					.getPermanentAddress().getState().getText(), event
					.getPermanentAddress().getZipCode().getText(), event
					.getPermanentAddress().getCountry().getText(), event
					.getFaxNumber().getText(), event.getHomeNumber().getText(),
					event.getMobileNumber().getText(), event.geteMailId()
							.getText(), event.getWorkNumber().getText(), event
							.getCopyAddress().getText());
			dispatchAsync.execute(contactDetails, contactDetailsResult);

		}
	};

	public interface MyView extends View {

		public TextBox getMobileNumber();

		public void setMobileNumber(TextBox mobileNumber);

		public TextBox getWorkNumber();

		public void setWorkNumber(TextBox workNumber);

		public TextBox getHomeNumber();

		public void setHomeNumber(TextBox homeNumber);

		public TextBox getFaxNumber();

		public void setFaxNumber(TextBox faxNumber);

		public Label getMobileNumberError();

		public void setMobileNumberError(Label mobileNumberError);

		public Label getWorkNumberError();

		public void setWorkNumberError(Label workNumberError);

		public Label getHomeNumberError();

		public void setHomeNumberError(Label homeNumberError);

		public Label getFaxNumberError();

		public void setFaxNumberError(Label faxNumberError);

		public AddressDetails getPermanentAddress();

		public void setPermanentAddress(AddressDetails permanentAddressPanel);

		public AddressDetails getTemporaryAddress();

		public void setTemporaryAddress(AddressDetails temporaryAddressPanel);

		public SubmitButton getSave();

		public void setSave(SubmitButton save);

		public CheckBox getCopyAddress();

		public void setCopyAddress(CheckBox copyAddress);

		public TextBox geteMailId();

		public void seteMailId(TextBox eMailId);

		public Label geteMailIdError();

		public void seteMailIdError(Label eMailIdError);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.contact)
	public interface MyProxy extends ProxyPlace<ContactDetailsPresenter> {
	}

	@Inject
	public ContactDetailsPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
		this.eventBus = eventBus;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this,
				ContentContainerPresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {
		super.onBind();

		getView().getSave().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ContactDetailsEvent contactDetailsEvent = new ContactDetailsEvent(
						getView().getPermanentAddress(), getView()
								.getTemporaryAddress(), getView()
								.getFaxNumber(), getView().getHomeNumber(),
						getView().getWorkNumber(), getView().getMobileNumber(),
						getView().geteMailId(), getView().getCopyAddress());
				eventBus.fireEvent(contactDetailsEvent);

			}
		});

		eventBus.addHandler(ContactDetailsEvent.TYPE, contactDetailsHandler);
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

	private final AsyncCallback<ContactDetailsResult> contactDetailsResult = new AsyncCallback<ContactDetailsResult>() {

		@Override
		public void onSuccess(ContactDetailsResult result) {
			PlaceRequest request = new PlaceRequest(
					NameTokens.getContactoverview());
			placeManager.revealPlace(request);
		}

		@Override
		public void onFailure(Throwable caught) {
			Window.alert("BBBB" + caught.getMessage());
		}
	};

}

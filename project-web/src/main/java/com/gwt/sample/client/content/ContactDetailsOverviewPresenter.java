package com.gwt.sample.client.content;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.gwt.sample.client.content.action.ContactDetailsOverview;
import com.gwt.sample.client.content.action.ContactDetailsOverviewResult;
import com.gwt.sample.client.content.event.ContactDetailsOverviewEvent;
import com.gwt.sample.client.content.event.ContactDetailsOverviewHandler;
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

public class ContactDetailsOverviewPresenter
		extends
		Presenter<ContactDetailsOverviewPresenter.MyView, ContactDetailsOverviewPresenter.MyProxy> {

	private EventBus eventBus;

	@Inject
	PlaceManager placeManager;

	@Inject
	DispatchAsync dispatchAsync;

	private ContactDetailsOverviewHandler contactDetailsOverviewHandler = new ContactDetailsOverviewHandler() {

		@Override
		public void onContactDetailsOverview(ContactDetailsOverviewEvent event) {
			ContactDetailsOverview contactDetailsOverview = new ContactDetailsOverview();
			dispatchAsync.execute(contactDetailsOverview, contactDetailsResult);
		}
	};

	public interface MyView extends View {
		public Label getMobileNumber();

		public void setMobileNumber(Label mobileNumber);

		public Label getWorkNumber();

		public void setWorkNumber(Label workNumber);

		public Label getHomeNumber();

		public void setHomeNumber(Label homeNumber);

		public Label getFaxNumber();

		public void setFaxNumber(Label faxNumber);

		public Button getEdit();

		public void setEdit(Button edit);

		public AddressDetailsOverview getPermanentAddress();

		public void setPermanentAddress(AddressDetailsOverview permanentAddress);

		public AddressDetailsOverview getTemporaryAddress();

		public void setTemporaryAddress(AddressDetailsOverview temporaryAddress);

		public HTMLPanel getContactDetailsOverview();

		public void setContactDetailsOverview(HTMLPanel contactDetailsOverview);

		public Label geteMailId();

		public void seteMailId(Label eMailId);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.contactoverview)
	public interface MyProxy extends
			ProxyPlace<ContactDetailsOverviewPresenter> {
	}

	@Inject
	public ContactDetailsOverviewPresenter(final EventBus eventBus,
			final MyView view, final MyProxy proxy) {
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
		getView().getEdit().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				PlaceRequest request = new PlaceRequest(NameTokens.getContact());
				placeManager.revealPlace(request);
			}
		});

		getView().getContactDetailsOverview().addAttachHandler(new Handler() {

			@Override
			public void onAttachOrDetach(AttachEvent event) {
				ContactDetailsOverviewEvent contactDetailsOverviewEvent = new ContactDetailsOverviewEvent();
				eventBus.fireEvent(contactDetailsOverviewEvent);

			}
		});
		eventBus.addHandler(ContactDetailsOverviewEvent.TYPE,
				contactDetailsOverviewHandler);

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

	private final AsyncCallback<ContactDetailsOverviewResult> contactDetailsResult = new AsyncCallback<ContactDetailsOverviewResult>() {

		@Override
		public void onSuccess(ContactDetailsOverviewResult result) {
			updateFields(result);
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};

	private void updateFields(ContactDetailsOverviewResult result) {
		getView().getPermanentAddress().getStreet1()
				.setText(result.getPermanentStreet1());
		getView().getPermanentAddress().getStreet2()
				.setText(result.getPermanentStreet2());
		getView().getPermanentAddress().getCity()
				.setText(result.getPermanentCity());
		getView().getPermanentAddress().getState()
				.setText(result.getPermanentState());
		getView().getPermanentAddress().getCountry()
				.setText(result.getPermanentCountry());
		getView().getPermanentAddress().getZipCode()
				.setText(result.getPermanentZipCode());
		getView().getTemporaryAddress().getStreet1()
				.setText(result.getTemporaryStreet1());
		getView().getTemporaryAddress().getStreet2()
				.setText(result.getTemporaryStreet2());
		getView().getTemporaryAddress().getCity()
				.setText(result.getTemporaryCity());
		getView().getTemporaryAddress().getState()
				.setText(result.getTemporaryState());
		getView().getTemporaryAddress().getCountry()
				.setText(result.getTemporaryCountry());
		getView().getTemporaryAddress().getZipCode()
				.setText(result.getTemporaryZipCode());
		getView().getFaxNumber().setText(result.getFaxNumber());
		getView().getHomeNumber().setText(result.getHomeNumber());
		getView().getMobileNumber().setText(result.getMobileNumber());
		getView().geteMailId().setText(result.geteMailId());
		getView().getWorkNumber().setText(result.getWorkNumber());

	}
}

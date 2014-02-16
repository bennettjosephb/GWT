package au.com.showcase.application.client.ui.process;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;
import au.com.showcase.application.client.ui.process.event.CustomerDetailsEvent;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class CustomerDetailPresenter
		extends
		Presenter<CustomerDetailPresenter.MyView, CustomerDetailPresenter.MyProxy> {

	public interface MyView extends View {
		public Button getNext();

		public void setNext(Button next);

		public Button getCancel();

		public void setCancel(Button cancel);
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
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ScrollTestPresenter.MAIN_CONTENT_SLOT,
				this);
	}

	@Override
	protected void onBind() {
		super.onBind();
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
}

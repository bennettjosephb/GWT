package com.gwt.sample.client.login;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwt.sample.client.login.event.LoginEvent;
import com.gwt.sample.client.login.event.LoginEvent.LoginHandler;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
//import com.google.gwt.http.client.RequestBuilder;
//import com.gwtplatform.mvp.client.proxy.PlaceRequest;

public class LoginPresenter extends
		Presenter<LoginPresenter.MyView, LoginPresenter.MyProxy> {

	private EventBus eventBus;

	@Inject
	PlaceManager placeManager;

	@Inject
	DispatchAsync dispatchAsync;

	private LoginHandler loginHandler = new LoginHandler() {

		@Override
		public void onLogin(LoginEvent event) {
			LoginAction loginAction = new LoginAction(event.getUsername(), event.getPassword());
			dispatchAsync.execute(loginAction, loginActionResult);

//			PlaceRequest request = new PlaceRequest(NameTokens.getContent());
//			placeManager.revealPlace(request);
		}
	};

	public interface MyView extends View {
		String getUsername();

		String getPassword();

		TextBox getUsernameTextBox();

		TextBox getPasswordTextBox();

		SubmitButton getSubmitButton();
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.login)
	public interface MyProxy extends ProxyPlace<LoginPresenter> {
	}

	@Inject
	public LoginPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
		this.eventBus = eventBus;
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		getView().getSubmitButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				LoginEvent loginEvent = new LoginEvent(getView().getUsername(),
						getView().getPassword());
				eventBus.fireEvent(loginEvent);
			}
		});

		eventBus.addHandler(LoginEvent.TYPE, loginHandler);

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

	private final AsyncCallback<LoginActionResult> loginActionResult = new AsyncCallback<LoginActionResult>() {

		@Override
		public void onSuccess(LoginActionResult result) {
		//	Window.alert(result.getSessionId());
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};
}

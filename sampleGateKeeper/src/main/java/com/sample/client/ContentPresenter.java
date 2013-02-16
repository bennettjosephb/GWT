package com.sample.client;

import com.google.gwt.user.client.ui.Label;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.sample.client.event.UserEvent;
import com.sample.client.event.UserEvent.UserHandler;
import com.sample.client.place.NameTokens;

public class ContentPresenter extends
		Presenter<ContentPresenter.MyView, ContentPresenter.MyProxy> {
	
	private EventBus eventBus;

	public interface MyView extends View {
		Label getSampleLabel();
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.profile)
	public interface MyProxy extends ProxyPlace<ContentPresenter> {
	}

	private UserHandler userEventHandler = new UserHandler() {
		public void onUser(UserEvent event) {
			getView().getSampleLabel().setText(event.getFirstName() +" :: "+ event.getLastName());
		}
	}; 
	
	@Inject
	public ContentPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
		this.eventBus = eventBus;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ContainerPresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		eventBus.addHandler(UserEvent.TYPE, userEventHandler);
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

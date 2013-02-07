package com.gwt.sample.client.content;

import com.google.web.bindery.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class ProfileOverviewPresenter
		extends
		Presenter<ProfileOverviewPresenter.MyView, ProfileOverviewPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.profile)
	public interface MyProxy extends ProxyPlace<ProfileOverviewPresenter> {
	}

	@Inject
	public ProfileOverviewPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ContentContainerPresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
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

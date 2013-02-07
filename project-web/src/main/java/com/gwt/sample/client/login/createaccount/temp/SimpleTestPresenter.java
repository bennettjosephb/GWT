package com.gwt.sample.client.login.createaccount.temp;

import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class SimpleTestPresenter extends
		Presenter<SimpleTestPresenter.MyView, SimpleTestPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> MAIN_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@ProxyCodeSplit
	public interface MyProxy extends Proxy<SimpleTestPresenter> {
	}

	@Inject
	SimpleContentPresenter contentPresenter;

	@Inject
	public SimpleTestPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
		setInSlot(MAIN_CONTENT_SLOT, contentPresenter);
	}

	@Override
	protected void onBind() {
		super.onBind();
	}
}

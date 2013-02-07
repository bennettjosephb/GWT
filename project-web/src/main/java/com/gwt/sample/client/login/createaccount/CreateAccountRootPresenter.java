package com.gwt.sample.client.login.createaccount;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class CreateAccountRootPresenter
		extends
		Presenter<CreateAccountRootPresenter.MyView, CreateAccountRootPresenter.MyProxy> {

	@ContentSlot
	public static final Type<RevealContentHandler<?>> MAIN_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@ContentSlot
	public static final Type<RevealContentHandler<?>> HEADER_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@ContentSlot
	public static final Type<RevealContentHandler<?>> FOOTER_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@Inject
	CreateAccountHeaderPresenter headerPresenter;

	@Inject
	CreateAccountFooterPresenter footerPresenter;

	public interface MyView extends View {
	}

	@ProxyCodeSplit
	public interface MyProxy extends Proxy<CreateAccountRootPresenter> {
	}

	@Inject
	public CreateAccountRootPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
		setInSlot(HEADER_CONTENT_SLOT, headerPresenter);
		setInSlot(FOOTER_CONTENT_SLOT, footerPresenter);
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

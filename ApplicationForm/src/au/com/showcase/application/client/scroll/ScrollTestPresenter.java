package au.com.showcase.application.client.scroll;

import au.com.showcase.application.client.FooterPresenter;
import au.com.showcase.application.client.HeaderPresenter;
import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class ScrollTestPresenter extends
		Presenter<ScrollTestPresenter.MyView, ScrollTestPresenter.MyProxy> {

	public interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> MAIN_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@ContentSlot
	public static final Type<RevealContentHandler<?>> FOOTER_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@ContentSlot
	public static final Type<RevealContentHandler<?>> HEADER_CONTENT_SLOT = new Type<RevealContentHandler<?>>();

	@Inject
	HeaderPresenter headerPresenter;

	@Inject
	FooterPresenter footerPresenter;

	@ProxyCodeSplit
	@NameToken(NameTokens.scroll)
	public interface MyProxy extends ProxyPlace<ScrollTestPresenter> {
	}

	@Inject
	public ScrollTestPresenter(final EventBus eventBus, final MyView view,
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

package au.com.showcase.application.client;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Frame;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class PDFViewerPresenter extends
		Presenter<PDFViewerPresenter.MyView, PDFViewerPresenter.MyProxy> {

	public interface MyView extends View {
		public Frame getUrl();

		public void setUrl(Frame url);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<PDFViewerPresenter> {
	}

	@Inject
	public PDFViewerPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
//		Window.alert("" + GWT.getHostPageBaseURL()+" ::: "+ GWT.getModuleBaseURL() +" ::: "+GWT.getModuleName());
		Window.alert("" + GWT.getHostPageBaseURL() +"SampleReport");
		getView().getUrl().setUrl(GWT.getHostPageBaseURL() +"SampleReport");
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

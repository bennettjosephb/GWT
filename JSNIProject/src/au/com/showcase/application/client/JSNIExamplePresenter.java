package au.com.showcase.application.client;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class JSNIExamplePresenter extends
		Presenter<JSNIExamplePresenter.MyView, JSNIExamplePresenter.MyProxy> {

	public interface MyView extends View {
		public Button getClickThis();

		public void setClickThis(Button clickThis);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<JSNIExamplePresenter> {
	}

	@Inject
	public JSNIExamplePresenter(final EventBus eventBus, final MyView view,
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

		getView().getClickThis().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				alert("THANKS");
				alert("" + badExample());
			}
		});
	}

	public static native String badExample() /*-{
		return "Not A Number";
	}-*/;

	public static native void alert(String msg) /*-{
		$wnd.drawChart(msg);
	}-*/;

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

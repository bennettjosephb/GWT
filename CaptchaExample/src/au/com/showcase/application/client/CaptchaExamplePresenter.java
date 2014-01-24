package au.com.showcase.application.client;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class CaptchaExamplePresenter
		extends
		Presenter<CaptchaExamplePresenter.MyView, CaptchaExamplePresenter.MyProxy> {

	public interface MyView extends View {
		public Button getClickButton();

		public void setClickButton(Button clickButton);

		public HTMLPanel getRoot();

		public void setRoot(HTMLPanel root);

		public Image getImageRes();

		public void setImageRes(Image imageRes);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<CaptchaExamplePresenter> {
	}

	@Inject
	public CaptchaExamplePresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Inject
	DispatchAsync dispatchAsync;

	@Override
	protected void onBind() {
		super.onBind();

		getView().getClickButton().addClickHandler(new ClickHandler() {

			ImageAction imageAction = new ImageAction("Simpla");

			@Override
			public void onClick(ClickEvent event) {
				dispatchAsync.execute(imageAction, contactDetailsResult);
			}
		});
	}

	private final AsyncCallback<ImageActionResult> contactDetailsResult = new AsyncCallback<ImageActionResult>() {

		@Override
		public void onFailure(Throwable caught) {

		}

		@Override
		public void onSuccess(ImageActionResult result) {
			// getView().getImageRes().setUrl("images/icon.jpg");
			getView().getRoot().add(new Image(result.getImage()));
			//RootPanel.get().add(new Image(result.getImage()));
		}

	};

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

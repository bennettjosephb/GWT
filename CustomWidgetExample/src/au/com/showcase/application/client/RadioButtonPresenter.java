package au.com.showcase.application.client;

import java.util.Date;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class RadioButtonPresenter extends
		Presenter<RadioButtonPresenter.MyView, RadioButtonPresenter.MyProxy> {

	public interface MyView extends View {
		public Button getButton();

		public void setButton(Button button);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.radio)
	public interface MyProxy extends ProxyPlace<RadioButtonPresenter> {
	}

	@Inject
	public RadioButtonPresenter(final EventBus eventBus, final MyView view,
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

		getView().getButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				DataSet dataSet = new DataSet();

				dataSet.setDate(new Date());

				dataSet.setFlfl(1234f);

				dataSet.setI(123);

				dataSet.setOne("One");

				TestingHandler testingHandler = new TestingHandler(dataSet);
				
				GetData getData = new GetData("HAI");

				Window.alert("1");
				dispatchAsync.execute(testingHandler, contactDetailsResult);
				Window.alert("2");

			}
		});
	}

	private final AsyncCallback<TestingHandlerResult> contactDetailsResult = new AsyncCallback<TestingHandlerResult>() {

		@Override
		public void onSuccess(TestingHandlerResult result) {
			Window.alert("RESULT" + result.getResultdate().getName());
		}

		@Override
		public void onFailure(Throwable caught) {
			Window.alert("PROBLEM" + caught.getMessage());
		}
	};

	private final AsyncCallback<GetDataResult> getDataResult = new AsyncCallback<GetDataResult>() {

		@Override
		public void onSuccess(GetDataResult result) {
			Window.alert("RESULT" + result.getResult());
		}

		@Override
		public void onFailure(Throwable caught) {
			Window.alert("PROBLEM" + caught.getMessage());
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

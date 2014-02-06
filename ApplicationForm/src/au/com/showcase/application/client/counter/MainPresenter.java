package au.com.showcase.application.client.counter;

import au.com.showcase.application.client.place.NameTokens;
import au.com.showcase.application.shared.counter.PendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransactionResult;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class MainPresenter extends
		Presenter<MainPresenter.MyView, MainPresenter.MyProxy> {

	public interface MyView extends View {

		public DataGrid<PendingTransaction> getPendingTransaction();

		public void setPendingTransaction(
				DataGrid<PendingTransaction> pendingTransaction);

		public Button getButton();

		public void setButton(Button button);

		public ListDataProvider<PendingTransaction> getDataProvider();

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.counter)
	public interface MyProxy extends ProxyPlace<MainPresenter> {
	}

	@Inject
	public MainPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Inject
	DispatchAsync dispatchAsync;

	private final AsyncCallback<GetPendingTransactionResult> pendingTransactionsResult = new AsyncCallback<GetPendingTransactionResult>() {
		@Override
		public void onFailure(Throwable caught) {
		}

		@Override
		public void onSuccess(GetPendingTransactionResult result) {
			getView().getDataProvider().getList().clear();
			getView().getDataProvider().getList()
					.addAll(result.getPendingTransactions());
			getView().getPendingTransaction().redraw();
		}
	};

	@Override
	protected void onBind() {
		super.onBind();
		getView().getPendingTransaction().setWidth("100%");
		GetPendingTransaction regenerateCaptcha = new GetPendingTransaction(
				"Hai");
		//
		getView().getButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				GetPendingTransaction regenerateCaptcha = new GetPendingTransaction(
						"Hai");
				dispatchAsync.execute(regenerateCaptcha,
						pendingTransactionsResult);

			}
		});

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

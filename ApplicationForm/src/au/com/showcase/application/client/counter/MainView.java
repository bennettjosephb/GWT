package au.com.showcase.application.client.counter;

import au.com.showcase.application.shared.counter.PendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransactionResult;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.ViewImpl;

public class MainView extends ViewImpl implements MainPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, MainView> {
	}

	@Inject
	public MainView(final Binder binder, DispatchAsync dispatchAsync) {

		Column<PendingTransaction, Number> serialNoColumn = new Column<PendingTransaction, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(PendingTransaction object) {
				return dataProvider.getList().indexOf(object) + 1;
			}
		};

		final DateTimeFormat dateFormat = DateTimeFormat
				.getFormat("dd-MM-yy hh:mm aaa");
		Column<PendingTransaction, String> transactionDateTime = new Column<PendingTransaction, String>(
				new TextCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return dateFormat.format(object.getTransactionTime());
			}
		};

		Column<PendingTransaction, String> usernameColumn = new Column<PendingTransaction, String>(
				new TextCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getUsername();
			}
		};

		Column<PendingTransaction, String> transactionRefNoColumn = new Column<PendingTransaction, String>(
				new TextCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getTransactionRefNo();
			}
		};

		Column<PendingTransaction, String> transactionTypeColumn = new Column<PendingTransaction, String>(
				new TextCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getTransactionType();
			}
		};

		Column<PendingTransaction, String> counterRefNoColumn = new Column<PendingTransaction, String>(
				new TextCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getTransactionRefNo();
			}
		};

		Column<PendingTransaction, Number> totalAmountColumn = new Column<PendingTransaction, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(PendingTransaction object) {
				return object.getTotalAmount();
			}
		};

		Column<PendingTransaction, Number> pendingAmountColumn = new Column<PendingTransaction, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(PendingTransaction object) {
				return object.getPendingAmount();
			}
		};

		Column<PendingTransaction, Number> balanceAmountColumn = new Column<PendingTransaction, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(PendingTransaction object) {
				return object.getBalance();
			}
		};

		Column<PendingTransaction, String> collectionColumn = new Column<PendingTransaction, String>(
				new ButtonCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getTransactionRefNo();
			}
		};

		Column<PendingTransaction, String> paymentColumn = new Column<PendingTransaction, String>(
				new ButtonCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return object.getUsername();
			}
		};

		pendingTransaction.addColumn(serialNoColumn, "S/N");
		pendingTransaction.addColumn(transactionDateTime, "Date");
		pendingTransaction.addColumn(usernameColumn, "Username");
		pendingTransaction.addColumn(counterRefNoColumn, "Counter Ref No");
		pendingTransaction.addColumn(transactionRefNoColumn,
				"Transaction Ref No");
		pendingTransaction.addColumn(transactionTypeColumn, "Transaction Type");
		pendingTransaction.addColumn(totalAmountColumn, "Total Amount");
		pendingTransaction.addColumn(pendingAmountColumn, "Pending Amount");
		pendingTransaction.addColumn(balanceAmountColumn, "Balance Amount");
		pendingTransaction.addColumn(collectionColumn, "Collection");
		pendingTransaction.addColumn(paymentColumn, "Payment");

		pendingTransaction.setColumnWidth(serialNoColumn, "70px");
		pendingTransaction.setColumnWidth(transactionDateTime, "150px");

		// pendingTransaction.setVisible(false);

		// for (int i = 0; i < 10; i++) {
		// PendingTransaction pendingTransaction = new PendingTransaction();
		//
		// pendingTransaction.setBalance(1.1f);
		// pendingTransaction.setTransactionTime(new Date());
		//
		// dataProvider.getList().add(pendingTransaction);
		//
		// }

		// dataProvider.addDataDisplay(this.pendingTransaction);

		GetPendingTransaction regenerateCaptcha = new GetPendingTransaction(
				"Hai");
		dispatchAsync.execute(regenerateCaptcha, pendingTransactionsResult);

		widget = binder.createAndBindUi(this);
	}

	// @Inject
	// DispatchAsync dispatchAsync;

	private final AsyncCallback<GetPendingTransactionResult> pendingTransactionsResult = new AsyncCallback<GetPendingTransactionResult>() {
		@Override
		public void onFailure(Throwable caught) {
		}

		@Override
		public void onSuccess(GetPendingTransactionResult result) {
			dataProvider.getList().addAll(result.getPendingTransactions());
			dataProvider.addDataDisplay(pendingTransaction);
			pendingTransaction.redraw();
		}
	};

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	DataGrid<PendingTransaction> pendingTransaction = new DataGrid<PendingTransaction>(
			15);

	@UiField
	Button button;

	public DataGrid<PendingTransaction> getPendingTransaction() {
		return pendingTransaction;
	}

	public void setPendingTransaction(
			DataGrid<PendingTransaction> pendingTransaction) {
		this.pendingTransaction = pendingTransaction;
	}

	private final ListDataProvider<PendingTransaction> dataProvider = new ListDataProvider<PendingTransaction>();

	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}

	public ListDataProvider<PendingTransaction> getDataProvider() {
		return dataProvider;
	}

}

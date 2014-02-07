package au.com.showcase.application.client.counter;

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.shared.counter.PendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransaction;
import au.com.showcase.application.shared.counter.action.GetPendingTransactionResult;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.dev.util.collect.HashSet;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
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

				return "Collection";
			}
		};

		Column<PendingTransaction, String> paymentColumn = new Column<PendingTransaction, String>(
				new ButtonCell()) {
			@Override
			public String getValue(PendingTransaction object) {
				return "Payment";
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

		pendingTransaction.setColumnWidth(serialNoColumn, "20px");
		pendingTransaction.setColumnWidth(transactionDateTime, "75px");
		pendingTransaction.setColumnWidth(usernameColumn, "65px");
		pendingTransaction.setColumnWidth(counterRefNoColumn, "75px");
		pendingTransaction.setColumnWidth(transactionRefNoColumn, "80px");
		pendingTransaction.setColumnWidth(transactionTypeColumn, "50px");
		pendingTransaction.setColumnWidth(totalAmountColumn, "50px");
		pendingTransaction.setColumnWidth(pendingAmountColumn, "50px");
		pendingTransaction.setColumnWidth(balanceAmountColumn, "50px");
		pendingTransaction.setColumnWidth(collectionColumn, "45px");
		pendingTransaction.setColumnWidth(paymentColumn, "75px");

		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();

		collectionColumn.setCellStyleNames(ApplicationResources.INSTANCE
				.registrationFormStyle().buttonCellStyle());

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
			int counter = 1;

//			HashSet<Date> transactionTimeSet = new HashSet<Date>();
//			Set<String> usernameSet = new HashSet<String>();
//			Set<String> counterRefNoSet = new HashSet<String>();
//			Set<String> transactionRefNoSet = new HashSet<String>();
//			Set<String> transactionTypeSet = new HashSet<String>();
//			Set<Float> totalAmountSet = new HashSet<Float>();
//			Set<Float> pendingAmountSet = new HashSet<Float>();
//			Set<Float> balanceAmountSet = new HashSet<Float>();

			for (Iterator<PendingTransaction> iterator = result
					.getPendingTransactions().iterator(); iterator.hasNext();) {
				PendingTransaction pendingTransaction = (PendingTransaction) iterator
						.next();
//				if (!transactionTimeSet.contains(pendingTransaction
//						.getTransactionTime())) {
//					dateList.addItem(""
//							+ dateFormat.format(pendingTransaction
//									.getTransactionTime()));
//					transactionTimeSet.add(pendingTransaction
//							.getTransactionTime());
//				}
//				
//				if (!transactionRefNoSet.contains(pendingTransaction
//						.getTransactionRefNo())) {
//					transactionRefNoList.addItem(""
//							+ pendingTransaction
//									.getTransactionRefNo());
//					transactionRefNoSet.add(pendingTransaction
//							.getTransactionRefNo());
//				}
				
				balanceAmountList.addItem("" + pendingTransaction.getBalance());
				serialNoList.addItem("" + counter++);
				usernameList.addItem("" + pendingTransaction.getUsername());
				counterRefNoList.addItem(""
						+ pendingTransaction.getCounterRefNo());
				transactionRefNoList.addItem(""
						+ pendingTransaction.getTransactionRefNo());
				transactionTypeList.addItem(""
						+ pendingTransaction.getTransactionType());
				totalAmountList.addItem(""
						+ pendingTransaction.getTotalAmount());
				pendingAmountList.addItem(""
						+ pendingTransaction.getPendingAmount());
				balanceAmountList.addItem("" + pendingTransaction.getBalance());
			}
			dataProvider.getList().addAll(result.getPendingTransactions());
			dataProvider.addDataDisplay(pendingTransaction);
			pendingTransaction.redraw();
		}
	};

	final DateTimeFormat dateFormat = DateTimeFormat
			.getFormat("dd-MM-yy hh:mm aaa");

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	DataGrid<PendingTransaction> pendingTransaction = new DataGrid<PendingTransaction>(
			15);

	@UiField
	Button button;

	@UiField
	ListBox serialNoList;

	@UiField
	ListBox dateList;

	@UiField
	ListBox usernameList;

	@UiField
	ListBox counterRefNoList;

	@UiField
	ListBox transactionRefNoList;

	@UiField
	ListBox transactionTypeList;

	@UiField
	ListBox totalAmountList;

	@UiField
	ListBox pendingAmountList;

	@UiField
	ListBox balanceAmountList;

	@UiField
	ListBox collectionList;

	@UiField
	ListBox paymentList;

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

	public ListBox getSerialNoList() {
		return serialNoList;
	}

	public void setSerialNoList(ListBox serialNoList) {
		this.serialNoList = serialNoList;
	}

	public ListBox getDateList() {
		return dateList;
	}

	public void setDateList(ListBox dateList) {
		this.dateList = dateList;
	}

	public ListBox getUsernameList() {
		return usernameList;
	}

	public void setUsernameList(ListBox usernameList) {
		this.usernameList = usernameList;
	}

	public ListBox getCounterRefNoList() {
		return counterRefNoList;
	}

	public void setCounterRefNoList(ListBox counterRefNoList) {
		this.counterRefNoList = counterRefNoList;
	}

	public ListBox getTransactionRefNoList() {
		return transactionRefNoList;
	}

	public void setTransactionRefNoList(ListBox transactionRefNoList) {
		this.transactionRefNoList = transactionRefNoList;
	}

	public ListBox getTransactionTypeList() {
		return transactionTypeList;
	}

	public void setTransactionTypeList(ListBox transactionTypeList) {
		this.transactionTypeList = transactionTypeList;
	}

	public ListBox getTotalAmountList() {
		return totalAmountList;
	}

	public void setTotalAmountList(ListBox totalAmountList) {
		this.totalAmountList = totalAmountList;
	}

	public ListBox getPendingAmountList() {
		return pendingAmountList;
	}

	public void setPendingAmountList(ListBox pendingAmountList) {
		this.pendingAmountList = pendingAmountList;
	}

	public ListBox getBalanceAmountList() {
		return balanceAmountList;
	}

	public void setBalanceAmountList(ListBox balanceAmountList) {
		this.balanceAmountList = balanceAmountList;
	}

	public ListBox getCollectionList() {
		return collectionList;
	}

	public void setCollectionList(ListBox collectionList) {
		this.collectionList = collectionList;
	}

	public ListBox getPaymentList() {
		return paymentList;
	}

	public void setPaymentList(ListBox paymentList) {
		this.paymentList = paymentList;
	}

}
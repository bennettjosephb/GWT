package au.com.showcase.application.client;

import java.util.Date;

import au.com.showcase.application.shared.counter.PendingTransaction;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;

public class PendingTransactionLayout extends Composite {

	private static PendingTransactionUiBinder uiBinder = GWT
			.create(PendingTransactionUiBinder.class);

	interface PendingTransactionUiBinder extends
			UiBinder<Widget, PendingTransactionLayout> {
	}

	public PendingTransactionLayout() {
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

			@Override
			public void render(Context context, PendingTransaction object,
					SafeHtmlBuilder sb) {
				if (!(object.getBalance() > 0.5f)) {
					super.render(context, object, sb);
				}
			}
		};

		pendingTransaction.addColumn(serialNoColumn, "S/N");
		pendingTransaction.addColumn(transactionDateTime, "Date");
		pendingTransaction.addColumn(usernameColumn, "Username");
		pendingTransaction.addColumn(counterRefNoColumn, "Counter Ref No");
		pendingTransaction.addColumn(transactionRefNoColumn,
				"Transaction Ref No");
		pendingTransaction.addColumn(transactionTypeColumn, "Type");
		pendingTransaction.addColumn(totalAmountColumn, "Total Amount");
		pendingTransaction.addColumn(pendingAmountColumn, "Pending Amount");
		pendingTransaction.addColumn(balanceAmountColumn, "Balance Amount");
		pendingTransaction.addColumn(collectionColumn, "Collection");
		pendingTransaction.addColumn(paymentColumn, "Payment");

		pendingTransaction.setColumnWidth(serialNoColumn, "19px");
		pendingTransaction.setColumnWidth(transactionDateTime, "65px");
		pendingTransaction.setColumnWidth(usernameColumn, "60px");
		pendingTransaction.setColumnWidth(counterRefNoColumn, "64px");
		pendingTransaction.setColumnWidth(transactionRefNoColumn, "65px");
		pendingTransaction.setColumnWidth(transactionTypeColumn, "20px");
		pendingTransaction.setColumnWidth(totalAmountColumn, "43px");
		pendingTransaction.setColumnWidth(pendingAmountColumn, "50px");
		pendingTransaction.setColumnWidth(balanceAmountColumn, "50px");
		pendingTransaction.setColumnWidth(collectionColumn, "45px");
		pendingTransaction.setColumnWidth(paymentColumn, "75px");

		for (int i = 0; i < 10; i++) {
			PendingTransaction pendingTransaction = new PendingTransaction();

			if(i%2 ==0){
			pendingTransaction.setBalance(1.1f);
			} else {
				pendingTransaction.setBalance(0.1f);
			}
			pendingTransaction.setTransactionTime(new Date());

			dataProvider.getList().add(pendingTransaction);

		}

		dataProvider.addDataDisplay(pendingTransaction);

		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField(provided = true)
	DataGrid<PendingTransaction> pendingTransaction = new DataGrid<PendingTransaction>(
			15);

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

	public DataGrid<PendingTransaction> getPendingTransaction() {
		return pendingTransaction;
	}

	public void setPendingTransaction(
			DataGrid<PendingTransaction> pendingTransaction) {
		this.pendingTransaction = pendingTransaction;
	}

	private final ListDataProvider<PendingTransaction> dataProvider = new ListDataProvider<PendingTransaction>();

	public ListDataProvider<PendingTransaction> getDataProvider() {
		return dataProvider;
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
}

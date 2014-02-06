package au.com.showcase.application.client.counter;

import java.util.Date;

import au.com.showcase.application.shared.account.PendingTransaction;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.i18n.shared.DateTimeFormat;
import com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class MainView extends ViewImpl implements MainPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, MainView> {
	}

	@Inject
	public MainView(final Binder binder) {

		Column<PendingTransaction, Number> serialNoColumn = new Column<PendingTransaction, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(PendingTransaction object) {
				return dataProvider.getList().indexOf(object) + 1;
			}
		};

		DateTimeFormat dateFormat = DateTimeFormat
				.getFormat(PredefinedFormat.DATE_TIME_LONG);
		Column<PendingTransaction, Date> transactionDateTime = new Column<PendingTransaction, Date>(
				new DateCell()) {
			@Override
			public Date getValue(PendingTransaction object) {
				return object.getTransactionTime();
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

		pendingTransaction.addColumn(serialNoColumn, "Serial No");
		pendingTransaction.addColumn(transactionDateTime, "Date");
		pendingTransaction.addColumn(usernameColumn, "Username");
		pendingTransaction.addColumn(counterRefNoColumn, "Counter Ref No");
		pendingTransaction.addColumn(transactionRefNoColumn,
				"Transaction Ref No");
		pendingTransaction.addColumn(transactionTypeColumn, "Transaction Type");
		pendingTransaction.addColumn(totalAmountColumn, "Total Amount");
		pendingTransaction.addColumn(pendingAmountColumn, "Pending Amount");
		pendingTransaction.addColumn(balanceAmountColumn, "Balance Amount");

		//pendingTransaction.setVisible(false);

		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	DataGrid<PendingTransaction> pendingTransaction = new DataGrid<PendingTransaction>(
			15);

	public DataGrid<PendingTransaction> getPendingTransaction() {
		return pendingTransaction;
	}

	public void setPendingTransaction(
			DataGrid<PendingTransaction> pendingTransaction) {
		this.pendingTransaction = pendingTransaction;
	}

	private final ListDataProvider<PendingTransaction> dataProvider = new ListDataProvider<PendingTransaction>();

}

package au.com.showcase.application.client;

import java.util.Comparator;

import au.com.showcase.application.shared.Address;
import au.com.showcase.application.shared.ContactInfo;

import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.DataGrid;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class DataGridView extends ViewImpl implements DataGridPresenter.MyView {

	private final Widget widget;

	private TableRes tableRes = GWT.create(TableRes.class);

	private final ListDataProvider<ContactInfo> dataProvider = new ListDataProvider<ContactInfo>();

	public interface Binder extends UiBinder<Widget, DataGridView> {
	}

	@Inject
	public DataGridView(final Binder binder) {
		widget = binder.createAndBindUi(this);

		for (int i = 0; i < 200; i++) {

			ContactInfo contactInfo = new ContactInfo();

			Address address = new Address();
			address.setArea(i);
			address.setFamilyCount(i);
			address.setHouseNo("HOUSE NO" + i);
			address.setStreet1("STREET 1" + 0);
			address.setStreet2("STREET 2" + 0);

			contactInfo.setAddress(address);
			contactInfo.setAge(Float.valueOf(i));
			contactInfo.setFirstName("FIRST NAME" + i);
			contactInfo.setLastName("LAST NAME" + i);
			contactInfo.setHeight(Float.valueOf(i));
			contactInfo.setFlagLocation("FLAG" + i);

			dataProvider.getList().add(contactInfo);

		}

		TextColumn<ContactInfo> firstNameColumn = new TextColumn<ContactInfo>() {
			@Override
			public String getValue(ContactInfo object) {
				return object.getFirstName();
			}

			@Override
			public String getCellStyleNames(Context context, ContactInfo object) {
				return object.getAge() % 2 == 0 ? tableRes.cellTableStyle()
						.cellTableCellHigh() : tableRes.cellTableStyle()
						.cellTableCellLow();
			}
		};

		Column<ContactInfo, String> lastNameColumn = new Column<ContactInfo, String>(
				new TextCell()) {
			@Override
			public String getValue(ContactInfo object) {
				return object.getLastName();
			}

		};

		Column<ContactInfo, Number> ageColumn = new Column<ContactInfo, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(ContactInfo object) {
				return object.getAge();
			}

		};

		Column<ContactInfo, Number> heightColumn = new Column<ContactInfo, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(ContactInfo object) {
				return object.getHeight();
			}

		};

		Column<ContactInfo, Number> areaColumn = new Column<ContactInfo, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(ContactInfo object) {
				return object.getAddress().getArea();
			}

		};

		Column<ContactInfo, Number> countColumn = new Column<ContactInfo, Number>(
				new NumberCell()) {
			@Override
			public Number getValue(ContactInfo object) {
				return object.getAddress().getFamilyCount();
			}

		};

		Column<ContactInfo, String> houseNoColumn = new Column<ContactInfo, String>(
				new TextCell()) {
			@Override
			public String getValue(ContactInfo object) {
				return object.getAddress().getHouseNo();
			}

		};

		Column<ContactInfo, String> street1Column = new Column<ContactInfo, String>(
				new TextCell()) {
			@Override
			public String getValue(ContactInfo object) {
				return object.getAddress().getStreet1();
			}

		};

		Column<ContactInfo, String> street2Column = new Column<ContactInfo, String>(
				new TextCell()) {
			@Override
			public String getValue(ContactInfo object) {
				return object.getAddress().getStreet2();
			}

		};

		// firstNameColumn.setSortable(true);
		lastNameColumn.setSortable(true);
		areaColumn.setSortable(true);
		ageColumn.setSortable(true);
		countColumn.setSortable(true);
		heightColumn.setSortable(true);
		houseNoColumn.setSortable(true);
		street1Column.setSortable(true);
		street2Column.setSortable(true);

		// Attach a column sort handler to the ListDataProvider to sort the
		// list.
		ListHandler<ContactInfo> sortHandler = new ListHandler<ContactInfo>(
				dataProvider.getList());

		dataGrid.addColumnSortHandler(sortHandler);

		dataProvider.addDataDisplay(dataGrid);

		TextInputCell textInputCell = new TextInputCell();

		dataGrid.addColumn(firstNameColumn, new Header<String>(textInputCell) {

			@Override
			public String getValue() {
				return "Hai";
			}
		});
		dataGrid.addColumn(lastNameColumn, "LAST NAME");
		dataGrid.addColumn(ageColumn, "AGE");
		dataGrid.addColumn(areaColumn, "AREA");
		dataGrid.addColumn(countColumn, "FAMILY COUNT");
		dataGrid.addColumn(heightColumn, "HEIGHT");
		dataGrid.addColumn(houseNoColumn, "HOUSE NO");
		dataGrid.addColumn(street1Column, "STREET 1");
		dataGrid.addColumn(street2Column, "STREET 2");
		// dataGrid.addColumn(flag, "FLAG");

		sortHandler.setComparator(firstNameColumn,
				new Comparator<ContactInfo>() {

					@Override
					public int compare(ContactInfo o1, ContactInfo o2) {
						return o1.getFirstName().compareTo(o2.getFirstName());
					}
				});

		sortHandler.setComparator(lastNameColumn,
				new Comparator<ContactInfo>() {

					@Override
					public int compare(ContactInfo o1, ContactInfo o2) {
						return o1.getLastName().compareTo(o2.getLastName());
					}
				});

		sortHandler.setComparator(ageColumn, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getAge().compareTo(o2.getAge());
			}
		});

		sortHandler.setComparator(areaColumn, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getAddress().getArea()
						.compareTo(o2.getAddress().getArea());
			}
		});

		sortHandler.setComparator(heightColumn, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getHeight().compareTo(o2.getHeight());
			}
		});

		sortHandler.setComparator(houseNoColumn, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getAddress().getHouseNo()
						.compareTo(o2.getAddress().getHouseNo());
			}
		});

		sortHandler.setComparator(street1Column, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getAddress().getStreet1()
						.compareTo(o2.getAddress().getStreet1());
			}
		});

		sortHandler.setComparator(street2Column, new Comparator<ContactInfo>() {

			@Override
			public int compare(ContactInfo o1, ContactInfo o2) {
				return o1.getAddress().getStreet2()
						.compareTo(o2.getAddress().getStreet2());
			}
		});
		
		Window.alert(""+dataProvider.getList().size());
		
		dataGrid.setRowCount(50);

		dataGrid.setPageSize(dataProvider.getList().size());

	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	DataGrid<ContactInfo> dataGrid = new DataGrid<ContactInfo>(100, tableRes);

}

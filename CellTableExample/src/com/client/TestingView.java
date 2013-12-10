package com.client;

import java.util.Comparator;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.cell.client.NumberCell;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.cell.client.TextInputCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.DoubleClickEvent;
import com.google.gwt.event.dom.client.DoubleClickHandler;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.client.SafeHtmlTemplates.Template;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.Header;
import com.google.gwt.user.cellview.client.RowHoverEvent;
import com.google.gwt.user.cellview.client.RowHoverEvent.Handler;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.CellPreviewEvent;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SingleSelectionModel;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.shared.Address;
import com.shared.ContactInfo;

public class TestingView extends ViewImpl implements TestingPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TestingView> {
	}

	private TableRes tableRes = GWT.create(TableRes.class);

	public class CustomHeader extends Header<ContactInfo> {

		public CustomHeader() {
			super(new SearchCell());
		}

		public String getName() {
			return null;
		}

		@Override
		public ContactInfo getValue() {
			return null;
		}

		@Override
		public void render(Context context, SafeHtmlBuilder sb) {
			super.render(context, sb);
		}
	}

	public static class SearchCell extends AbstractCell<ContactInfo> {

		interface Template extends SafeHtmlTemplates {
			@Template("<div style=\"\">{0}</div>")
			SafeHtml header(String columnName);

			@Template("<div style=\"\"><input type=\"text\" value=\"{0}\"/></div>")
			SafeHtml input(String value);
		}

		private static Template template;
		private boolean isChanged = false;

		public SearchCell() {
			super("keydown", "keyup", "change", "blur");
			if (template == null) {
				template = GWT.create(Template.class);
			}
		}

		@Override
		public void render(com.google.gwt.cell.client.Cell.Context context,
				ContactInfo value, SafeHtmlBuilder sb) {
			sb.append(template.input("Hai 2"));
			sb.append(template.header("Hai 1"));
		}

		@Override
		public void onBrowserEvent(Context context, Element parent,
				ContactInfo value, NativeEvent event,
				ValueUpdater<ContactInfo> valueUpdater) {

			if ("keyup".equals(event.getType())) {
				System.out
						.println("YOU ARE PRESSING THE KEYS NOW IN SEARCH BOX");

			}

			if (value == null)
				return;
			super.onBrowserEvent(context, parent, value, event, valueUpdater);
			if ("keyup".equals(event.getType())) {
				isChanged = true;
				InputElement elem = getInputElement(parent);
				value.setLastName(elem.getValue());
				if (valueUpdater != null)
					valueUpdater.update(value);
			} else if ("blur".equals(event.getType())) {
				isChanged = false;
			}
		}

		protected InputElement getInputElement(Element parent) {
			Element elem = parent.getElementsByTagName("input").getItem(0);
			assert (elem.getClass() == InputElement.class);
			return elem.cast();
		}
	}

	@Inject
	public TestingView(final Binder binder) {

		for (int i = 0; i < 20; i++) {

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

			dataProvider.getList().add(contactInfo);

		}

		cellTable = new CellTable<ContactInfo>(15, tableRes);

		SimplePager.Resources pagerResources = GWT
				.create(SimplePager.Resources.class);

		pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0,
				true);
		
		pager.setDisplay(cellTable);

		final SingleSelectionModel<ContactInfo> selectionModel = new SingleSelectionModel<ContactInfo>();

		cellTable.setSelectionModel(selectionModel);
		cellTable.addDomHandler(new DoubleClickHandler() {

			@Override
			public void onDoubleClick(final DoubleClickEvent event) {

				ContactInfo selected = selectionModel.getSelectedObject();
				if (selected != null) {
					// DO YOUR STUFF

					Window.alert("" + selected.getFirstName());

				}

			}
		}, DoubleClickEvent.getType());

		AbstractCell cell = new AbstractCell<String>() {
			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					String value, SafeHtmlBuilder sb) {
				if (value == null) {
					return;
				}

				String style = "style='color:green'";
				style = "background-color:#ddd;";
				sb.appendHtmlConstant("<div style=\"background-color:blue;\">");
				sb.appendEscaped(value);
				sb.appendHtmlConstant("</div>");
			}
		};

		TextCell tt = new TextCell(new SafeHtmlRenderer<String>() {

			@Override
			public void render(String object, SafeHtmlBuilder builder) {
				// TODO Auto-generated method stub

			}

			@Override
			public SafeHtml render(String object) {
				return null;
			}
		});

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

		// cellTable.addDomHandler(new DoubleClickHandler() {
		//
		// @Override
		// public void onDoubleClick(DoubleClickEvent event) {
		// Window.alert(""+event.getSource());
		//
		// }
		// }, DoubleClickEvent.getType());

		// final DecoratedPopupPanel decoratedPopupPanel = new
		// DecoratedPopupPanel();

		cellTable
				.addCellPreviewHandler(new CellPreviewEvent.Handler<ContactInfo>() {

					@Override
					public void onCellPreview(
							CellPreviewEvent<ContactInfo> event) {

						if (BrowserEvents.MOUSEOVER.equals(event
								.getNativeEvent().getType())) {

							// decoratedPopupPanel
							// .ensureDebugId("cwBasicPopup-simplePopup");
							// decoratedPopupPanel.setWidth("150px");
							// decoratedPopupPanel.setWidget(new HTML(event
							// .getValue().getFirstName()
							// + event.getValue().getLastName()));
							//
							// event.getNativeEvent().getClientX();
							//
							// decoratedPopupPanel.setPopupPosition(event
							// .getNativeEvent().getClientX(), event
							// .getNativeEvent().getClientY());
							//
							// decoratedPopupPanel.show();

						}

						else if (BrowserEvents.MOUSEOUT.equals(event
								.getNativeEvent().getType())) {

							// decoratedPopupPanel.hide();
						}

						else if (BrowserEvents.MOUSEUP.equals(event
								.getNativeEvent().getType())) {
						}

						else if (BrowserEvents.MOUSEDOWN.equals(event
								.getNativeEvent().getType())) {

						}

						else if (BrowserEvents.CLICK.equals(event
								.getNativeEvent().getType())) {
							// Window.alert(event.getValue() + ":"
							// + event.getNativeEvent().getType());
						}
					}
				});

		cellTable.addRowHoverHandler(new Handler() {

			@Override
			public void onRowHover(RowHoverEvent event) {

			}
		});

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

		cellTable.addColumnSortHandler(sortHandler);

		dataProvider.addDataDisplay(cellTable);

		TextInputCell textInputCell = new TextInputCell();

		cellTable.addColumn(firstNameColumn, new Header<String>(textInputCell) {

			@Override
			public String getValue() {
				return "Hai";
			}
		});
		cellTable.addColumn(lastNameColumn, "LAST NAME");
		cellTable.addColumn(ageColumn, "AGE");
		cellTable.addColumn(areaColumn, "AREA");
		cellTable.addColumn(countColumn, "FAMILY COUNT");
		cellTable.addColumn(heightColumn, "HEIGHT");
		cellTable.addColumn(houseNoColumn, "HOUSE NO");
		cellTable.addColumn(street1Column, "STREET 1");
		cellTable.addColumn(street2Column, "STREET 2");

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

		widget = binder.createAndBindUi(this);
	}

	private final ListDataProvider<ContactInfo> dataProvider = new ListDataProvider<ContactInfo>();

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField(provided = true)
	CellTable<ContactInfo> cellTable = null;// ew CellTable<Object>();

	@UiField(provided = true)
	SimplePager pager = null;

}

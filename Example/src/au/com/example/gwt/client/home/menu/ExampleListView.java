package au.com.example.gwt.client.home.menu;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.datepicker.client.DateBox;

public class ExampleListView extends ViewImpl implements
		ExampleListPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ExampleListView> {
	}

	@Inject
	public ExampleListView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

//	@UiField
//	DateBox datePickers;
//
//	public DateBox getDatePickers() {
//		return datePickers;
//	}
//
//	public void setDatePickers(DateBox datePickers) {
//		this.datePickers = datePickers;
//	}
}

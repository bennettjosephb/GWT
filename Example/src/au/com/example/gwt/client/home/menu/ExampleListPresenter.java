package au.com.example.gwt.client.home.menu;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;

public class ExampleListPresenter extends
		PresenterWidget<ExampleListPresenter.MyView> {

	public interface MyView extends View {
//		public DateBox getDatePickers();
//
//		public void setDatePickers(DateBox datePickers);
	}

	@Inject
	public ExampleListPresenter(final EventBus eventBus, final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
//		getView().getDatePickers().getDatePicker();
				//.setYearAndMonthDropdownVisible(true);
	//	getView().getDatePickers().getDatePicker();//.setYearArrowsVisible(true);
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

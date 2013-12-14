package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class LoggingView extends ViewImpl implements LoggingPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LoggingView> {
	}

	@Inject
	public LoggingView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button button;
	public Button getButton() {
		return button;
	}

	public void setButton(Button button) {
		this.button = button;
	}
}

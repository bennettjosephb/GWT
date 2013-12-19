package au.com.showcase.application.client.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class FlipDialogView extends ViewImpl implements
		FlipDialogPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, FlipDialogView> {
	}

	@Inject
	public FlipDialogView(final Binder binder) {
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

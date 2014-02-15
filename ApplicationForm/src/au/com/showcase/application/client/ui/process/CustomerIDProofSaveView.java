package au.com.showcase.application.client.ui.process;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class CustomerIDProofSaveView extends ViewImpl implements
		CustomerIDProofSavePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CustomerIDProofSaveView> {
	}

	@Inject
	public CustomerIDProofSaveView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}

package au.com.showcase.application.client.ui.process;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class BeneficiaryDetailsView extends ViewImpl implements
		BeneficiaryDetailsPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, BeneficiaryDetailsView> {
	}

	@Inject
	public BeneficiaryDetailsView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}

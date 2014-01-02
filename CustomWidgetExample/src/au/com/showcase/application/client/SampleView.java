package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlowPanel;

public class SampleView extends ViewImpl implements SamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SampleView> {
	}

	@Inject
	public SampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	FlowPanel radioContainer;
	
	public FlowPanel getRadioContainer() {
		return radioContainer;
	}

	public void setRadioContainer(FlowPanel radioContainer) {
		this.radioContainer = radioContainer;
	}
}

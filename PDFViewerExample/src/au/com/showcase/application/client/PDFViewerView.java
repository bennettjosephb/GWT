package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Frame;

public class PDFViewerView extends ViewImpl implements
		PDFViewerPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, PDFViewerView> {
	}

	@Inject
	public PDFViewerView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Frame url;
	public Frame getUrl() {
		return url;
	}

	public void setUrl(Frame url) {
		this.url = url;
	}
}

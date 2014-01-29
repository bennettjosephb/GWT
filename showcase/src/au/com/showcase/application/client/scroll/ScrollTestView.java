package au.com.showcase.application.client.scroll;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ScrollTestView extends ViewImpl implements
		ScrollTestPresenter.MyView {

	private final Widget widget;

	@UiField
	HTMLPanel footerPanel;

	@UiField
	HTMLPanel headerPanel;

	@UiField
	HTMLPanel contentPanel;

	public interface Binder extends UiBinder<Widget, ScrollTestView> {
	}

	@Inject
	public ScrollTestView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, Widget content) {

		if (slot == ScrollTestPresenter.MAIN_CONTENT_SLOT) {
			// Window.alert("MAIN CONTENT SLOT" );
			contentPanel.clear();
			if (content != null) {
				contentPanel.add(content);
			}
		} else if (slot == ScrollTestPresenter.HEADER_CONTENT_SLOT) {
			// Window.alert("HEADER CONTENT SLOT" );
			headerPanel.clear();
			if (content != null) {
				headerPanel.add(content);
			}
		} else if (slot == ScrollTestPresenter.FOOTER_CONTENT_SLOT) {
			// Window.alert("FOOTER CONTENT SLOT" );
			footerPanel.clear();
			if (content != null) {
				footerPanel.add(content);
			}
		} else {
			// Window.alert("DEFAULT CONTENT SLOT" );
			super.setInSlot(slot, content);
		}
	}
}

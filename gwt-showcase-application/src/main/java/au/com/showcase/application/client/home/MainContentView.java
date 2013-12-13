package au.com.showcase.application.client.home;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class MainContentView extends ViewImpl implements
		MainContentPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, MainContentView> {
	}
	
	@UiField
    HTMLPanel footerPanel;

    @UiField
    HTMLPanel menuPanel;

    @UiField
    HTMLPanel headerPanel;

    @UiField
    HTMLPanel contentPanel;


	@Inject
	public MainContentView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	public Widget asWidget() {
		return widget;
	}
	
	@Override
    public void setInSlot(Object slot, Widget content) {
            if (slot == MainContentPresenter.MENU_CONTENT_SLOT) {
                    menuPanel.clear();
                    if (content != null) {
                            menuPanel.add(content);
                    }
            } else if (slot == MainContentPresenter.MAIN_CONTENT_SLOT) {
                    contentPanel.clear();
                    if (content != null) {
                            contentPanel.add(content);
                    }
            } else {
                    super.setInSlot(slot, content);
            }
    }
}

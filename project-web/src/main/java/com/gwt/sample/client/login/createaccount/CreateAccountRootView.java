package com.gwt.sample.client.login.createaccount;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class CreateAccountRootView extends ViewImpl implements
		CreateAccountRootPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CreateAccountRootView> {
	}

	@Inject
	public CreateAccountRootView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField HTMLPanel contentPanel;
	@UiField HTMLPanel footerPanel;
	@UiField HTMLPanel headerPanel;
	
	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == CreateAccountRootPresenter.HEADER_CONTENT_SLOT) {
			headerPanel.clear();
			if (content != null) {
				headerPanel.add(content);
			}
		} else if (slot == CreateAccountRootPresenter.FOOTER_CONTENT_SLOT) {
			footerPanel.clear();
			if (content != null) {
				footerPanel.add(content);
			}
		} else if (slot == CreateAccountRootPresenter.MAIN_CONTENT_SLOT) {
			contentPanel.clear();
//				content.setHeight((Window.getClientHeight() - 100)+"px");
			if (content != null) {
				contentPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}
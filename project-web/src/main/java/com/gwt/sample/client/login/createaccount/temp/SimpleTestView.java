package com.gwt.sample.client.login.createaccount.temp;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class SimpleTestView extends ViewImpl implements
		SimpleTestPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, SimpleTestView> {
	}

	@Inject
	public SimpleTestView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	HTMLPanel contentPanel;

	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == SimpleTestPresenter.MAIN_CONTENT_SLOT) {
			contentPanel.clear();
			if (content != null) {
				contentPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}

}

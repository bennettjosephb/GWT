package com.sample.client;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ContainerView extends ViewImpl implements
		ContainerPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContainerView> {
	}

	@Inject
	public ContainerView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@UiField
	HTMLPanel northPanel;

	@UiField
	HTMLPanel southPanel;

	@UiField
	HTMLPanel westPanel;

	@UiField
	HTMLPanel eastPanel;

	@UiField
	HTMLPanel centerPanel;

	
	@Override
	public Widget asWidget() {
		return widget;
	}
	
	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == ContainerPresenter.HEADER_CONTENT_SLOT) {
			northPanel.clear();
			if (content != null) {
				northPanel.add(content);
			}
		} else if (slot == ContainerPresenter.FOOTER_CONTENT_SLOT) {
			southPanel.clear();
			if (content != null) {
				southPanel.add(content);
			}
		} else if (slot == ContainerPresenter.MAIN_CONTENT_SLOT) {
			centerPanel.clear();
			if (content != null) {
				centerPanel.add(content);
			}
		} else if (slot == ContainerPresenter.MENU_CONTENT_SLOT) {
			westPanel.clear();
			if (content != null) {
				westPanel.add(content);
			}
		} else if (slot == ContainerPresenter.RIGHT_MENU_CONTENT_SLOT) {
			eastPanel.clear();
			if (content != null) {
				eastPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}

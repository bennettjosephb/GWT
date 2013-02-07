package com.gwt.sample.client.content;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

public class ContentContainerView extends ViewImpl implements
		ContentContainerPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContentContainerView> {
	}

	@UiField
	HTMLPanel southPanel;

	@UiField
	HTMLPanel westPanel;

	@UiField
	HTMLPanel northPanel;

	@UiField
	HTMLPanel centerPanel;

	@Inject
	public ContentContainerView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == ContentContainerPresenter.HEADER_CONTENT_SLOT) {
			northPanel.clear();
			if (content != null) {
				northPanel.add(content);
			}
		} else if (slot == ContentContainerPresenter.FOOTER_CONTENT_SLOT) {
			southPanel.clear();
			if (content != null) {
				southPanel.add(content);
			}
		} else if (slot == ContentContainerPresenter.MAIN_CONTENT_SLOT) {
			centerPanel.clear();
			if (content != null) {
				centerPanel.add(content);
			}
		} else if (slot == ContentContainerPresenter.MENU_CONTENT_SLOT) {
			westPanel.clear();
			if (content != null) {
				westPanel.add(content);
			}
		} else {
			super.setInSlot(slot, content);
		}
	}
}

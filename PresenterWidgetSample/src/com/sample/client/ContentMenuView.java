package com.sample.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ContentMenuView extends ViewImpl implements
		ContentMenuPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContentMenuView> {
	}

	@Inject
	public ContentMenuView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}

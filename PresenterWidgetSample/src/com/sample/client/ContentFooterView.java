package com.sample.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class ContentFooterView extends ViewImpl implements
		ContentFooterPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, ContentFooterView> {
	}

	@Inject
	public ContentFooterView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}

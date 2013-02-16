package com.sample.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class RestrictedView extends ViewImpl implements
		RestrictedPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, RestrictedView> {
	}

	@Inject
	public RestrictedView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}
